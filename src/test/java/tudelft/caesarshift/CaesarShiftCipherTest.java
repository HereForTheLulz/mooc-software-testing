package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest()
    @CsvSource({ "ax,1,by","r,1,s","x,1,y","z,1,a" })
    public void OneLetter(String string, int shift, String expectedResult) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(string,shift);
        Assertions.assertEquals(expectedResult, result);
    }

}
