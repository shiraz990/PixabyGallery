package com.app.base.mainapp.presentations.detail.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.base.BaseFragment
import com.app.base.mainapp.data.source.remote.model.response.ArticleItem
import com.app.base.mainapp.databinding.FragmentArticleDetailBinding
import com.app.base.mainapp.utils.*
import com.app.base.mainapp.utils.AppUtils
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.app_bar_main.*

/**
 * A simple [Fragment] subclass.
 */
class ArticleDetailFragment : BaseFragment() {

    private lateinit var binding: FragmentArticleDetailBinding
    private lateinit var articleItem: ArticleItem
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        AppUtils.setTitleToolbar(
            requireActivity().tool_bar,
            requireContext().resources.getString(R.string.article_detail_label)
        )

        if (!this::binding.isInitialized) {
            binding =
                DataBindingUtil.inflate(inflater, R.layout.fragment_article_detail, null, false)
        }
        articleItem=arguments?.getParcelable(Constants.ARTICLE_ITEM) ?: ArticleItem()
        binding.article = articleItem



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        Glide.with(this).load(articleItem.image)
            .placeholder(R.mipmap.ic_icon)
            .into(binding.articleImage)

    }


    override fun getViewModel(): BaseViewModel? {
        return null
    }
}
