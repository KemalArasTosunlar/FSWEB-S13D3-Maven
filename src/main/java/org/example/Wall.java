package org.example;

public class Wall {
    // Instance variables
    private double width;
    private double height;

    // Constructor for width and height
    public Wall(double width, double height) {
        // Set to 0 if negative values are provided
        this.width = Math.max(width, 0);  // Ensure non-negative width
        this.height = Math.max(height, 0);  // Ensure non-negative height
    }

    // Methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = Math.max(width, 0);  // Ensure non-negative values
    }

    public void setHeight(double height) {
        this.height = Math.max(height, 0);  // Ensure non-negative values
    }

    public double getArea() {
        return width * height;
    }
}
