package Calculator;

public class Square extends Figure{
    double side;
    double area;
    Square(double a){
        side = a;
    }
    public static double SquareArea(double a){
        return a*a;
    }
}
