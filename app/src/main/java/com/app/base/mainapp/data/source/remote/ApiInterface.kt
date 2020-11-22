package com.app.base.mainapp.data.source.remote

import com.app.base.mainapp.data.source.remote.model.response.ArticleResponse
import com.app.base.mainapp.utils.Constants.ARTICLE
import retrofit2.http.*


interface ApiInterface {
    @GET(ARTICLE)
    suspend fun topArticle(@Path( value ="section") part :String?,
                      @Query("api-key") apiKey: String?): ArticleResponse
}