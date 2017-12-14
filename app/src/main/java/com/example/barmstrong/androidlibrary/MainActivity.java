package com.example.barmstrong.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String USGS_REQUEST_URL =
            "http://www.googleapis.com/books/v1/volumes?q=android&maxResults=1";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




}
