package com.example.nubdub.spacefighter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by nlpsa on 2/17/2018.
 */

public class Player {
    //Bitmap to get character from image
    private Bitmap bitmap;

    //coordinates
    private int x;
    private int y;

    //motion speed of the character
    private int speed = 0;

    //constructor
    public Player(Context context) {
        x = 75;
        y = 50;
        speed = 1;

        //Getting bitmap from drawable resource
        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.player);
    }

    //Method to update coordinate of character
    public void update(){
        //updating x coordinate
        x++;
    }

    /*
    * These are getters you can generate it autmaticallyl
    * right click on editor -> generate -> getters
    * */
    public Bitmap getBitmap() {
        return bitmap;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }
}
