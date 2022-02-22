package models;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int dim1, int dim2) {
        width = dim1;
        height = dim2;
    }

    @Override
    public int calcPerimeter() {
        return (width+height)*2;
    }

    public double calcDiag() {
        return (Math.sqrt((height*height)+(width*width)));
    }
}
