package calculator;

public class Square extends Figure{
    static double side;
    static double area;
    Square(double a){
        side = a;
    }
    public static double SquareArea(){
        return side*side;
    }

}
