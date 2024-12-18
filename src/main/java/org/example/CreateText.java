package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateText {

    public String createText(String text) throws IOException {

        PathToAudio pathToAudio = new PathToAudio();
        IfDigitalInWords ifDigital = new IfDigitalInWords();

        String line;
        List<String> lines = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        Reader fr = new FileReader(pathToAudio.getPathToAudio() + "doc.txt");
        BufferedReader br = new BufferedReader(fr);



        // Удаление пустых строк и пробелов в конце и в начале строк++
        while ((line = br.readLine()) != null) {
            line = line.trim(); // remove leading and trailing whitespace
            line = line.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
            line = line.replaceAll("\\s+", " ").trim().concat("\n");
            line = line.replaceAll("(?m)^[ \t]*\r?\n", ""); //Удалением пустых строк
            line = line.replaceAll("\\s", "_"); //Замена пробелов на '_'
            line = line.replaceAll("[^А-ё 0-9_]", ""); //Удаление символов кроме букв и цифр
            line = line.replaceAll("__", "_"); // Замена двойных на одинарные


            if (!line.isEmpty()) {

                for (int i = 0; i < line.length(); i++) {
                    if (String.valueOf(line.charAt(i)).matches("-?\\d+(\\.\\d+)?")) { // Проверка на цифру(от 0 до 9) с возвратом цифруСловом
                        stringBuilder.append(ifDigital.checkDigitalChar(line.charAt(i)));
                    } else {
                        stringBuilder.append(line.charAt(i));
                    }
                }
            }
        }
        System.out.println("line " + lines);
        System.out.println();

        fr.close(); // Закрытие FileReader

        System.out.println("stringBuilder " + stringBuilder);
        String string = String.valueOf(stringBuilder);

        if (string.endsWith("_")) {
            string = string.substring(0, string.length() - 1);
        }
        System.out.println("string " + string);
        return string;
    }
}
