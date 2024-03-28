package felinetest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetKittensTest {
    @Spy
    private Feline feline;


    @Test
    public void getKittensNoParamTest() {
        feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensWithParamTest() {
        int actual = feline.getKittens(feline.getKittens());
        Assert.assertEquals(feline.getKittens(), actual);
    }
}
