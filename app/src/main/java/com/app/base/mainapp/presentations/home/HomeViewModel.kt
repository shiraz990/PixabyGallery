package com.app.base.mainapp.presentations.home

import androidx.lifecycle.MutableLiveData
import com.app.base.mainapp.base.BaseViewModel
import com.app.base.mainapp.data.source.remote.model.ErrorModel
import com.app.base.mainapp.data.source.remote.model.request.ArticleRequest
import com.app.base.mainapp.data.source.remote.model.response.ArticleResponse
import com.app.base.mainapp.domain.usecases.*
import com.app.base.mainapp.domain.usecases.base.Outcome
import com.app.base.mainapp.domain.usecases.base.UseCaseResponse

class HomeViewModel (
    private var loginUseCase: ArticleUseCase
): BaseViewModel(){

    private val articlesLiveData = MutableLiveData<ArticleResponse>()

    fun articlesLiveData() = articlesLiveData

    fun getArticles(request: ArticleRequest) {
        outcomeLiveData.value = Outcome.Start<Any>()
        loginUseCase.invoke(
            scope,
            request,
            object : UseCaseResponse<ArticleResponse> {
                override fun onSuccess(result: ArticleResponse) {
                    outcomeLiveData.value = Outcome.End<Any>()
                    result.let {
                        articlesLiveData.value = result
                    }
                }

                override fun onError(errorModel: ErrorModel?) {
                    outcomeLiveData.value = Outcome.Failure<Any>(errorModel)
                }
            })
    }
}