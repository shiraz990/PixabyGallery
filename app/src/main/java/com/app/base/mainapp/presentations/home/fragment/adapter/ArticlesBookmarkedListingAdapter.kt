package com.app.base.mainapp.presentations.home.fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseListAdapter
import com.app.base.mainapp.data.source.remote.model.response.ArticleItem
import com.app.base.mainapp.databinding.ItemArticleBookmarkedBinding

class ArticlesBookmarkedListingAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val clickListener: (item: ArticleItem) -> Unit
) : BaseListAdapter<ArticleItem, ItemArticleBookmarkedBinding>(
    diffCallback = diffCallback
) {


    override fun createBinding(parent: ViewGroup, viewType: Int): ItemArticleBookmarkedBinding {
        val binding = DataBindingUtil.inflate<ItemArticleBookmarkedBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_article_bookmarked,
            parent,
            false,
            dataBindingComponent
        )

        return binding
    }

    override fun bind(binding: ItemArticleBookmarkedBinding, item: ArticleItem, position: Int) {
        binding.article = item
        binding.root.setOnClickListener {
            clickListener(getItem(position))
        }
    }


}

private val diffCallback: DiffUtil.ItemCallback<ArticleItem> =
    object : DiffUtil.ItemCallback<ArticleItem>() {
        override fun areItemsTheSame(oldItem: ArticleItem, newItem: ArticleItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ArticleItem, newItem: ArticleItem): Boolean {
            return oldItem.title == newItem.title
        }
    }
