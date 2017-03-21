package com.apress.gerber.barnadtama;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Dominik Urban on 2016-04-09.
 */
public class Galeria extends Glowna {


    GalleryAdapter mAdapter;
    RecyclerView mRecyclerView;

    ArrayList<ImageModel> data = new ArrayList<>();

    public static String IMGS[] = {
           "http://i.imgur.com/NLkDY2K.jpg",
            "http://i.imgur.com/fN8N6r3b.jpg",
            "http://i.imgur.com/juGcrdH.jpg",
            "http://i.imgur.com/wLZxHlc.jpg",
            "http://i.imgur.com/8qesNyf.jpg",
            "http://i.imgur.com/QQeiJRh.jpg",
            "http://i.imgur.com/iYcGP70.jpg",
            "http://i.imgur.com/cglyoGv.jpg",
            "http://i.imgur.com/smiWOns.jpg",
            "http://i.imgur.com/skhkVWN.jpg",
            "http://i.imgur.com/0hMt4kE.jpg",
            "http://i.imgur.com/qfnyj9cb.jpg",
            "http://i.imgur.com/uPL8ZiPb.jpg",
            "http://i.imgur.com/4HFOq6r.jpg",
            "http://i.imgur.com/ZYeMIcOb.jpg",
            "http://i.imgur.com/doqSeaK.jpg",
            "http://i.imgur.com/SkWXssOb.jpg"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        for (int i = 0; i < IMGS.length; i++) {

            ImageModel imageModel = new ImageModel();
            imageModel.setName("");
            imageModel.setUrl(IMGS[i]);
            data.add(imageModel);

        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
      setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        mRecyclerView.setHasFixedSize(true);


        mAdapter = new GalleryAdapter(Galeria.this, data);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this,
                new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position) {

                        Intent intent = new Intent(Galeria.this, DetailActivity.class);
                        intent.putParcelableArrayListExtra("data", data);
                        intent.putExtra("pos", position);
                        startActivity(intent);

                    }
                }));

    }

}