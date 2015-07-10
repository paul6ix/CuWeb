package com.sixtech.paulchidi.cuweb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ProgressBar;


public class ViewWebsite extends Activity {
    protected ProgressBar pbWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_website);
        Intent iWebsite = getIntent();
        Uri uWeburl = iWebsite.getData();
        WebView wvWebsite = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = wvWebsite.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSaveFormData(true);
        wvWebsite.setHorizontalScrollBarEnabled(true);
        wvWebsite.setVerticalScrollBarEnabled(true);

        wvWebsite.setWebViewClient(new mywebview());

        wvWebsite.loadUrl(uWeburl.toString());



        ImageButton ibBack = (ImageButton) findViewById(R.id.BtnBack);
        ibBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewWebsite.this, MainActivity.class);

                startActivity(intent);

            }
        });


    }

    private class mywebview extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            pbWeb = (ProgressBar) findViewById(R.id.progressBar);
            pbWeb.setVisibility(View.VISIBLE);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            pbWeb.setVisibility(View.GONE);

        }

    }
}

