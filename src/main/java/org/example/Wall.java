package org.example;

public class Wall {
    // Instance variables
    private double width;
    private double height;

    // Constructor for width and height
    public Wall(double width, double height) {
        this.width = width > 0 ? width : 0;  // Ensure non-negative values
        this.height = height > 0 ? height : 0;  // Ensure non-negative values
    }

    // Methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width >= 0 ? width : 0;  // Ensure non-negative values
    }

    public void setHeight(double height) {
        this.height = height >= 0 ? height : 0;  // Ensure non-negative values
    }

    public double getArea() {
        return width * height;
    }
}
