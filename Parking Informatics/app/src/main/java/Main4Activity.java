package com.example.keerthana.finaltrial;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
    EditText t1;
    EditText t2;
    EditText t3;
    Button reg;
    DatabaseReference ref;
    Member mem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        t1=(EditText)findViewById(R.id.name);
        t2=(EditText)findViewById(R.id.mail);
        t3=(EditText)findViewById(R.id.pass);
        reg=(Button)findViewById(R.id.register);
        mem=new Member();
        ref= FirebaseDatabase.getInstance().getReference().child("Member");
        reg.setOnClickListener(this);



    }
    public void onClick(View v)
    {
        /*String s=t1.getText().toString().trim();
        String s1=t2.getText().toString().trim();
        String s2=t3.getText().toString().trim();
        mem.setN(s.getText().toString().trim());*/
        mem.setN(t1.getText().toString().trim());
        mem.setM(t2.getText().toString().trim());
        mem.setP(t3.getText().toString().trim());
        ref.push().setValue(mem);
        Toast.makeText(Main4Activity.this,"Data inserted",Toast.LENGTH_LONG).show();


    }
}
