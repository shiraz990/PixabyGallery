package com.app.base.mainapp.data.repository

import com.app.base.mainapp.data.source.remote.ApiInterface
import com.app.base.mainapp.data.source.remote.model.request.ArticleRequest
import com.app.base.mainapp.data.source.remote.model.response.ArticleResponse
import com.app.base.mainapp.domain.repository.ArticleRepository

class ArticleRepositoryImpl(private var apiInterface: ApiInterface) :
    ArticleRepository {
    override suspend fun getArticles(articleRequest: ArticleRequest?): ArticleResponse {
        return apiInterface.topArticle(articleRequest?.section,articleRequest?.key)
    }
}