package com.app.base.mainapp.data.source.remote.model.response;

/**
 * Created by hunain.liaquat.
 */

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@Keep
@DatabaseTable(tableName = "article")
public class ArticleItem implements Parcelable{

    public static final String ID_FIELD = "id";
    public static final String TITLE_FIELD = "title";
    public static final String DATE_TIME_FIELD = "dateTime";
    public static final String PUBLISHED_DATE_TIME_FIELD = "published_dateTime";
    public static final String SUBJECT_FIELD = "subject";
    public static final String IMAGE_FIELD = "image";
    public static final String DESCRIPTION_FIELD = "description";


    @DatabaseField(generatedId = true,columnName = ID_FIELD)
    private int id;

    @DatabaseField(columnName = TITLE_FIELD)
    private String title;

    @DatabaseField(columnName = DATE_TIME_FIELD)
    private String dateTime;


    @DatabaseField(columnName = PUBLISHED_DATE_TIME_FIELD)
    private String publishedDate;

    @DatabaseField(columnName = SUBJECT_FIELD)
    private String subject;


    @DatabaseField(columnName = IMAGE_FIELD)
    private String image;


    @DatabaseField(columnName = DESCRIPTION_FIELD)
    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public ArticleItem() {}


    protected ArticleItem(Parcel in) {
        id = in.readInt();
        title = in.readString();
        dateTime = in.readString();
        publishedDate = in.readString();
        subject = in.readString();
        image = in.readString();
        description = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeString(dateTime);
        dest.writeString(publishedDate);
        dest.writeString(subject);
        dest.writeString(image);
        dest.writeString(description);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ArticleItem> CREATOR = new Creator<ArticleItem>() {
        @Override
        public ArticleItem createFromParcel(Parcel in) {
            return new ArticleItem(in);
        }

        @Override
        public ArticleItem[] newArray(int size) {
            return new ArticleItem[size];
        }
    };
}