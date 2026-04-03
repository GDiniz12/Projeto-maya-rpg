package com.example.projetomayamobile_rpg.activitys_javaclass;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetomayamobile_rpg.R;

public class ForgotPasswordSequelActivity extends AppCompatActivity {

    Button btnChangePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password_sequel_activity);


        btnChangePassword = findViewById(R.id.btnChangePassword);

        btnChangePassword.setOnClickListener(v -> {
            startActivity(new Intent(ForgotPasswordSequelActivity.this, ForgotPasswordCompletedActivity.class));
            finish();
        });
    }
}