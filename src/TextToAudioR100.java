import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TextToAudioR100 {
    public void textToAudioR100(String text) throws IOException {

        Concatenate concatenateR100 = new Concatenate();
        Duration duration = new Duration();
        MapR100 mapR100 = new MapR100();
        List<String> lines = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderCheck = new StringBuilder();
        String filePathName = "F:\\textToAudio/готовое/";
        RenameFile renameFileF = new RenameFile();

        FileReader fr = new FileReader("F:\\textToAudio/doc.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("F:\\textToAudio/docR100.txt");
        String line = text;

        String firstStringNoWhiteSpaceStartEnd = text.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
        String fileName = firstStringNoWhiteSpaceStartEnd.toUpperCase();

        // Удаление пустых строк и пробелов в конце и в начале строк

        while ((line = br.readLine()) != null) {
            line = line.trim(); // remove leading and trailing whitespace
            line = line.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
            line = line.replaceAll("\\s+", " ").trim().concat("\n");
            line = line.replaceAll("(?m)^[ \t]*\r?\n", ""); //удалением пустых строк
            line = line.replaceAll("\\s", "_"); //Замена пробелов на '_'

            if (!line.equals("")) {

                if (Character.isUpperCase(line.charAt(0))) {
                    stringBuilder.append("@").append(line.charAt(0));
                } else if (line.charAt(0) == '1' && line.charAt(1) == '0') {
                    stringBuilder.append("десять");
                } else if (line.charAt(0) == '0') {
                    stringBuilder.append("ноль");
                } else if (line.charAt(0) == '1') {
                    stringBuilder.append("один");
                } else if (line.charAt(0) == '2') {
                    stringBuilder.append("два");
                } else if (line.charAt(0) == '3') {
                    stringBuilder.append("три");
                } else if (line.charAt(0) == '4') {
                    stringBuilder.append("четыре");
                } else if (line.charAt(0) == '5') {
                    stringBuilder.append("пять");
                } else if (line.charAt(0) == '6') {
                    stringBuilder.append("шесть");
                } else if (line.charAt(0) == '7') {
                    stringBuilder.append("семь");
                } else if (line.charAt(0) == '8') {
                    stringBuilder.append("восемь");
                } else if (line.charAt(0) == '9') {
                    stringBuilder.append("девять");



                    stringBuilder.append("десять");// Проверка первого символа В начале строки на Прописную букву и Добавление символа '@' перед ним
                    for (int i = 0; i < line.length(); i++) {
                        if (Character.isUpperCase(line.charAt(i))) {  //Проверка строки на наличие прописных букв и добавление символа '$' перед ними
                            stringBuilder.append("$").append(line.charAt(i));
                        } else if (line.charAt(i) == '.') {
                            stringBuilder.append(line.charAt(i)).append("#");
                        } else if (line.charAt(i) == '!') {
                            stringBuilder.append(line.charAt(i)).append("#");
                        } else if (line.charAt(i) == '?') {
                            stringBuilder.append(line.charAt(i)).append("#");
                        } else if (line.charAt(i) == '0') {
                            stringBuilder.append("ноль");
                        } else if (line.charAt(i) == '1') {
                            stringBuilder.append("один");
                        } else if (line.charAt(i) == '2') {
                            stringBuilder.append("два");
                        } else if (line.charAt(i) == '3') {
                            stringBuilder.append("три");
                        } else if (line.charAt(i) == '4') {
                            stringBuilder.append("четыре");
                        } else if (line.charAt(i) == '5') {
                            stringBuilder.append("пять");
                        } else if (line.charAt(i) == '6') {
                            stringBuilder.append("шесть");
                        } else if (line.charAt(i) == '7') {
                            stringBuilder.append("семь");
                        } else if (line.charAt(i) == '8') {
                            stringBuilder.append("восемь");
                        } else if (line.charAt(i) == '9') {
                            stringBuilder.append("девять");
                        } else if (line.charAt(i) == '1' && line.charAt(i + 1) == '0') {
                            stringBuilder.append("десять");

                        } else {
                            stringBuilder.append(line.charAt(i));
                        }
                    }
                }
            }
        }
        System.out.println("line " + lines);
        System.out.println();

        fr.close(); // Закрытие FileReader
        fw.close(); // Закрытие BufferedReader

        System.out.println("stringBuilder " + stringBuilder);
        String string = String.valueOf(stringBuilder);

        if (string.endsWith("_")) {
            string = string.substring(0, string.length() - 1);
        }

        string = ">" + string; //Открытие языка
        string += ">"; // Закрытие языка

        System.out.println("string " + string);
        String[] rad100 = new String[string.length()];
        String ss = null;
        for (int i = 0; i < string.length(); i++) {
            ss = mapR100.replaceR100(string.charAt(i));
            rad100[i] = ss;
        }

        try {
            concatenateR100.concatenateFiles(rad100, filePathName + fileName + "_Р100 ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        File fileC = new File(filePathName + fileName + "_Р100 ");

        renameFileF.rename(filePathName + fileName + "_Р100 ", duration.durationFile(fileC), ".wav");


        String listString = String.join(",", rad100);
        listString = listString.replace(".wav,F:\\textToAudio/R100_DM/Smoll/", "").replace("ОЗРА", "_");
        listString = listString.replace("F:\\textToAudio/R100_DM/Big/", "").replaceAll("\\d", ""); //replaceAll("\\d", "") удаляет все цифры
        listString = listString.replace("F:\\textToAudio/R_DM/", "").replace(".wav,", "*");

        //System.out.println(stringBuilderCheck);
        System.out.println("Радастеид-100 с удалением путей++ " + listString);
    }
}


