import org.junit.jupiter.api.Test;


import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class MainTest {

    @Test
    public void TestCanAddFirstTenRealNumbers() {
        int num = 0;
        assertThrows(IllegalArgumentException.class,
                () -> {
                    int number = new Random().nextInt();
                    number = number*(-1);

                    Main.sumFirstTenRealNumbers(number);

                });
    }
}