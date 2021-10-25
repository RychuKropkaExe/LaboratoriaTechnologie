package Calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {


    @Test
    public void shouldCalculatearea(){
        Square square = new Square(2);
        Assertions.assertEquals(4,square.SquareArea());
    }
}