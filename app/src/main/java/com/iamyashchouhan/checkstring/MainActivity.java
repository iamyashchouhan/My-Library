package com.iamyashchouhan.checkstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.iamyashchouhan.mylibrary.ToasterMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToasterMessage.s(this,"NICE");
    }
}