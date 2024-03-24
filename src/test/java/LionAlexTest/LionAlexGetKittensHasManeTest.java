package LionAlexTest;

import com.example.Lion;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class LionAlexGetKittensHasManeTest {
    @Spy
    LionAlex lionAlex;

    @Test
    public void getKittensTest() {
        lionAlex.getKittens();
        Assert.assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void doesHaveManeTest() {
        boolean hasMane = lionAlex.doesHaveMane();
        Assert.assertTrue(hasMane);
    }
}
