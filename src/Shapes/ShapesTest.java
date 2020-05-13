package Shapes;

import java.util.Arrays;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle rec = new Rectangle (2,3)
//        System.out.println("area: ");
//        Square sq = new Square(5);
//        System.out.println();
          Measurable myShape = new Square(5, 5);
        System.out.println(myShape.getPerimeter());
        Measurable myRectangle = new Rectangle(7,5);
        System.out.println(myRectangle.getArea());

    }
}
