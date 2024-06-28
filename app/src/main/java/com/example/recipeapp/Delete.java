package com.example.recipeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Delete extends AppCompatActivity {
    EditText e1;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_delete);
        e1=(EditText) findViewById(R.id.rectitle);
        b1=(AppCompatButton) findViewById(R.id.dlt);
        b2=(AppCompatButton) findViewById(R.id.backtomenu);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Deleted",Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i6);
            }
        });
    }
}