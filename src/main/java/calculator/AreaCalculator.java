package calculator;

public class AreaCalculator extends Figure{
  public static void main(String[] args) {
      String figure = args[0];
      double value = Double.parseDouble(args[1]);
      if (figure.equals("C")){
          Circle tmp = new Circle(value);
          System.out.println("Your Circle has area of" + " " + Circle.CircleArea(value));
          tmp.area=Circle.CircleArea(value);
      }
      if(figure.equals("S")){
          Square tmp = new Square(value);
          System.out.println("Your Sqare has area of " + tmp.SquareArea());
          tmp.area=Square.SquareArea();
      }
      else{
          System.out.println("Nie wybrałeś żadnej figury, pozdrawiwam");
      }
  }

}

