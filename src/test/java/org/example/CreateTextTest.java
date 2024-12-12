package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CreateTextTest {

    @Test
    public void createText() {
        CreateText createText = new CreateText();
        String text = "Привет";

        String expected = null;
        try {
            expected = createText.createText(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String actual = "Привет";

        Assert.assertEquals(expected, actual);

    }
}