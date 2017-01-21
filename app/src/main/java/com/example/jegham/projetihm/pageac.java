package com.example.jegham.projetihm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.net.URI;

/**
 * Created by jegham on 21/01/17.
 */

public class pageac extends Activityy {private ImageButton im;
    private static final int gal_req=1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pageaccueil);
        RelativeLayout Lay=(RelativeLayout)getLayoutInflater().inflate(R.layout.pageaccueil, null);
        TextView text1=(TextView)findViewById(R.id.text1);
       im=(ImageButton)findViewById(R.id.im);
        im.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {

                Intent galerie= new Intent(Intent.ACTION_GET_CONTENT);
                galerie.setType("image/*");
                startActivityForResult(galerie,gal_req);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ((requestCode==gal_req)&&(resultCode==RESULT_OK))
            {
                Uri imageuri=data.getData();
                im.setImageURI(imageuri);
            }
    }
}
