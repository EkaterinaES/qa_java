package felinetest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineExceptionTest {
    private final String INCORRECT_ANIMAL_KIND = "Другое";

    @Test
    public void testMethodThrowsException() {
        Feline feline = new Feline();
        Exception exception = Assert.assertThrows(Exception.class, () -> feline.getFood(INCORRECT_ANIMAL_KIND));
        String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        String actualMessage = exception.getMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
