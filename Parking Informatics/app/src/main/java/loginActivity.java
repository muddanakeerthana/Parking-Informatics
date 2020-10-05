package com.example.keerthana.finaltrial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class loginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText txt1;
    EditText txt2;
    Button b;
    private FirebaseAuth ref;
     FirebaseAuth.AuthStateListener ma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt1=(EditText)findViewById(R.id.name);
        txt2=(EditText)findViewById(R.id.mail);
        b=(Button)findViewById(R.id.button8);
        ref=FirebaseAuth.getInstance();
        b.setOnClickListener(this);

        ma=new FirebaseAuth.AuthStateListener() {

            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user=ref.getCurrentUser();
                if(ma!=null)
                {
                    Toast.makeText(loginActivity.this,"You are logged in already",Toast.LENGTH_LONG).show();
                    Intent int1 = new Intent(loginActivity.this, Main6Activity.class);
                    startActivity(int1);

                }
                else{
                    Toast.makeText(loginActivity.this,"Please login",Toast.LENGTH_LONG).show();
                }

            }
        };
    }

    public void onClick(View v)
    {
        String s1=txt1.getText().toString();
        String s2=txt1.getText().toString();

        ref.signInWithEmailAndPassword(s1,s2).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (!task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information
                    Toast.makeText(loginActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();

                } else {
                    // If sign in fails, display a message to the user.

                    Toast.makeText(loginActivity.this, "Logged in successfully.", Toast.LENGTH_SHORT).show();
                    Intent int2 = new Intent(loginActivity.this, Main6Activity.class);
                    startActivity(int2);
                }
            }
            }
            );
    }
}
