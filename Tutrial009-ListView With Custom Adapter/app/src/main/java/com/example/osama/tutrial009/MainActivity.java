package com.example.osama.tutrial009;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int [] ar_movie_poster_resource = {
            R.drawable.image_1,R.drawable.image_2,R.drawable.image_3,R.drawable.image_4,R.drawable.image_5,
            R.drawable.image_6,R.drawable.image_7,R.drawable.image_8,R.drawable.image_9,R.drawable.image_10};

    String [] ar_movie_titles = {};
    String [] ar_movie_ratings = {};

    MovieAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.main_list_view);

        ar_movie_titles = getResources().getStringArray(R.array.movie_titles);
        ar_movie_ratings = getResources().getStringArray(R.array.mavie_ratings);

        //initialize array adapter
        adapter = new MovieAdapter(getApplicationContext(),R.layout.activity_raw_list_view);
        listView.setAdapter(adapter);//ListView set Adapter
        for (int i=0; i< ar_movie_titles.length; i++){
            //create an new Movie
            MovieDataProvider movieDataProvider = new MovieDataProvider
                    (ar_movie_poster_resource[i],ar_movie_titles[i],ar_movie_ratings[i]);
            adapter.add(movieDataProvider);//override function
        }

    }
}
