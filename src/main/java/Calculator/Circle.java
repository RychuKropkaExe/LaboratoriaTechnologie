package Calculator;
public class Circle {
    double radius;
    double area;
    Circle(double a){
        radius=a;

    }
    public static double CircleArea(double r){
        return r*r*Math.PI;
    }

}
