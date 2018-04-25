package com.example.android.miwok;

import android.media.Image;

/**
 * Created by ayooy_000 on 28/03/2018.
 */

public class Word {
    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResouceID = NO_IMAGE_PROVIDED;

    private int mAudioResourceID;

    public static final int NO_IMAGE_PROVIDED= -1;

    public Word(String defaultTranslation, String miwokTranslation, int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResource;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResource, int audioResource) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResouceID = imageResource;
        mAudioResourceID = audioResource;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() {
        return mImageResouceID;
    }

    public boolean hasImage() {
        if (mImageResouceID == -1)
            return false;
        else return true;
    }
    public int getmAudioResource(){return mAudioResourceID;}

}