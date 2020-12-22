package tudelft.even;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class eventesttest {

    @Test
    public void AllEven() {
        int words = new eventest().evenquestion(22,200);
        Assertions.assertEquals(0, words);
    }
    @Test
    public void AllUneven() {
        int words = new eventest().evenquestion(21,201);
       Assertions.assertEquals(0, words);
    }
    @Test
    public void AllNoBranch() {
        int words = new eventest().evenquestion(2,2);
        Assertions.assertEquals(0, words);
    }
}
