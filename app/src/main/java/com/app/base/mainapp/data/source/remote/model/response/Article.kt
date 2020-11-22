/*
package com.app.base.mainapp.data.source.remote.model.response

import androidx.annotation.Keep
import com.app.base.mainapp.utils.Constants.DATE_TIME_FIELD
import com.app.base.mainapp.utils.Constants.DESCRIPTION_FIELD
import com.app.base.mainapp.utils.Constants.ID_FIELD
import com.app.base.mainapp.utils.Constants.IMAGE_FIELD
import com.app.base.mainapp.utils.Constants.SUBJECT_FIELD
import com.app.base.mainapp.utils.Constants.TITLE_FIELD
import com.j256.ormlite.field.DatabaseField
import com.j256.ormlite.table.DatabaseTable
import java.io.Serializable




@Keep
@DatabaseTable(tableName = "article")
data class Article(

        @DatabaseField(generatedId = true, columnName = ID_FIELD)
        var id: Long = 0L,
        @DatabaseField(columnName = TITLE_FIELD)
        var title: String = "",
        @DatabaseField(columnName = DATE_TIME_FIELD)
        var dateTime: String = "",
        @DatabaseField(columnName = SUBJECT_FIELD)
        var subject: String = "",
        @DatabaseField(columnName = IMAGE_FIELD)
        var image: String = "",
        @DatabaseField(columnName = DESCRIPTION_FIELD)
        var description: String = ""
)

data class ArticleItem(
        var id: Long = 0L,
        var title: String = "",
        var dateTime: String = "",
        var subject: String = "",
        var image: String = "",
        var description: String = ""
):Serializable
*/
