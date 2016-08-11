package com.example.niraj.humptyapplication;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;

/**
 * Created by Niraj on 8/9/2016.
 */
public class Heritage {

    @DrawableRes private int image;
    @NonNull private String name;

    public Heritage( int image, @NonNull String name) {
        this.image = image;
        this.name = name;
    }
    public int getImage() {
        return image;
    }

    public void setImage( int image) {
        this.image = image;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }
}
