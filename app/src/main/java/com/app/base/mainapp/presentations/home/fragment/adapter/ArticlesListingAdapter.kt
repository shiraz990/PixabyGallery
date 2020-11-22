package com.app.base.mainapp.presentations.home.fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import com.app.base.mainapp.R
import com.app.base.mainapp.base.BaseListAdapter
import com.app.base.mainapp.data.source.remote.model.response.ArticleItem
import com.app.base.mainapp.databinding.ItemArticleBinding

class ArticlesListingAdapter(
    private val dataBindingComponent: DataBindingComponent,
    private val clickDetailListener: (item: ArticleItem) -> Unit,
    private val clickBookmarkListener: (item: ArticleItem) -> Unit
) : BaseListAdapter<ArticleItem, ItemArticleBinding>(
    diffCallback = diffCallback
) {


    override fun createBinding(parent: ViewGroup, viewType: Int): ItemArticleBinding {
        val binding = DataBindingUtil.inflate<ItemArticleBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_article,
            parent,
            false,
            dataBindingComponent
        )

        return binding
    }

    override fun bind(binding: ItemArticleBinding, item: ArticleItem, position: Int) {
        binding.article = item
        binding.root.setOnClickListener {
            clickDetailListener(getItem(position))
        }
        binding.bookmark.setOnClickListener {
            clickBookmarkListener(getItem(position))
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
