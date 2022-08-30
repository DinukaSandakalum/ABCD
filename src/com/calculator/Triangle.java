package com.calculator;

public class Triangle {
    public Triangle(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Area of Triangle = "+ area());
    }

    public int getLength() {return length;}

    public void setLength(int length) {this.length = length;}

    public int getWidth() {return width;}

    public void setWidth(int width) {this.width = width;}

    private int length;
    private int width;

    public double area(){
        return this.length*this.width*0.5;
    }
}
