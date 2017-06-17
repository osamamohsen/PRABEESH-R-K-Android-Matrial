package com.example.osama.tutrial009;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by osama on 17/06/17.
 */

public class MovieAdapter extends ArrayAdapter{
    List list = new ArrayList();
    public MovieAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    static class DataHandler{
        ImageView poster;
        TextView title;
        TextView rating;
    }

    @Override
    public void add(Object object){
        super.add(object);
        list.add(object);
    }

    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;//b3rf layout activity
        row = convertView;
        DataHandler handler;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.activity_raw_list_view,parent,false); // by3mel inflate ya3ne bya5o attribute bta3t activity_raw_list_view layout
            handler = new DataHandler();//static class
            handler.poster = (ImageView) row.findViewById(R.id.raw_img_movie_poster);
            handler.title = (TextView) row.findViewById(R.id.raw_txt_movie_title);
            handler.rating = (TextView) row.findViewById(R.id.raw_txt_movie_rating);
            row.setTag(handler);
        }else{
            handler = (DataHandler) row.getTag();
        }
        MovieDataProvider dataProvider;
        dataProvider = (MovieDataProvider) this.getItem(position);
        handler.poster.setImageResource(dataProvider.getMovie_poster_resource());
        handler.title.setText(dataProvider.getMovie_title());
        handler.rating.setText(dataProvider.getMovie_rating());
        return row;
    }
}
