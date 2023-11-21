package com.pluralsight;

import com.pluralsight.forms.Turtle;
import com.pluralsight.forms.World;

import java.awt.*;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Select an option: \n1. Add Shape \n2. Save Image \n3. Exit");
        //System.out.println("\n1. Add Shape \n2. Save Image \n3. Exit");
        int choice= scan.nextInt();
        if(choice == 1){
            System.out.println("Select a shape: \n 1. Square\n 2. Circle\n 3. Triangle\n 4. Hexagon");
            int option= scan.nextInt();

            System.out.println("What is the border width?");
            double borderWidth= scan.nextDouble();

            System.out.println("What is the border color? \n(Available colors: red|blue|black|yellow|orange|cyan|pink|green)");
            String color= scan.next();
            Color borderColor = getBorderColor(color);

            System.out.println("What is the location of the shape?\n Enter x value: ");
            int x= scan.nextInt();
            System.out.println("Enter y value:");
            int y= scan.nextInt();
            Point location = new Point(x,y);


            if(option==2){
                System.out.println("What is the radius?");
                double radius= scan.nextInt();

                World world = new World(1000, 1000);
                Turtle turtle = new Turtle(world,x,y);
                Circle circle = new Circle(borderColor, borderWidth, turtle, location, radius);

                turtle.penUp();
                turtle.goTo(x,y);
                turtle.penDown();

                circle.paint();

            } else if(option==1) {
                System.out.println("What is the length of each side?");
                double side= scan.nextDouble();

                World world = new World(1000, 1000);
                Turtle turtle = new Turtle(world,x,y);
                Square square = new Square(borderColor, borderWidth, turtle, location, side);

                turtle.penUp();
                turtle.goTo(x,y);
                turtle.penDown();

                square.paint();

            } else if(option==3) {
                System.out.println("What is the length of each side?");
                double side= scan.nextDouble();

                World world = new World(1000, 1000);
                Turtle turtle = new Turtle(world,x,y);
                Triangle triangle= new Triangle(borderColor,borderWidth, turtle, location, side);

                turtle.penUp();
                turtle.goTo(x,y);
                turtle.penDown();

                triangle.paint();

            } else if(option==4) {
                System.out.println("What is the length of each side?");
                double side= scan.nextDouble();

                World world = new World(1000, 1000);
                Turtle turtle = new Turtle(world,x,y);

                turtle.penUp();
                turtle.goTo(x,y);
                turtle.penDown();

                Hexagon hexagon = new Hexagon(borderColor, borderWidth, turtle, location, side);

                hexagon.paint();

            } else {
                System.out.println("Invalid option.");

            }
        }

    }

    private static Color getBorderColor(String color) {
        Color borderColor;
        return switch (color) {
            case "blue" -> borderColor = Color.BLUE;
            case "black" -> borderColor = Color.BLACK;
            case "red" -> borderColor = Color.RED;
            case "pink" -> borderColor = Color.PINK;
            case "green" -> borderColor = Color.GREEN;
            case "yellow" -> borderColor = Color.YELLOW;
            case "orange" -> borderColor = Color.ORANGE;
            case "cyan" -> borderColor = Color.CYAN;
            default -> null;
        };
    }
}
