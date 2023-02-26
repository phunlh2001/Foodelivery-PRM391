package com.phunlh2001.fooddelivery.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.phunlh2001.fooddelivery.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnBack = findViewById(R.id.backToHome);
        Button btnLogin = findViewById(R.id.login);

        btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        btnLogin.setOnClickListener(view -> {

        });
    }
}