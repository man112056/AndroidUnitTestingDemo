package com.manish.example.compose.androidunittestingdemo.uiHelper

import android.content.Context
import android.content.SharedPreferences

class PreferencesManager(context: Context) {
    private val sharedPreferences: SharedPreferences =
        context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

    fun saveUserName(userName: String) {
        sharedPreferences.edit().putString("user_name", userName).apply()
    }

    fun getUserName(): String? {
        return sharedPreferences.getString("user_name", null)
    }
}
