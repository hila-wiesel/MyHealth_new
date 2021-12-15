package com.example.myhealthnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ClientHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_home_page);
        Toast.makeText(ClientHomePage.this,"ClientHomePage",Toast.LENGTH_LONG).show();

    }
}