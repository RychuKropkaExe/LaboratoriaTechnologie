package calculator;

/**
 * Main class that runs simple calculator.
 */
public final class AreaCalculator extends Square {
    private AreaCalculator() {
        super();
    }
    /**
     * basically it does the same as the whole class.
     * @param args it takes users input.
     *
     */
  public static void main(final String[] args) {
      String figure = args[0];
      double value = Double.parseDouble(args[1]);
      if (figure.equals("C")) {
          Circle tmp = new Circle(value);
          System.out.println("Your Circle has area of"
                  + " " + Circle.CircleArea(value));
          tmp.area = Circle.CircleArea(value);
      }
      if (figure.equals("S")) {
          Square tmp = new Square(value);
          System.out.println("Your Sqare has area of " + tmp.squarearea());
          tmp.setArea(Square.squarearea());
      } else {
          System.out.println("Nie wybrałeś żadnej figury, pozdrawiwam");
      }
  }

}

