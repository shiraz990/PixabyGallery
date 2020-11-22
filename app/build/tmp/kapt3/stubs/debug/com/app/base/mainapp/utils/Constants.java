package com.app.base.mainapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/app/base/mainapp/utils/Constants;", "", "()V", "ARTICLE", "", "ARTICLE_ITEM", "BOOKMARKED_TAB", "DATE_TIME_FIELD", "DESCRIPTION_FIELD", "FORMAT_IMAGE", "ID_FIELD", "IMAGE_FIELD", "LANGUAGE_AR", "LANGUAGE_ENGLISH", "SELECTED_LANGUAGE", "getSELECTED_LANGUAGE", "()Ljava/lang/String;", "setSELECTED_LANGUAGE", "(Ljava/lang/String;)V", "SUBJECT_FIELD", "SUCCESS_CODE", "", "TITLE_FIELD", "TOP_ARTICLES_TAB", "VIA_NOTIFICATION", "current_locale", "Ljava/util/Locale;", "getCurrent_locale", "()Ljava/util/Locale;", "setCurrent_locale", "(Ljava/util/Locale;)V", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOP_ARTICLES_TAB = "TOP_ARTICLES";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BOOKMARKED_TAB = "BOOKMARKED_ARTICLES";
    @org.jetbrains.annotations.NotNull()
    public static java.util.Locale current_locale;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANGUAGE_ENGLISH = "en";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LANGUAGE_AR = "ar";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String SELECTED_LANGUAGE;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE_ITEM = "article_item";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ID_FIELD = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TITLE_FIELD = "title";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATE_TIME_FIELD = "dateTime";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUBJECT_FIELD = "subject";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_FIELD = "image";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DESCRIPTION_FIELD = "description";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FORMAT_IMAGE = "superJumbo";
    public static final int SUCCESS_CODE = 0;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VIA_NOTIFICATION = "via_notification";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARTICLE = "{section}.json";
    public static final com.app.base.mainapp.utils.Constants INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Locale getCurrent_locale() {
        return null;
    }
    
    public final void setCurrent_locale(@org.jetbrains.annotations.NotNull()
    java.util.Locale p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSELECTED_LANGUAGE() {
        return null;
    }
    
    public final void setSELECTED_LANGUAGE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private Constants() {
        super();
    }
}