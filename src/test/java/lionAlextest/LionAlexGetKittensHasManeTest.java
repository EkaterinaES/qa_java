package lionAlextest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexGetKittensHasManeTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception{
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertTrue(lionAlex.doesHaveMane());
    }
}
