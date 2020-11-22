package com.app.base.mainapp.databinding;
import com.app.base.mainapp.R;
import com.app.base.mainapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemArticleBookmarkedBindingImpl extends ItemArticleBookmarkedBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.item_cell, 5);
        sViewsWithIds.put(R.id.rl_top, 6);
        sViewsWithIds.put(R.id.rl_bottom, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemArticleBookmarkedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemArticleBookmarkedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.app.base.mainapp.utils.custom_views.CustomTextView) bindings[3]
            , (com.app.base.mainapp.utils.custom_views.CustomTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (com.app.base.mainapp.utils.custom_views.CustomTextView) bindings[2]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            );
        ensureBindingComponentIsNotNull(com.app.base.mainapp.base.FragmentBindingAdapters.class);
        this.articleDate.setTag(null);
        this.articleDesc.setTag(null);
        this.articleImage.setTag(null);
        this.articleTitle.setTag(null);
        this.cardview.setTag(null);
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
        java.lang.String ArticleTitle1 = null;
        java.lang.String ArticleImage1 = null;
        com.app.base.mainapp.data.source.remote.model.response.ArticleItem article = mArticle;
        java.lang.String articleDateTime = null;
        java.lang.String articleDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (article != null) {
                    // read article.title
                    ArticleTitle1 = article.getTitle();
                    // read article.image
                    ArticleImage1 = article.getImage();
                    // read article.dateTime
                    articleDateTime = article.getDateTime();
                    // read article.description
                    articleDescription = article.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.articleDate, articleDateTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.articleDesc, articleDescription);
            this.mBindingComponent.getFragmentBindingAdapters().bindImage(this.articleImage, ArticleImage1, (android.graphics.drawable.Drawable)null);
            this.articleTitle.setText(ArticleTitle1);
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