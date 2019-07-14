package com.company;

public class Circle {
    private double Radius;
    private String color;
    private boolean filled;


    public Circle() {
    }

    public Circle(double radius) {
        Radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        Radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }
}
