package com.example.roompractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Second extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    editText=findViewById(R.id.note);
    }

    public void save(View view) {

   Entitiyyy entitiyyy=new Entitiyyy();
   entitiyyy.setNote(editText.getText().toString());



    }
}
