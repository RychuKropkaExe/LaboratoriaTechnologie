package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class SquareTest {


    @Test
    public void shouldCalculatearea(){
        Square square = new Square(2);
        Assertions.assertEquals(4, square.squarearea());
    }
    @Test
    public void shouldCalculateare2(){
        Square square = new Square(Math.PI);
        Assertions.assertEquals(Math.PI*Math.PI,square.squarearea());
    }
}