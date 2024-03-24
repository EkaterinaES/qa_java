package CatTest;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

public class CatExceptionTest {
    private final String INCORRECT_ANIMAL_KIND = "Другое";

    @Test
    public void testMethodThrowsException() {
        Animal cat = new Animal();
        Exception exception = Assert.assertThrows(Exception.class, () -> cat.getFood(INCORRECT_ANIMAL_KIND));
        String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        String actualMessage = exception.getMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}