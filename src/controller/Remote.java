package controller;

public class Remote {
    private int color;
    private double height;
    private double width;
    private double depth;

    public Remote(){
        color = 0;
        height =4;
        width =3 ;
        depth =2;

    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public int getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }
    public boolean turnOn(){
        return true;
    }
    public boolean turnOff(){
        return false;
    }

}
