package com.app.base.mainapp.presentations.home.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseFragment
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.base.MyDataBindingComponent
import com.app.base.mainapp.data.source.local.DatabaseManager
import com.app.base.mainapp.data.source.remote.model.response.ArticleItem
import com.app.base.mainapp.data.source.remote.model.response.ArticleResponse
import com.app.base.mainapp.databinding.FragmentTopArticleBinding
import com.app.base.mainapp.presentations.home.fragment.adapter.ArticlesListingAdapter
import com.app.base.mainapp.utils.AppUtils
import com.app.base.mainapp.utils.Constants
import com.app.base.mainapp.utils.gone
import com.app.base.mainapp.utils.visible
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.item_article.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

/**
 * A simple [Fragment] subclass.
 */
class TopArticlesFragment : BaseFragment() {

    private lateinit var binding: FragmentTopArticleBinding
    private lateinit var articlesListingAdapter: ArticlesListingAdapter
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
                DataBindingUtil.inflate(inflater, R.layout.fragment_top_article, null, false)
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        articlesListingAdapter  = ArticlesListingAdapter(dataBindingComponent ,{

            if ((parentFragment as HomeFragment) != null) {

                (parentFragment as HomeFragment).navigateToDetail(it)

            }

        },{

            val  articleList = DatabaseManager.getInstance(activity).allArticles
            val  bookMarkedAticleList = ArrayList<ArticleItem>()
            var itemExist =false
            if(articleList.size>0){
                for (results in  articleList){
                    if(results.publishedDate== it!!.publishedDate) {
                        itemExist=true
                    }
                }

                if(!itemExist){
                    bookMarkedAticleList.add(it)
                    if ((parentFragment as HomeFragment).adapter != null) {
                        val bookmarkedArticlesFragment: BookmarkedArticlesFragment = (parentFragment as HomeFragment).adapter?.bookmarkedArticlesTabFragment!!
                        if(bookmarkedArticlesFragment!=null) {
                            bookmarkedArticlesFragment.setBookmarkArticles(bookMarkedAticleList)
                        }

                    }
                }
            }
            else{

                bookMarkedAticleList.add(it)
                if ((parentFragment as HomeFragment).adapter != null) {
                    val bookmarkedArticlesFragment: BookmarkedArticlesFragment = (parentFragment as HomeFragment).adapter?.bookmarkedArticlesTabFragment!!
                    if(bookmarkedArticlesFragment!=null) {
                        bookmarkedArticlesFragment.setBookmarkArticles(bookMarkedAticleList)
                    }

                }
            }


        })
    }

    private fun addObservers() {

    }

    fun setTopArticles(articleResponse: ArticleResponse?) {

        binding.clShimmer.gone()
        binding.clArticle.visible()

        val  articleList = ArrayList<ArticleItem>()
        var  id = 0
        for (results in  articleResponse!!.results){

            var imgUrl:String =""
            if(!results.multimedia.isNullOrEmpty()) {
                for (media in results.multimedia) {
                    if (media.format.contains(Constants.FORMAT_IMAGE)) {
                        imgUrl = media.url
                    }
                }
                id += 1
            }


            val format = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US)
            format.timeZone = TimeZone.getTimeZone("GMT")
            val newDate = format.parse(results.published_date)


            val finalDateFormat = SimpleDateFormat("dd/MM/yyyy - HH:mm:ss", Locale.US)
            val formattedDateStr = finalDateFormat.format(newDate)

            val article = ArticleItem()
            article.id= id.toInt()
            article.title=results.title
            article.dateTime=formattedDateStr
            article.publishedDate=results.published_date
            article.subject=results.title
            article.image=imgUrl
            article.description=results.abstract
            articleList.add(article)
        }

        articlesListingAdapter.submitList(articleList)
        binding.rvArticles.adapter=articlesListingAdapter

    }

    override fun getViewModel(): BaseViewModel? {
        return null
    }
}
