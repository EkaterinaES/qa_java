package lionAlextest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexGetPlaceGetFriendsTest {
    @Mock
    Feline feline;

    @Test
    public void GetPlaceOfLivingTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expected = "Нью-Йоркский зоопарк";
        Assert.assertEquals(expected, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getFriendsTest() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expected = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман").toString();
        Assert.assertEquals(expected, lionAlex.getFriends().toString());
    }

}
