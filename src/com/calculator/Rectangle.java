package com.calculator;

import java.sql.SQLOutput;

public class Rectangle {
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        //System.out.println("Area of Rectangle = "+ area());
    }

    public int getLength() {return length;}

    public void setLength(int length) {this.length = length;}

    public int getWidth() {return width;}

    public void setWidth(int width) {this.width = width;}

    private int length;
    private int width;

    public int area(){
        return this.length*this.width;
    }



}
