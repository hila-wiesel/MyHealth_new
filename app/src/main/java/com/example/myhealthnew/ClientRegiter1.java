package com.example.myhealthnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ClientRegiter1 extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private DatabaseReference reference;
    private String UserID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_regiter1);

        reference = FirebaseDatabase.getInstance().getReference("Users");
        mAuth = FirebaseAuth.getInstance();
        UserID = mAuth.getUid();
    }

    public void onClickNext(View view) {

        EditText et_Name = (EditText) findViewById(R.id.et_Name);
        EditText et_Gender = (EditText) findViewById(R.id.et_Gender);
        EditText et_City = (EditText) findViewById(R.id.et_City);
        EditText et_Country = (EditText) findViewById(R.id.et_Country);
        EditText et_Height = (EditText) findViewById(R.id.et_Height);
        EditText et_Weight = (EditText) findViewById(R.id.et_Weight);
        EditText et_PhoneNumber = (EditText) findViewById(R.id.et_PhoneNumber);
        EditText et_BirthDate = (EditText) findViewById(R.id.et_BirthDate);

        String name = et_Name.getText().toString().trim();
        String gender = et_Gender.getText().toString().trim();
        String city = et_City.getText().toString().trim();
        String country = et_Country.getText().toString().trim();
        String height = et_Height.getText().toString().trim();
        String weight = et_Weight.getText().toString().trim();
        String phoneNumber = et_PhoneNumber.getText().toString().trim();
        String birthDate = et_BirthDate.getText().toString().trim();

        //empty name check
        if(name.isEmpty()){
            et_Name.setError("full name is required!");
            et_Name.requestFocus();
            return;
        }

//        if(gender.equals("male")){
//            user_email.setError("email is required!");
//            user_email.requestFocus();
//            return;
//        }

        if(city.isEmpty()){
            et_City.setError("invalid city");
            et_City.requestFocus();
            return;
        }
        if(country.isEmpty()){
            et_Country.setError("invalid country");
            et_Country.requestFocus();
            return;
        }
        if(height.isEmpty()){
            et_Height.setError("invalid height");
            et_Height.requestFocus();
            return;
        }
        if(weight.isEmpty()){
            et_Weight.setError("invalid weight");
            et_Weight.requestFocus();
            return;
        }
        if(phoneNumber.isEmpty()){
            et_PhoneNumber.setError("invalid phone number");
            et_PhoneNumber.requestFocus();
            return;
        }
        if(birthDate.isEmpty()){
            et_BirthDate.setError("invalid birth date");
            et_BirthDate.requestFocus();
            return;
        }

        Intent intent = new Intent(ClientRegiter1.this, ClientRegiter2.class);
        Bundle b = new Bundle();
        b.putInt("key", 1);
        startActivity(intent);
        finish();
    }
}