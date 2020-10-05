package com.example.keerthana.finaltrial;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    EditText et;
    String s1="https://www.google.com/maps/search/parking+lots+in+";
    String s2="/@19.0741838,72.7270174,45100m/data=!3m2!1e3!4b1";
    /*String s1="https://www.google.com/search?tbm=lcl&sxsrf=ACYBGNRYoshNzL39cCD3VD6VtLBdLs6zhg%3A1581181133487&ei=zeg-XrurHZye4-EPiOWl0Ac&q=parking+lots+in+";
    String s2=" +district&oq=parking+lots+in+Krishna+district&gs_l=psy-ab.3..33i22i29i30k1.118428.130663.0.131675.26.24.0.2.2.0.181.3084.1j23.24.0....0...1c.1.64.psy-ab..1.25.2993...0j35i39k1j0i10k1j0i22i30k1j33i10k1.0.oMpub9iKVak#rlfi=hd:;si:;mv:[[16.5856281,80.89653460000001],[16.4622586,80.49578489999999]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u16!2m2!16m1!1e1!1m4!1u16!2m2!16m1!1e2!2m1!1e16!2m1!1e3!2m4!1e17!4m2!17m1!1e2!3sIAE,lf:1,lf_ui:3";*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b=(Button)findViewById(R.id.button6);
        et=(EditText)findViewById(R.id.editText);
        b.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        if(v==b)
        {
            String s=et.getText().toString();
            String str=s1+s+s2;
            Intent intentg =new Intent(Intent.ACTION_VIEW, Uri.parse(str));
            startActivity(intentg);

        }
    }
}
