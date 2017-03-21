package com.apress.gerber.barnadtama;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import java.util.Locale;

public class Glowna extends AppCompatActivity {

    Button btgaleria;
    Button btmapa;
  //   Button btlogo;
    Button btfb;
    Button btgoogle;
    Button btexit;
    Button btmenu;
    Button btzadzwon;
    Button btdowozy;
    Button btpromocje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glowna);
        ///////////////GALERIA////////////////////
        btgaleria= (Button) findViewById(R.id.btgaleria);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/Gill Sans MT Ultra Bold.ttf");
        btgaleria.setTypeface(face);


                btgaleria.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.image_click));
                        Intent galeria = new Intent(Glowna.this, Galeria.class);
                        startActivity(galeria);
                    }
                });

        ///////////////MENU////////////////////
        btmenu=(Button) findViewById(R.id.btmenu);
        btmenu.setTypeface(face);
        btmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.image_click));
                Intent menu_jedzenia = new Intent(Glowna.this, Menu_jedzenia.class);
                startActivity(menu_jedzenia);
            }
        });



        ///////////////OBRAZEK-LOGO/////////////////
//        btlogo = (Button) findViewById(R.id.btlogo);
//        btlogo.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Uri uri = Uri.parse("http://nad-tama.jimdo.com/strona-g%C5%82%C3%B3wna/");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        });

        ///////////////PRZYCISK FACEBOOK/////////////////
        btfb = (Button) findViewById(R.id.btfb);

        btfb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.image_click));
                Uri uri = Uri.parse("https://www.facebook.com/barnadtama/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ///////////////PRZYCISK GOOGLE+/////////////////
        btgoogle = (Button) findViewById(R.id.btgoogle);
        btgoogle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.image_click));
                Uri uri = Uri.parse("https://plus.google.com/+BarNadTam%C4%85Bia%C5%82obrzeska158L%C5%BBo%C5%82ynia/posts");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ///////////////DOWOZY////////////////////
        btdowozy=(Button) findViewById(R.id.btdowozy);
        btdowozy.setTypeface(face);
        btdowozy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.image_click));
                Intent dowozy = new Intent(Glowna.this, Dowozy.class);
                startActivity(dowozy);
            }
        });

        //////////////////PROMOCJE////////////////////
        btpromocje = (Button) findViewById(R.id.btpromocje);
        btpromocje.setTypeface(face);
        btpromocje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.image_click));
                Intent intent = new Intent(Glowna.this, Promocje.class);
                startActivity(intent);
            }
        });

        ///////////////MAPA/////////////////
        btmapa = (Button) findViewById(R.id.btmapa);
        btmapa.setTypeface(face);

        btmapa.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.image_click));
                String uri = String.format(Locale.ENGLISH, "geo:50.149049, 22.324427");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
        ///////////////ZADZWON//////////
        btzadzwon = (Button) findViewById(R.id.btzadzwon);
        btzadzwon.setTypeface(face);

        btzadzwon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.image_click));
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:782134434"));
                startActivity(callIntent);
            }
        });

        ///////////////WYJSCIE/////////////////
        btexit = (Button) findViewById(R.id.btexit);
        btexit.setTypeface(face);
        btexit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.image_click));
                System.exit(0);
            }
        });

    }






}
