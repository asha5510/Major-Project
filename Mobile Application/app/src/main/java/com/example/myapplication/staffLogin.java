package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class staffLogin extends AppCompatActivity {
 EditText uName ,staffPsw ;
 Button tBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_login);
        uName=findViewById(R.id.stEdit);
        staffPsw=findViewById(R.id.stPass);
        tBtn=findViewById(R.id.loginBtn);

        tBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(staffLogin.this,home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}