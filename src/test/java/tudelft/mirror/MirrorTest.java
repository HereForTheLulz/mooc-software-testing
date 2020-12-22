package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void NoMirror() {
        Mirror mir = new Mirror();
        String result = mir.mirrorEnds("12345");
        Assertions.assertEquals("", result);
    }


    @Test
    public void Mirror() {
        Mirror mir = new Mirror();
        String result = mir.mirrorEnds("131");
        Assertions.assertEquals("1", result);
    }
}

