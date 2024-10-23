package com.example.cardview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class webviewactivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webviewactivity)


        val webviewvariable=findViewById<WebView>(R.id.webview2)
        webViewSetup(webviewvariable)

    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetup(webView: WebView){

        webView.webViewClient= WebViewClient()
        webView.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.youtube.com/")

        }

    }

}