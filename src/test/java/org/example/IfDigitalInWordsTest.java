package org.example;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

class IfDigitalInWordsTest {

    @Test
    void checkDigitalChar() {

        IfDigitalInWords ifDigitalInWords = new IfDigitalInWords();
        char digi = '1';
        String expected = "один";

        String actual = ifDigitalInWords.checkDigitalChar(digi);
        Assert.assertEquals(expected, actual);
    }
}