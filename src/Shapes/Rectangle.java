package Shapes;

public class Rectangle extends Quadrilateral implements Measurable  {
    public Rectangle(double length, double width){
        super(length, width);
    }


    void setLength(double length) {
    this.length = length;
    }


    void setWidth(double width) {
    this.width = width;
    }


    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }


    public double getArea() {
        return length * width;
    }

//    protected double length;
//    protected double width;
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea (double length, double width){
//    return this.length * this.width;
//    }
//    public double getPerimeter(double length, double width){
//        return (this.length * 2) * (this.width * 2);
//    }
//
//    public static void main(String[] args) {
//       System.out.println(getArea(5, 5));
//       System.out.println(getPerimeter(5,5));
//    }

}
