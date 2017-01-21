package com.example.jegham.projetihm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


/**
 * Created by jegham on 19/01/17.
 */
import com.firebase.client.Firebase;
public class page2 extends Activity {EditText e1 ,e2,e3,e4;
    String s1,s2,s3,s4;
    private Firebase fr;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityy);
        RelativeLayout Lay=(RelativeLayout)getLayoutInflater().inflate(R.layout.activity_activityy, null);
          Firebase.setAndroidContext(this);
        fr=new Firebase("https://projetihm-111c5.firebaseio.com/");
        TextView nom=(TextView)findViewById(R.id.nom);
        TextView pr=(TextView)findViewById(R.id.nom2);

        TextView mdp=(TextView)findViewById(R.id.mdp);
        TextView fl=(TextView)findViewById(R.id.fl);
        TextView ce=(TextView)findViewById(R.id.ce);
        RadioButton r1=(RadioButton)findViewById(R.id.r1);
        RadioButton r2=(RadioButton)findViewById(R.id.r2);
        RadioButton r3=(RadioButton)findViewById(R.id.r3);
        RadioButton r4=(RadioButton)findViewById(R.id.r4);
        RadioGroup rg=(RadioGroup) findViewById(R.id.rg);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);

        Button inscri=(Button)findViewById(R.id.inscri);
        inscri.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();


               fr.child("users").push().setValue(new user(s1,s2,s3,s4));
                Intent intent = new Intent(page2.this, pageac.class);
                startActivity(intent);

            }
        });








             }



        }



