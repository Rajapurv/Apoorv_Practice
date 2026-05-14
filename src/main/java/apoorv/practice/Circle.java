package apoorv.practice;

public class Circle {
    private int radius;
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public double calculateArea(){
        return 3.17 * radius *radius;
    }
    public double calculatePerimeter(){
        return 2*3.17*radius;
    }
}
