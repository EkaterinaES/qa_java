package LionAlexTest;

import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexGetPlaceGetFriendsTest {
    @Spy
    LionAlex lionAlex;

    @Test
    public void GetPlaceOfLivingTest() {
        lionAlex.getPlaceOfLiving();
        String expected = "Нью-Йоркский зоопарк";
        Assert.assertEquals(expected, lionAlex.getPlaceOfLiving());
    }

    @Test
    public void getFriendsTest() {
        lionAlex.getFriends();
        String expected = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман").toString();
        Assert.assertEquals(expected, lionAlex.getFriends().toString());
    }

}
