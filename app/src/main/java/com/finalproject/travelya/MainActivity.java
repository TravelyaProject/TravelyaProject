package com.finalproject.travelya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openHome(View view) {
        startActivity(new Intent(this,HomeActivity.class));
    }

    public void newAccount(View view) {
        startActivity(new Intent(this,RegisterActivity.class));
    }

    public void logAccount(View view) {
        startActivity(new Intent(this,LoginActivity.class));
    }
}