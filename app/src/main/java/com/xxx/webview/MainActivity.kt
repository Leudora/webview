package com.xxx.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clParent = findViewById<LinearLayout>(R.id.clParent)
        val llParent = findViewById<LinearLayout>(R.id.llParent)
        val tvContent = findViewById<TextView>(R.id.tvContent)
        XWebView.to(this,clParent,"https://www.baidu.com")
    }
}