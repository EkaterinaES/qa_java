package LionTest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodTest {
    @Spy
    Feline feline;

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion(feline);
        lion.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getFoodFelineTestIntoGetFood() throws Exception {
        String actual = feline.getFood("Хищник").toString();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба").toString(), actual);
    }
}
