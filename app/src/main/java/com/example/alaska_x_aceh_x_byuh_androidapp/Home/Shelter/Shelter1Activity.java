package com.example.alaska_x_aceh_x_byuh_androidapp.Home.Shelter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.alaska_x_aceh_x_byuh_androidapp.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class Shelter1Activity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter1);

        // Get a reference to the WebView element
        webView = findViewById(R.id.web_view);

        // Enable JavaScript support in the WebView
        webView.getSettings().setJavaScriptEnabled(true);

        // Load a web page into the WebView
        webView.loadUrl("https://goo.gl/maps/k8khWuivEvESkx1s8");

        // Set up a custom WebViewClient to handle page loading events
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                // Set the activity title to the web page title
                setTitle(view.getTitle());
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Check if the WebView can go back
        if (webView.canGoBack()) {
            // Go back in the WebView history
            webView.goBack();
        } else {
            // Otherwise, let the default behavior occur (finish the activity)
            super.onBackPressed();
        }
    }
}


