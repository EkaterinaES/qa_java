package FelineTest;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineGetFamilyTest {
    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }

}
