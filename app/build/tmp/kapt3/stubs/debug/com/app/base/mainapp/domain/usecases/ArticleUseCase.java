package com.app.base.mainapp.domain.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/app/base/mainapp/domain/usecases/ArticleUseCase;", "Lcom/app/base/mainapp/domain/usecases/base/BaseUseCase;", "Lcom/app/base/mainapp/data/source/remote/model/response/ArticleResponse;", "Lcom/app/base/mainapp/data/source/remote/model/request/ArticleRequest;", "articleRepository", "Lcom/app/base/mainapp/domain/repository/ArticleRepository;", "apiErrorHandle", "Lcom/app/base/mainapp/data/source/remote/ApiErrorHandle;", "(Lcom/app/base/mainapp/domain/repository/ArticleRepository;Lcom/app/base/mainapp/data/source/remote/ApiErrorHandle;)V", "run", "articleRequest", "(Lcom/app/base/mainapp/data/source/remote/model/request/ArticleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ArticleUseCase extends com.app.base.mainapp.domain.usecases.base.BaseUseCase<com.app.base.mainapp.data.source.remote.model.response.ArticleResponse, com.app.base.mainapp.data.source.remote.model.request.ArticleRequest> {
    private com.app.base.mainapp.domain.repository.ArticleRepository articleRepository;
    private final com.app.base.mainapp.data.source.remote.ApiErrorHandle apiErrorHandle = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object run(@org.jetbrains.annotations.Nullable()
    com.app.base.mainapp.data.source.remote.model.request.ArticleRequest articleRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.app.base.mainapp.data.source.remote.model.response.ArticleResponse> p1) {
        return null;
    }
    
    public ArticleUseCase(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.domain.repository.ArticleRepository articleRepository, @org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.data.source.remote.ApiErrorHandle apiErrorHandle) {
        super(null);
    }
}