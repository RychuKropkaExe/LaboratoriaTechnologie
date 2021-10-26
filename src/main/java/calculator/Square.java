package calculator;

/**
 * A class to describe Square.
 */
public class Square extends Figure {
    /**
     * a variable with value of a side.
     */
    private static double side;
    /**
     * varibale holding a value of area.
     */
    private static double area;
    Square(final double a) {
        side = a;
    }

    /**
     * a metod to calculate area of given square.
     * @return area of square.
     */
    public static double squarearea() {
        return side * side;
    }

    /**
     * setter for area.
     * @param value area.
     */
    public void setArea(final double value) {
        area = value;
    }


}
