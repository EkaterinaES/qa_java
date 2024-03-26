
package felinetest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineEatMeatTest {
    @Spy
    Feline feline;

    @Test
    public void eatMeatTest() throws Exception {
        String actual = feline.getFood("Хищник").toString();
        Assert.assertEquals(feline.eatMeat().toString(), actual);
    }
}