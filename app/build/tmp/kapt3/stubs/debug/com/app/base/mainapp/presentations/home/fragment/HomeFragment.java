package com.app.base.mainapp.presentations.home.fragment;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u0006\u0010\u0018\u001a\u00020\u0015J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cJ&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/app/base/mainapp/presentations/home/fragment/HomeFragment;", "Lcom/app/base/mainapp/base/BaseFragment;", "()V", "adapter", "Lcom/app/base/mainapp/presentations/home/fragment/HomeFragment$TablayoutAdapter;", "getAdapter", "()Lcom/app/base/mainapp/presentations/home/fragment/HomeFragment$TablayoutAdapter;", "setAdapter", "(Lcom/app/base/mainapp/presentations/home/fragment/HomeFragment$TablayoutAdapter;)V", "articleListingDataObserver", "Landroidx/lifecycle/Observer;", "Lcom/app/base/mainapp/data/source/remote/model/response/ArticleResponse;", "binding", "Lcom/app/base/mainapp/databinding/FragmentHomeBinding;", "viewModel", "Lcom/app/base/mainapp/presentations/home/HomeViewModel;", "getViewModel", "()Lcom/app/base/mainapp/presentations/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addObservers", "", "Lcom/app/base/mainapp/base/BaseViewModel;", "initTabLayout", "initViewPager", "intializeListener", "navigateToDetail", "articleItem", "Lcom/app/base/mainapp/data/source/remote/model/response/ArticleItem;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "TablayoutAdapter", "app_debug"})
public final class HomeFragment extends com.app.base.mainapp.base.BaseFragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private com.app.base.mainapp.databinding.FragmentHomeBinding binding;
    @org.jetbrains.annotations.Nullable()
    private com.app.base.mainapp.presentations.home.fragment.HomeFragment.TablayoutAdapter adapter;
    private final androidx.lifecycle.Observer<com.app.base.mainapp.data.source.remote.model.response.ArticleResponse> articleListingDataObserver = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.app.base.mainapp.presentations.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.app.base.mainapp.presentations.home.fragment.HomeFragment.TablayoutAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    com.app.base.mainapp.presentations.home.fragment.HomeFragment.TablayoutAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void intializeListener() {
    }
    
    private final void initTabLayout() {
    }
    
    public final void initViewPager() {
    }
    
    public final void navigateToDetail(@org.jetbrains.annotations.NotNull()
    com.app.base.mainapp.data.source.remote.model.response.ArticleItem articleItem) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addObservers() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.app.base.mainapp.base.BaseViewModel getViewModel() {
        return null;
    }
    
    public HomeFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u0005H\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0005J\b\u0010#\u001a\u00020\u000fH\u0002J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, d2 = {"Lcom/app/base/mainapp/presentations/home/fragment/HomeFragment$TablayoutAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "mNumOfTabs", "", "binding", "Lcom/app/base/mainapp/databinding/FragmentHomeBinding;", "(Landroidx/fragment/app/FragmentManager;ILcom/app/base/mainapp/databinding/FragmentHomeBinding;)V", "bookmarkedArticlesTabFragment", "Lcom/app/base/mainapp/presentations/home/fragment/BookmarkedArticlesFragment;", "getBookmarkedArticlesTabFragment", "()Lcom/app/base/mainapp/presentations/home/fragment/BookmarkedArticlesFragment;", "registeredFragments", "Landroid/util/SparseArray;", "Landroidx/fragment/app/Fragment;", "getRegisteredFragments", "()Landroid/util/SparseArray;", "setRegisteredFragments", "(Landroid/util/SparseArray;)V", "topArticlesTabFragment", "Lcom/app/base/mainapp/presentations/home/fragment/TopArticlesFragment;", "getTopArticlesTabFragment", "()Lcom/app/base/mainapp/presentations/home/fragment/TopArticlesFragment;", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "object", "", "getBookmarkedFragment", "getCount", "getItem", "getRegisteredFragment", "getTopArticlesTab", "instantiateItem", "app_debug"})
    public static final class TablayoutAdapter extends androidx.fragment.app.FragmentStatePagerAdapter {
        @org.jetbrains.annotations.NotNull()
        private android.util.SparseArray<androidx.fragment.app.Fragment> registeredFragments;
        private final int mNumOfTabs = 0;
        private final com.app.base.mainapp.databinding.FragmentHomeBinding binding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.util.SparseArray<androidx.fragment.app.Fragment> getRegisteredFragments() {
            return null;
        }
        
        public final void setRegisteredFragments(@org.jetbrains.annotations.NotNull()
        android.util.SparseArray<androidx.fragment.app.Fragment> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment getItem(int position) {
            return null;
        }
        
        private final androidx.fragment.app.Fragment getTopArticlesTab() {
            return null;
        }
        
        private final androidx.fragment.app.Fragment getBookmarkedFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.base.mainapp.presentations.home.fragment.TopArticlesFragment getTopArticlesTabFragment() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.app.base.mainapp.presentations.home.fragment.BookmarkedArticlesFragment getBookmarkedArticlesTabFragment() {
            return null;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.Object instantiateItem(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup container, int position) {
            return null;
        }
        
        @java.lang.Override()
        public void destroyItem(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup container, int position, @org.jetbrains.annotations.NotNull()
        java.lang.Object object) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.Fragment getRegisteredFragment(int position) {
            return null;
        }
        
        public TablayoutAdapter(@org.jetbrains.annotations.Nullable()
        androidx.fragment.app.FragmentManager fm, int mNumOfTabs, @org.jetbrains.annotations.NotNull()
        com.app.base.mainapp.databinding.FragmentHomeBinding binding) {
            super(null);
        }
    }
}