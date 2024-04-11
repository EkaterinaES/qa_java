package liontest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {
    private final String INCORRECT_SEX = "Кто-то";
    @Mock
    Feline feline;

    @Test
    public void testMethodThrowsException() {
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion(INCORRECT_SEX, feline));
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        String actualMessage = exception.getMessage();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

}

