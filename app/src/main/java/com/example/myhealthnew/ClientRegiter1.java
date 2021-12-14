package com.example.myhealthnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClientRegiter1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_regiter1);
    }

    public void onClickNext(View view) {
        Intent intent = new Intent(ClientRegiter1.this, ClientRegiter2.class);
        Bundle b = new Bundle();
        b.putInt("key", 1);
        startActivity(intent);
        finish();
    }
}