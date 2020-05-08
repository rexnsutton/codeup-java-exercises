package Shapes;

public class Circle {
    private double radius;
    public Circle (double aRadius){
this.radius = aRadius;
    }

    public double getArea(){
    return Math.PI * (Math.pow(this.radius, 2));
    }
    public double getCircumference(){
    return 2 * Math.PI * this.radius;
    }
}
