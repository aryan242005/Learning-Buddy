package com.example.layout2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfViewer extends AppCompatActivity {

    WebView myPdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        myPdf = findViewById(R.id.myPdf);
        String url = getIntent().getStringExtra("pdf_url");
        myPdf.getSettings().setJavaScriptEnabled(true);
        myPdf.setWebViewClient(new WebViewClient());
        myPdf.loadUrl(url);
    }
}