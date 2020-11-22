package com.app.base.mainapp.presentations.home.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.Observer
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseFragment
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.data.source.remote.model.request.ArticleRequest
import com.app.base.mainapp.data.source.remote.model.response.ArticleItem
import com.app.base.mainapp.data.source.remote.model.response.ArticleResponse
import com.app.base.mainapp.databinding.FragmentHomeBinding
import com.app.base.mainapp.presentations.detail.ArticleDetailActivity
import com.app.base.mainapp.presentations.home.HomeViewModel
import com.app.base.mainapp.utils.AppUtils
import com.app.base.mainapp.utils.Constants
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import kotlinx.android.synthetic.main.app_bar_main.*
import org.koin.android.viewmodel.ext.android.viewModel

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : BaseFragment() {

     private val viewModel: HomeViewModel by viewModel()
     private lateinit var binding: FragmentHomeBinding

     var adapter: TablayoutAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        AppUtils.setTitleToolbar(
            requireActivity().tool_bar,
            requireContext().resources.getString(R.string.ny_times_label)
        )

        if (!this::binding.isInitialized) {
            binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false)
            intializeListener()
        }

        return binding.root
    }

    private fun intializeListener() {
        initTabLayout()

    }



    private fun initTabLayout() {
        if (adapter != null) return
        binding.tabLayout.removeAllTabs()
        val topArticleTab: TabLayout.Tab =
            binding.tabLayout.newTab().setText(getString(R.string.tab_top_articles))
                .setTag(Constants.TOP_ARTICLES_TAB)
        binding.tabLayout.addTabs(topArticleTab, true)
        binding.headerLayout.visibility = View.VISIBLE
        val bookmarkedTab: TabLayout.Tab =
            binding.tabLayout.newTab().setText(getString(R.string.tab_bookmarked_articles)).setTag(
                Constants.BOOKMARKED_TAB
            )
        binding.tabLayout.addTabs(bookmarkedTab, true)
       adapter =
            TablayoutAdapter(
                childFragmentManager, binding.tabLayout.tabCount, binding
            )

        val onTabSelectedListener: OnTabSelectedListener = object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                binding.viewPager.currentItem = tab.position
            }

            override fun onTabReselected(tab: TabLayout.Tab) {}
            override fun onTabUnselected(tab: TabLayout.Tab) {}
        }
        binding.tabLayout.addOnTabSelectedListener(onTabSelectedListener)
        initViewPager()
    }
    fun initViewPager() {
        binding.viewPager.adapter = adapter
        binding.viewPager.isSelected = true
        binding.viewPager.isFocusable = true
        binding.viewPager.offscreenPageLimit = 3
        binding.viewPager.addOnPageChangeListener(object :
            TabLayoutOnPageChangeListener(binding.tabLayout) {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                if (position == 1) {
                    if (adapter != null) {
                        val bookmarkedArticlesFragment: BookmarkedArticlesFragment =
                            adapter?.bookmarkedArticlesTabFragment!!
                        if (bookmarkedArticlesFragment != null) {
                            bookmarkedArticlesFragment.getBookmarkArticles()
                        }

                    }
                }
                Log.e("onPageSelected", " positoin $position")

            }
        })
    }

    class TablayoutAdapter(
        fm: FragmentManager?,
        private val mNumOfTabs: Int,
        private val binding: FragmentHomeBinding

    ) :
        FragmentStatePagerAdapter(fm!!) {
        var registeredFragments = SparseArray<Fragment>()
        override fun getItem(position: Int): Fragment {
            if (mNumOfTabs < 3) {
                binding.tabLayout.tabMode = TabLayout.MODE_FIXED
            } else {
                binding.tabLayout.tabMode = TabLayout.MODE_SCROLLABLE
            }
            val tab: TabLayout.Tab? = binding.tabLayout.getTabAt(position)
            return if (tab != null && tab.tag != null) {
                when (tab.tag as String?) {
                    Constants.BOOKMARKED_TAB -> {
                        Log.d("bookmarked_articles", "position $position")
                        getBookmarkedFragment()
                    }
                    Constants.TOP_ARTICLES_TAB -> {
                        Log.d("top_articles", "position $position")
                        getTopArticlesTab()
                    }
                    else ->
                    {
                        Log.d("top_articles", "position $position")
                        getTopArticlesTab()
                    }
                }
            } else getTopArticlesTab()
        }

        private fun getTopArticlesTab(): Fragment {
            return TopArticlesFragment()
        }

        private fun getBookmarkedFragment(): Fragment {

            return  BookmarkedArticlesFragment()
        }

        val topArticlesTabFragment: TopArticlesFragment?
            get() {
                for (i in 0 until count) {
                    val fragment = getRegisteredFragment(i)
                    if (fragment is TopArticlesFragment) {
                        return fragment as TopArticlesFragment
                    }
                }
                return null
            }
        val bookmarkedArticlesTabFragment: BookmarkedArticlesFragment?
            get() {
                for (i in 0 until count) {

                    val fragment = getRegisteredFragment(i)
                    if (fragment is BookmarkedArticlesFragment) {
                        return fragment as BookmarkedArticlesFragment
                    }
                }
                return null
            }


        override fun getCount(): Int {
            return mNumOfTabs
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val fragment = super.instantiateItem(container, position) as Fragment
            registeredFragments.put(position, fragment)
            return fragment
        }

        override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
            registeredFragments.remove(position)
            super.destroyItem(container, position, `object`)
        }
        fun getRegisteredFragment(position: Int): Fragment {
            return registeredFragments[position]

        }

    }


    fun navigateToDetail(articleItem: ArticleItem){

        val intent = Intent(activity, ArticleDetailActivity::class.java)
        val args = Bundle()
        args.putParcelable(Constants.ARTICLE_ITEM, articleItem)
        intent.putExtras(args)
        startActivity(intent)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var  request = ArticleRequest()
        request.key = getString(R.string.api_key)
        request.section= getString(R.string.section)
        viewModel.getArticles(request)


        viewModel.articlesLiveData().observe(viewLifecycleOwner, articleListingDataObserver)


    }

    private val articleListingDataObserver = Observer<ArticleResponse> {
        it.let {
            if (it.results.isEmpty()) {

            } else {
                if (adapter != null) {
                    val topArticlesFragment: TopArticlesFragment = adapter?.topArticlesTabFragment!!
                    if(topArticlesFragment!=null) {
                        topArticlesFragment.setTopArticles(it)
                    }

                }

            }
        }
    }


    private fun addObservers() {

    }

    override fun getViewModel(): BaseViewModel? {
        return viewModel
    }
}
