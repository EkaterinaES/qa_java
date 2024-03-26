package felinetest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.List;
@RunWith(Parameterized.class)
public class FelineEatFoodTest {
    private final String EAT_FOOD;
    private final List<String> WHAT_EAT;

    public FelineEatFoodTest(String EAT_FOOD, List<String> WHAT_EAT) {
        this.EAT_FOOD = EAT_FOOD;
        this.WHAT_EAT = WHAT_EAT;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void eatFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.getFood(EAT_FOOD);
        Assert.assertEquals(WHAT_EAT, actual);
    }
}

