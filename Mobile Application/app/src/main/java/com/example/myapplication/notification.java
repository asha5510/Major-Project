package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import java.net.URL;

public class notification extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        textView=findViewById(R.id.click);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
             URL https;//console.firebase.google.com/u/0/project/my-application-bb2b2/notification/experiment/create
            }
        });
    }
}