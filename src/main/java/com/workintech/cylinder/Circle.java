package com.workintech.cylinder;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(){
        if(radius<0){
            this.radius=0;
        }
        else {
            this.radius=radius;
        }
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }


}
