package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.*;

public class Hexagon extends Shape{
    double side;

    public Hexagon(Color borderColor, double borderWidth, Turtle turtle, Point location, double side) {
        super(borderColor, borderWidth, turtle, location);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void paint() {

    for(int i = 0; i < 6;i++) {
        turtle.setColor(borderColor);
        turtle.forward(side);
        turtle.turnRight(60);
    }
}
}
