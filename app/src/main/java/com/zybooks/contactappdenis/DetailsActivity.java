package com.zybooks.contactappdenis;

// This activity will be used to make a call to a contact or for sending an SMS.

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }
}