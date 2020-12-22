package tudelft.sum;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void singletest() {
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers((12;13));
        Assertions.assertEquals(false, result);
    }

    //@ParameterizedTest()
   // @CsvSource({ "12,12,(1,2)"})
    //public void addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second, ArrayList<Integer> expectedResult) {
    //    ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(first,second);
    //    Assertions.assertEquals(expectedResult, result);
    //}

}
