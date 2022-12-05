package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class teacherRegistration extends AppCompatActivity {
EditText edit1,edit2,edit3,edit4,edit5,edit6,edit7;
Button btnTeacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_registration);
        edit1=findViewById(R.id.teacherName);
        edit2=findViewById(R.id.munci);
        edit3=findViewById(R.id.district);
        edit4=findViewById(R.id.province);
        edit5=findViewById(R.id.ward);
        edit6=findViewById(R.id.tole);
        edit7=findViewById(R.id.houseNumber);
        btnTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(teacherRegistration.this,home.class);
                startActivity(intent);
                finish();
            }
        });

    }
}