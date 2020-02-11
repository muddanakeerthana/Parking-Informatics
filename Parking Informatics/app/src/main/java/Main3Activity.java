package com.example.keerthana.finaltrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b = (Button) findViewById(R.id.button5);
        b.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == b) {
            Intent int1 = new Intent(Main3Activity.this, Main6Activity.class);
            startActivity(int1);
        }
    }
}
