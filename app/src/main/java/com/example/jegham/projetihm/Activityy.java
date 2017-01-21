package com.example.jegham.projetihm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.jegham.projetihm.R.id.edit1;
import static com.example.jegham.projetihm.R.id.edit2;
import static com.example.jegham.projetihm.R.layout.page1;

public class Activityy extends Activity {
EditText e1 ,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(page1);
        RelativeLayout Lay2 = (RelativeLayout) getLayoutInflater().inflate(page1, null);
        TextView sc = (TextView) findViewById(R.id.sc);
        TextView CO = (TextView) findViewById(R.id.CO);

        TextView mdp = (TextView) findViewById(R.id.mdp);
        TextView si = (TextView) findViewById(R.id.si);
        TextView si2 = (TextView) findViewById(R.id.si2);
        Button b1 = (Button) findViewById(R.id.scfb);
        Button b2 = (Button) findViewById(R.id.scg);
        Button ins = (Button) findViewById(R.id.ins);
        Button au = (Button) findViewById(R.id.au);

        e1 = (EditText) findViewById(R.id.edit1);
        e2 = (EditText) findViewById(R.id.edit2);
        // b1.setOnClickListener(cl);
        //b2.setOnClickListener(cl);
        au.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {

                        switch (v.getId()) {

                            case R.id.au:
                                Context context = getApplicationContext();
                                CharSequence text1 = "Entrez votre E-Mail!";
                                CharSequence text2 = "Entrez Votre Mot De Passe!";
                                int duration = Toast.LENGTH_SHORT;
                                if (e1.getText().toString().length() == 0) {
                                    Toast toast1 = Toast.makeText(context, text1, duration);
                                    toast1.show();
                                } else if (e2.getText().toString().length() == 0) {
                                    Toast toast2 = Toast.makeText(context, text2, duration);
                                    toast2.show();
                                }


                                break;
                        }
                    }
                });
        ins.setOnClickListener(

                new View.OnClickListener() {
                    public void onClick(View v) {
                        switch (v.getId()) {
                            case R.id.ins:
                                // it was the first button
                                Intent intent = new Intent(Activityy.this, page2.class);
                                startActivity(intent);
                                break;
                        }
                    }
                });


    };
}














