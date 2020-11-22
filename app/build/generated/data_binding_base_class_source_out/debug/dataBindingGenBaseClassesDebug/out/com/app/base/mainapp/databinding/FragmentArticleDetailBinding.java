// Generated by data binding compiler. Do not edit!
package com.app.base.mainapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.base.mainapp.R;
import com.app.base.mainapp.data.source.remote.model.response.ArticleItem;
import com.app.base.mainapp.utils.custom_views.CustomTextView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentArticleDetailBinding extends ViewDataBinding {
  @NonNull
  public final CustomTextView articleDate;

  @NonNull
  public final CustomTextView articleDesc;

  @NonNull
  public final AppCompatImageView articleImage;

  @NonNull
  public final CustomTextView articleTitle;

  @NonNull
  public final ConstraintLayout rlBottom;

  @NonNull
  public final ConstraintLayout rlTop;

  @Bindable
  protected ArticleItem mArticle;

  protected FragmentArticleDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CustomTextView articleDate, CustomTextView articleDesc, AppCompatImageView articleImage,
      CustomTextView articleTitle, ConstraintLayout rlBottom, ConstraintLayout rlTop) {
    super(_bindingComponent, _root, _localFieldCount);
    this.articleDate = articleDate;
    this.articleDesc = articleDesc;
    this.articleImage = articleImage;
    this.articleTitle = articleTitle;
    this.rlBottom = rlBottom;
    this.rlTop = rlTop;
  }

  public abstract void setArticle(@Nullable ArticleItem article);

  @Nullable
  public ArticleItem getArticle() {
    return mArticle;
  }

  @NonNull
  public static FragmentArticleDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_article_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArticleDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentArticleDetailBinding>inflateInternal(inflater, R.layout.fragment_article_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentArticleDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_article_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentArticleDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentArticleDetailBinding>inflateInternal(inflater, R.layout.fragment_article_detail, null, false, component);
  }

  public static FragmentArticleDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentArticleDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentArticleDetailBinding)bind(component, view, R.layout.fragment_article_detail);
  }
}