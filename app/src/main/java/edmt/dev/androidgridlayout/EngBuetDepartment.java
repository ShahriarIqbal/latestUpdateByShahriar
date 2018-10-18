package edmt.dev.androidgridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EngBuetDepartment extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_buet_department);

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.buet.ac.bd/Department");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }


    @Override
    public void onBackPressed() {

        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
        super.onBackPressed();
    }
}
