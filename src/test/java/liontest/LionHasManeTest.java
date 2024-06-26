package liontest;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionHasManeTest {
    private final String SEX;
    private final boolean EXPECTED_HAS_MANE;

    public LionHasManeTest(String SEX, boolean EXPECTED_HAS_MANE) {
        this.SEX = SEX;
        this.EXPECTED_HAS_MANE = EXPECTED_HAS_MANE;
    }

    @Parameterized.Parameters(name = "У {0} есть грива - {1}")
    public static Object[][] getData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void HasManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(SEX, feline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(EXPECTED_HAS_MANE, actual);
    }
}
