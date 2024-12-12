package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CreateNameFileTest {

    @Test
    public void createNameFile() {
        CreateNameFile createNameFile = new CreateNameFile();
        String text = "Привет";
        String expected = createNameFile.createNameFile(text);
        String actual = "ПРИВЕТ";
        Assert.assertEquals(expected, actual);
    }
}