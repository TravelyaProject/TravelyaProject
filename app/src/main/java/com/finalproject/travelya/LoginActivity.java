package com.finalproject.travelya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void skipLog(View view) {
        startActivity(new Intent(this, HomeActivity.class));
    }


    public void logRegister(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }
}