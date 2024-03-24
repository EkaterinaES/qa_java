package LionTest;

import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

public class LionExceptionTest {
    private final String INCORRECT_SEX = "Кто-то";

    @Test
    public void testMethodThrowsException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion(INCORRECT_SEX));
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = exception.getMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

}

