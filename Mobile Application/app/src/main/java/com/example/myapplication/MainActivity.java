package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button admin, staff, student;
TextView teacher,std;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        admin=findViewById(R.id.Submit);
        staff=findViewById(R.id.Submit1);
        student=findViewById(R.id.Submit2);
        teacher=findViewById(R.id.teacherRegister);
        std=findViewById(R.id.student_Register);

        staff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,staffLogin.class);
                startActivity(intent);
                finish();
                Toast.makeText(MainActivity.this, "welcome to staff login", Toast.LENGTH_LONG).show();

            }
        });
         teacher.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 startActivity(new Intent(MainActivity.this,teacherRegistration.class));
             }
         });
    }
}