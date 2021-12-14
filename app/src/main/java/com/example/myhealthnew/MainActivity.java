package com.example.myhealthnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_LONG).show();
    }

    public void onClickSign(View view) {
//        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//        Bundle b = new Bundle();
//        b.putInt("key", 1);
//        startActivity(intent);
//        finish();///
    }

    public void onClickCreate(View view) { //register
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);

        Bundle b = new Bundle();
        b.putInt("key", 1);
        finish();///
    }


    public void onClickForgotPass(View view) {
//        Intent intent = new Intent(MainActivity.this, ForgotPassword.class);
//        Bundle b = new Bundle();
//        b.putInt("key", 1);
//        startActivity(intent);
//        finish();   ///
    }

}