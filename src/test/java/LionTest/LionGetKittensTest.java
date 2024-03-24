package LionTest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensTest {
    @Mock
    Feline feline;

    @Test
    public void getKittenTest() {
        Lion lion = new Lion(feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

}
