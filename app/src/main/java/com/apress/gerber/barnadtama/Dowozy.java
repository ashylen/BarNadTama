package com.apress.gerber.barnadtama;



import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Dominik Urban on 2016-04-12.
 */
public class Dowozy extends Glowna {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dowozy);
        ImageView dowozy = (ImageView) findViewById(R.id.ivdowozy);
        dowozy.setImageResource(R.drawable.dowozy);
    }

}




