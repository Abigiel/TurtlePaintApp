package com.pluralsight;

import com.pluralsight.forms.Turtle;

import java.awt.*;
import java.awt.geom.Point2D;

public abstract class Shape {
    protected Color borderColor;
    protected double borderWidth;
    protected Turtle turtle;
    protected Point location;

    public Shape(Color borderColor, double borderWidth, Turtle turtle, Point location) {
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
        this.turtle = turtle;
        this.location = location;
    }

    public abstract void paint();
}
