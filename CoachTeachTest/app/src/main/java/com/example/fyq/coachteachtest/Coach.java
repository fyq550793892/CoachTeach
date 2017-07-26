package com.example.fyq.coachteachtest;

/**
 * Created by Meng on 2017/7/24.
 */

public class Coach {
    private String name;
    private int imageId;
    public Coach(String name,int imageId){
        this.imageId=imageId;
        this.name=name;
    }
    public String getName(){
         return name;
    }
    public int getImageId(){
        return imageId;
    }
}
