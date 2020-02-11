package com.example.keerthana.finaltrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(this);
        Toast.makeText(Main5Activity.this,"Firebase connection Successful",Toast.LENGTH_LONG).show();
    }
    public void onClick(View v)
    {
        if(v==b){
        Intent in=new Intent(Main5Activity.this,Main2Activity.class);
        startActivity(in);}
    }

}
