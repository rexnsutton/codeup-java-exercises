package Shapes;

  class Square extends Quadrilateral{
      public Square(double length, double width) {
          super(length, width);
      }

      public void Square (){

      }
      @Override
      void setLength(double length) {
        this.length = length;
      }

      @Override
      void setWidth(double width) {
        this.width = width;
      }

      @Override
      public double getPerimeter() {
          return (length * 2) + (width * 2);
      }

      @Override
      public double getArea() {
          return length * width;
      }

//   public Square(double side) {
//    super(side, side);
//       }
////       public double getArea(){
////
////       }



   }
