package com.nahid.my_note.utils

import android.content.Context
import android.content.SharedPreferences

const val PREFERENCE_TITLE = "AppPreferences"

class AppPreferences(context: Context) {

    private val preferences: SharedPreferences =
        context.getSharedPreferences(PREFERENCE_TITLE, Context.MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = preferences.edit()


}
