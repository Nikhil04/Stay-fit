package com.example.gujarati.naeshuruwat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class kapalbhati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapalbhati);
        WebView wb;
        wb=(WebView)findViewById(R.id.wb);
        wb.loadUrl("https://www.youtube.com/watch?v=_kdhsfDEuY8");
    }
}
