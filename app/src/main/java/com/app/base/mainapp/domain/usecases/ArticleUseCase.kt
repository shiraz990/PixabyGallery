package com.app.base.mainapp.domain.usecases

import com.app.base.mainapp.data.source.remote.ApiErrorHandle
import com.app.base.mainapp.data.source.remote.model.request.ArticleRequest
import com.app.base.mainapp.data.source.remote.model.response.ArticleResponse
import com.app.base.mainapp.domain.repository.ArticleRepository
import com.app.base.mainapp.domain.usecases.base.BaseUseCase

class ArticleUseCase (
    private var articleRepository: ArticleRepository,
    private val apiErrorHandle: ApiErrorHandle
) : BaseUseCase<ArticleResponse, ArticleRequest>(apiErrorHandle){

    override suspend fun run(articleRequest: ArticleRequest?): ArticleResponse {
        return articleRepository.getArticles(articleRequest)
    }
}