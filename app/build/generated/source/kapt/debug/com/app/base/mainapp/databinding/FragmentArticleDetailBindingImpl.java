package com.app.base.mainapp.databinding;
import com.app.base.mainapp.R;
import com.app.base.mainapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentArticleDetailBindingImpl extends FragmentArticleDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_top, 4);
        sViewsWithIds.put(R.id.article_image, 5);
        sViewsWithIds.put(R.id.rl_bottom, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentArticleDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentArticleDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.app.base.mainapp.utils.custom_views.CustomTextView) bindings[2]
            , (com.app.base.mainapp.utils.custom_views.CustomTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (com.app.base.mainapp.utils.custom_views.CustomTextView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            );
        this.articleDate.setTag(null);
        this.articleDesc.setTag(null);
        this.articleTitle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.article == variableId) {
            setArticle((com.app.base.mainapp.data.source.remote.model.response.ArticleItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArticle(@Nullable com.app.base.mainapp.data.source.remote.model.response.ArticleItem Article) {
        this.mArticle = Article;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.article);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.app.base.mainapp.data.source.remote.model.response.ArticleItem article = mArticle;
        java.lang.String articleDateTime = null;
        java.lang.String ArticleTitle1 = null;
        java.lang.String articleDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (article != null) {
                    // read article.dateTime
                    articleDateTime = article.getDateTime();
                    // read article.title
                    ArticleTitle1 = article.getTitle();
                    // read article.description
                    articleDescription = article.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.articleDate, articleDateTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.articleDesc, articleDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.articleTitle, ArticleTitle1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): article
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}