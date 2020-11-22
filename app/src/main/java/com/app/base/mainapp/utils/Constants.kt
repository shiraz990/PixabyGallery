package com.app.base.mainapp.utils

import java.util.*


object Constants {

    const val TOP_ARTICLES_TAB ="TOP_ARTICLES"
    const val BOOKMARKED_TAB ="BOOKMARKED_ARTICLES"

    lateinit var current_locale: Locale

    const val LANGUAGE_ENGLISH = "en"
    const val LANGUAGE_AR = "ar"
    var SELECTED_LANGUAGE = "en"
    const val ARTICLE_ITEM = "article_item"


    // Database fields
    const val ID_FIELD = "id"
    const val TITLE_FIELD = "title"
    const val DATE_TIME_FIELD = "dateTime"
    const val SUBJECT_FIELD = "subject"
    const val IMAGE_FIELD = "image"
    const val DESCRIPTION_FIELD = "description"
    const val FORMAT_IMAGE = "superJumbo"

    // Response Code
    const val SUCCESS_CODE = 0

    const val VIA_NOTIFICATION = "via_notification"
    const val ARTICLE = "{section}.json"
}