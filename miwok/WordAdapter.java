package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ayooy_000 on 28/03/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResource;
    private int mAudioResource;



    public WordAdapter(@NonNull Context context, ArrayList<Word> words, int colorResource) {
        super(context, 0, words);
        mColorResource = colorResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        final Word currentWord = getItem(position);

//setting default text into the list
        TextView defaultText = (TextView) listItemView.findViewById(R.id.defaultText);
        defaultText.setText(currentWord.getmDefaultTranslation());
//setting the miwok text into the list
        TextView miwokText = (TextView) listItemView.findViewById(R.id.miwokText);
        miwokText.setText(currentWord.getmMiwokTranslation());

        //setting the image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentWord.hasImage()) {
            iconView.setImageResource(currentWord.getImageResourceID());
            iconView.setVisibility(View.VISIBLE);
        } else {
            iconView.setVisibility(View.GONE);
        }
        //setting the color to the list items
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResource);
        textContainer.setBackgroundColor(color);

        ImageView playButton = (ImageView) listItemView.findViewById(R.id.playSound);

        //set action listener to imageView


        return listItemView;
    }
}

