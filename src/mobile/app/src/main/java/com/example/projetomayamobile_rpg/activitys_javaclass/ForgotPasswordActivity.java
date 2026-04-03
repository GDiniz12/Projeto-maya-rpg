package com.example.projetomayamobile_rpg.activitys_javaclass;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetomayamobile_rpg.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    Button btnSendCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password_activity);

        btnSendCode = findViewById(R.id.btnSendCode);

        btnSendCode.setOnClickListener(v -> {
            startActivity(new Intent(ForgotPasswordActivity.this, ForgotPasswordSequelActivity.class));
            finish();
        });
    }
}