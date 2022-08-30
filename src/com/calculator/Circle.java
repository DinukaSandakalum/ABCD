package com.calculator;

public class Circle {
    public Circle(int radius) {
        this.radius = radius;
        System.out.println("Area of the Circle = "+area());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    public double area(){
        return 3.14*(this.radius)*(this.radius);
    }




}
