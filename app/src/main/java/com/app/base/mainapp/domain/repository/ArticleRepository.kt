package com.app.base.mainapp.domain.repository

import com.app.base.mainapp.data.source.remote.model.request.ArticleRequest
import com.app.base.mainapp.data.source.remote.model.response.ArticleResponse

interface ArticleRepository {
    suspend fun getArticles(
        articleRequest: ArticleRequest?): ArticleResponse
}