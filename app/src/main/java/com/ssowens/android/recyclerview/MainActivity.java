package com.ssowens.android.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> names = new ArrayList<>();
    private ArrayList<String> imagesUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

        initImageBitmaps();
    }

    private void initImageBitmaps() {
        Timber.i("Preparing bitmaps");
        imagesUrls.add("https://i.imgur.com/RLuRM9w.jpg");
        names.add("Before The Strike");

        imagesUrls.add("https://i.redd.it/l8csxiwdzje21.jpg");
        names.add("Starry night in Crested Butte, Colorado");

        imagesUrls.add("https://i.redd.it/06cuwnfo5ie21.jpg");
        names.add("Nice pix in Vegas");

        imagesUrls.add("https://i.redd.it/pqgzyk8x4le21.jpg");
        names.add("An eyeland");

        imagesUrls.add("https://i.redd.it/i034ytmuyme21.jpg");
        names.add("Rain Shower");

        imagesUrls.add("https://i.redd.it/rsnsdk9tmke21.jpg");
        names.add("A Cool Town");

        imagesUrls.add("https://i.redd.it/qnsecro6qme21.jpg");
        names.add("Living on the Edge");

        imagesUrls.add("https://i.imgur.com/Xx6Q3GAl.jpg");
        names.add("It's rocky");

        imagesUrls.add("https://i.redd.it/ujy04utr9ne21.jpg");
        names.add("Log Lamps");

        initRecyclerView();

    }

    private void initRecyclerView() {
        Timber.i("Initializing the recyclerView");
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, names,
                imagesUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
