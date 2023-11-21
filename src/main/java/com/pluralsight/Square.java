package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.*;

public class Square extends Shape {
    private double side;
    public Square(Color borderColor, double borderWidth, Turtle turtle, Point location, double side) {
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


        for(int i=0; i<4; i++){
            turtle.setColor(borderColor);
            turtle.forward(getSide());
            turtle.turnLeft(90);

        }
    }
}
