package com.iamyashchouhan.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {


    public static void s(Context c, String message){

        Toast.makeText(c,"HELLO" ,Toast.LENGTH_LONG).show();

    }

}