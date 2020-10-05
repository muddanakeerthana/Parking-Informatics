package com.example.keerthana.finaltrial;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button4);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        if(v==b1){
        Intent intent1=new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent1);}
        else if(v==b2){
            Intent intent2=new Intent(Main2Activity.this,loginActivity.class);
            startActivity(intent2);}
        else if(v==b3){
            Intent intent3=new Intent(Main2Activity.this,Main4Activity.class);
            startActivity(intent3);}
    }

}
