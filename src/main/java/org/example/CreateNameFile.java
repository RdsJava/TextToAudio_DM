package org.example;

public class CreateNameFile {

    public String createNameFile(String text) {
                String firstStringNoWhiteSpaceStartEnd = text
                        .replaceAll("^\\s+", "")
                        .replaceAll("\\s+$", "")
                        .replaceAll("\\s", "_");
                return firstStringNoWhiteSpaceStartEnd.toUpperCase();
    }
}