package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @Test
    public void oneg() {
        GHappy hap = new GHappy();
        Boolean result = hap.gHappy("fdggg");
        Assertions.assertEquals(false, result);
    }
    @ParameterizedTest()
    @CsvSource({ "oneg,false","gone,false","g,false","gg,true" })
    public void oneg2(String oneg, boolean expectedResult) {
        Boolean result = new GHappy().gHappy(oneg);
        Assertions.assertEquals(expectedResult, result);
    }

}
