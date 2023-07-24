package com.remcos.activityplugin

import android.content.Intent
import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ConnectionActivity : AppCompatActivity() {   
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setResult(Activity.RESULT_OK, intent)
        finish()      
    }
}