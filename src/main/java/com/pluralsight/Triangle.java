package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.*;

public class Triangle extends Shape{
    double side;


    public Triangle(Color borderColor, double borderWidth, Turtle turtle, Point location, double side) {
        super(borderColor, borderWidth, turtle, location);
        this.side = side;
    }

    @Override
    public void paint() {
        turtle.setColor(borderColor);
        for(int i=0; i<3; i++) {
            turtle.forward(100);
            turtle.turnRight(120);
        }
        }

}
