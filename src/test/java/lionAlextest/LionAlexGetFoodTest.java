package lionAlextest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
@RunWith(MockitoJUnitRunner.class)
public class LionAlexGetFoodTest {
    @Mock
    Feline feline;

    @Test
    public void getFoodLionTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        lionAlex.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
}
