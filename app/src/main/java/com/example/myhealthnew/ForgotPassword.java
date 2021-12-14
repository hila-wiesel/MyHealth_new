package com.example.myhealthnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        Bundle b = getIntent().getExtras();
        int value = -1;     //?
        if (b != null)
            value = b.getInt("key");
    }
}