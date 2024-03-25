package com.workintech.pool;

public class Cuboid extends Rectangle {
    private double height;
    public Cuboid (double height,double width,double length){
        super(width,length);
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getHeight()*getLength()*getWidth();
    }

    public void setHeight(double height) {
        if(height<0){
            this.height=0;
        }
        else {
            this.height = height;
        }
    }
    }


