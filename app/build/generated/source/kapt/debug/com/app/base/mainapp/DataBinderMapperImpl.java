package com.app.base.mainapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.app.base.mainapp.databinding.ActivityBaseBindingImpl;
import com.app.base.mainapp.databinding.FragmentArticleDetailBindingImpl;
import com.app.base.mainapp.databinding.FragmentBookmarkedArticleBindingImpl;
import com.app.base.mainapp.databinding.FragmentHomeBindingImpl;
import com.app.base.mainapp.databinding.FragmentTopArticleBindingImpl;
import com.app.base.mainapp.databinding.ItemArticleBindingImpl;
import com.app.base.mainapp.databinding.ItemArticleBookmarkedBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYBASE = 1;

  private static final int LAYOUT_FRAGMENTARTICLEDETAIL = 2;

  private static final int LAYOUT_FRAGMENTBOOKMARKEDARTICLE = 3;

  private static final int LAYOUT_FRAGMENTHOME = 4;

  private static final int LAYOUT_FRAGMENTTOPARTICLE = 5;

  private static final int LAYOUT_ITEMARTICLE = 6;

  private static final int LAYOUT_ITEMARTICLEBOOKMARKED = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.activity_base, LAYOUT_ACTIVITYBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.fragment_article_detail, LAYOUT_FRAGMENTARTICLEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.fragment_bookmarked_article, LAYOUT_FRAGMENTBOOKMARKEDARTICLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.fragment_top_article, LAYOUT_FRAGMENTTOPARTICLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.item_article, LAYOUT_ITEMARTICLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.app.base.mainapp.R.layout.item_article_bookmarked, LAYOUT_ITEMARTICLEBOOKMARKED);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYBASE: {
          if ("layout/activity_base_0".equals(tag)) {
            return new ActivityBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_base is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTARTICLEDETAIL: {
          if ("layout/fragment_article_detail_0".equals(tag)) {
            return new FragmentArticleDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_article_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOOKMARKEDARTICLE: {
          if ("layout/fragment_bookmarked_article_0".equals(tag)) {
            return new FragmentBookmarkedArticleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_bookmarked_article is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTOPARTICLE: {
          if ("layout/fragment_top_article_0".equals(tag)) {
            return new FragmentTopArticleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_top_article is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMARTICLE: {
          if ("layout/item_article_0".equals(tag)) {
            return new ItemArticleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_article is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMARTICLEBOOKMARKED: {
          if ("layout/item_article_bookmarked_0".equals(tag)) {
            return new ItemArticleBookmarkedBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_article_bookmarked is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "article");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_base_0", com.app.base.mainapp.R.layout.activity_base);
      sKeys.put("layout/fragment_article_detail_0", com.app.base.mainapp.R.layout.fragment_article_detail);
      sKeys.put("layout/fragment_bookmarked_article_0", com.app.base.mainapp.R.layout.fragment_bookmarked_article);
      sKeys.put("layout/fragment_home_0", com.app.base.mainapp.R.layout.fragment_home);
      sKeys.put("layout/fragment_top_article_0", com.app.base.mainapp.R.layout.fragment_top_article);
      sKeys.put("layout/item_article_0", com.app.base.mainapp.R.layout.item_article);
      sKeys.put("layout/item_article_bookmarked_0", com.app.base.mainapp.R.layout.item_article_bookmarked);
    }
  }
}
