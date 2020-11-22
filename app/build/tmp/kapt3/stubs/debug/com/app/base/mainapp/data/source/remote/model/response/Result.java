package com.app.base.mainapp.data.source.remote.model.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00bb\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u00c6\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u00e5\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020FH\u00d6\u0001J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001aR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001a\u00a8\u0006H"}, d2 = {"Lcom/app/base/mainapp/data/source/remote/model/response/Result;", "", "section", "", "subsection", "title", "abstract", "url", "uri", "byline", "item_type", "updated_date", "created_date", "published_date", "material_type_facet", "kicker", "des_facet", "", "org_facet", "per_facet", "geo_facet", "multimedia", "Lcom/app/base/mainapp/data/source/remote/model/response/Multimedia;", "short_url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAbstract", "()Ljava/lang/String;", "getByline", "getCreated_date", "getDes_facet", "()Ljava/util/List;", "getGeo_facet", "getItem_type", "getKicker", "getMaterial_type_facet", "getMultimedia", "getOrg_facet", "getPer_facet", "getPublished_date", "getSection", "getShort_url", "getSubsection", "getTitle", "getUpdated_date", "getUri", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Result {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String section = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String subsection = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String uri = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String byline = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String item_type = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String updated_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String created_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String published_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String material_type_facet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String kicker = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> des_facet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> org_facet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> per_facet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> geo_facet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.app.base.mainapp.data.source.remote.model.response.Multimedia> multimedia = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String short_url = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubsection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbstract() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getByline() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItem_type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUpdated_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreated_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPublished_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMaterial_type_facet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKicker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDes_facet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOrg_facet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPer_facet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGeo_facet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.base.mainapp.data.source.remote.model.response.Multimedia> getMultimedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getShort_url() {
        return null;
    }
    
    public Result(@org.jetbrains.annotations.NotNull()
    java.lang.String section, @org.jetbrains.annotations.NotNull()
    java.lang.String subsection, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String p3_866449425, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.String item_type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_date, @org.jetbrains.annotations.NotNull()
    java.lang.String created_date, @org.jetbrains.annotations.NotNull()
    java.lang.String published_date, @org.jetbrains.annotations.NotNull()
    java.lang.String material_type_facet, @org.jetbrains.annotations.NotNull()
    java.lang.String kicker, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> des_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> org_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> per_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> geo_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.base.mainapp.data.source.remote.model.response.Multimedia> multimedia, @org.jetbrains.annotations.NotNull()
    java.lang.String short_url) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.app.base.mainapp.data.source.remote.model.response.Multimedia> component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.app.base.mainapp.data.source.remote.model.response.Result copy(@org.jetbrains.annotations.NotNull()
    java.lang.String section, @org.jetbrains.annotations.NotNull()
    java.lang.String subsection, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String p3_866449425, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String uri, @org.jetbrains.annotations.NotNull()
    java.lang.String byline, @org.jetbrains.annotations.NotNull()
    java.lang.String item_type, @org.jetbrains.annotations.NotNull()
    java.lang.String updated_date, @org.jetbrains.annotations.NotNull()
    java.lang.String created_date, @org.jetbrains.annotations.NotNull()
    java.lang.String published_date, @org.jetbrains.annotations.NotNull()
    java.lang.String material_type_facet, @org.jetbrains.annotations.NotNull()
    java.lang.String kicker, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> des_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> org_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> per_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> geo_facet, @org.jetbrains.annotations.NotNull()
    java.util.List<com.app.base.mainapp.data.source.remote.model.response.Multimedia> multimedia, @org.jetbrains.annotations.NotNull()
    java.lang.String short_url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}