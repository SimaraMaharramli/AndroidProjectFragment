package com.example.ecommersapp

import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ecommersapp.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import java.util.Calendar

class MainActivity : AppCompatActivity() {

    private lateinit var sharedPreferences: SharedPreferences
    private val THEME_KEY = "theme_preference_key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // SharedPreferences'tan tema tercihini al
        sharedPreferences = getSharedPreferences("user_preferences", MODE_PRIVATE)
        val themePreference = sharedPreferences.getString(THEME_KEY, "SYSTEM")

        // Tercihe göre temayı uygula
        when (themePreference) {
            "DARK" -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            "LIGHT" -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            else -> AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        }

        setContentView(R.layout.activity_main)
    }

    // Kullanıcının tercihini kaydet
    private fun saveThemePreference(theme: String) {
        val editor = sharedPreferences.edit()
        editor.putString(THEME_KEY, theme)
        editor.apply()
    }
}


