package com.app.base.mainapp.presentations.home.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseFragment
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.base.MyDataBindingComponent
import com.app.base.mainapp.data.source.local.DatabaseManager
import com.app.base.mainapp.data.source.remote.model.response.ArticleItem
import com.app.base.mainapp.databinding.FragmentBookmarkedArticleBinding
import com.app.base.mainapp.presentations.home.fragment.adapter.ArticlesBookmarkedListingAdapter
import com.app.base.mainapp.presentations.home.fragment.component.MarginDecoration
import com.app.base.mainapp.utils.AppUtils
import kotlinx.android.synthetic.main.app_bar_main.*

/**
 * A simple [Fragment] subclass.
 */
class BookmarkedArticlesFragment : BaseFragment() {

    private lateinit var binding: FragmentBookmarkedArticleBinding

    private lateinit var articlesListingAdapter: ArticlesBookmarkedListingAdapter
    private var dataBindingComponent = MyDataBindingComponent(this)
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
                DataBindingUtil.inflate(inflater, R.layout.fragment_bookmarked_article, null, false)
            initializeListener()
        }

        return binding.root
    }

    private fun initializeListener() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        articlesListingAdapter  = ArticlesBookmarkedListingAdapter(dataBindingComponent) {
            if ((parentFragment as HomeFragment) != null) {

                (parentFragment as HomeFragment).navigateToDetail(it)

            }

        }

        binding.rvBookmarkedArticles.layoutManager = GridLayoutManager(activity, 2)
        binding.rvBookmarkedArticles.addItemDecoration(MarginDecoration(activity))

    }
    fun setBookmarkArticles(articleList : List<ArticleItem>) {

        DatabaseManager.getInstance(activity).saveArticle(articleList)



    }


    fun getBookmarkArticles() {

        val  articleList = DatabaseManager.getInstance(activity).allArticles


        articlesListingAdapter.submitList(articleList)
        binding.rvBookmarkedArticles.adapter=articlesListingAdapter

    }

    override fun getViewModel(): BaseViewModel? {
        return null
    }
}
