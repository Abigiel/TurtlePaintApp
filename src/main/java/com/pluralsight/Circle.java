package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.*;

//import java.awt.*;

public class Circle extends Shape{

    private double radius;

    public Circle(Color borderColor, double borderWidth, Turtle turtle, Point location, double radius) {
        super(borderColor, borderWidth, turtle, location);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void paint() {
        for (int i = 0; i < 360; i++) {
            turtle.setColor(borderColor);
            turtle.turnLeft(1);
            turtle.forward(2 * Math.PI * radius / 360);
        }
    }
}