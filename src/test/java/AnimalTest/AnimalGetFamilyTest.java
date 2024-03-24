package AnimalTest;

import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class AnimalGetFamilyTest {
    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals(expected, actual);
    }
}