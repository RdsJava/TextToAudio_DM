package org.example;

import org.example.maps.MapRadasteid;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextToAudioRadasteid {

    public void textToAudioRadasteid(String text) throws IOException {

        PathToAudio pathToAudio =new PathToAudio();
        Concatenate concatenate = new Concatenate();
        Duration duration = new Duration();
        MapRadasteid mapRadasteid = new MapRadasteid();
        RenameFile renameFileF = new RenameFile();
        IfDigitalInWords ifDigital =new IfDigitalInWords();
        WavToMp3Converter wavToMp3Converter = new WavToMp3Converter();

        String filePath = pathToAudio.getPathToAudio() + "готовое/";
        List<String> lines = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();

        FileReader fr = new FileReader(pathToAudio.getPathToAudio() + "doc.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(pathToAudio.getPathToAudio() + "docR100.txt");
        String line;

        String firstStringNoWhiteSpaceStartEnd = text.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
        String fileName = firstStringNoWhiteSpaceStartEnd.toUpperCase();


        stringBuilder.append("%");

        // Удаление пустых строк и пробелов в конце и в начале строк++
        while ((line = br.readLine()) != null) {
            line = line.trim(); // remove leading and trailing whitespace
            line = line.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
            line = line.replaceAll("\\s+", " ").trim().concat("\n");
            line = line.replaceAll("(?m)^[ \t]*\r?\n", ""); //удалением пустых строк
            line = line.replaceAll("\\s", "_"); //Замена пробелов на '_'


            for (int i = 0; i < line.length(); i++) {
                if (Character.isUpperCase(line.charAt(i))) {  //Проверка строки на наличие Прописных букв и добавление символа '#' перед ними
                    stringBuilder.append("#").append(line.charAt(i));
                } else if (line.charAt(i) == '.') {
                    stringBuilder.append(line.charAt(i)).append("$"); // Добовляет символ окончания Предложения
                } else if (line.charAt(i) == '!') {
                    stringBuilder.append(line.charAt(i)).append("$"); // Добовляет символ окончания Предложения
                } else if (line.charAt(i) == '?') {
                    stringBuilder.append(line.charAt(i)).append("$"); // Добовляет символ окончания Предложения
                } else if (String.valueOf(line.charAt(i)).matches("-?\\d+(\\.\\d+)?")) { // Проверка на цифру(от 0 до 9) с возвратом цифруСловом
                    stringBuilder.append(ifDigital.checkDigitalChar(line.charAt(i)));
                } else {
                    stringBuilder.append(line.charAt(i));
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
        System.out.println("string " + string);

        string = string + "*";
        System.out.println("string+ " + string);

        String[] radadasteid = new String[string.length()];
        String ss;
        for (
                int i = 0; i < string.length(); i++) {
            ss = mapRadasteid.replaceRadasteid(string.charAt(i));
            radadasteid[i] = ss;
        }

        try {
            concatenate.concatenateFiles(radadasteid, filePath + fileName + "_Радастеид_");
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File fileRadasteid = new File(filePath + fileName + "_Радастеид_");

        String nameFileWav = renameFileF.renameFile(filePath + fileName + "_Радастеид_", duration.durationFileOnly48kGh(fileRadasteid), ".wav");
        String nameFileMp3 = nameFileWav.replaceAll("wav", "mp3");

        wavToMp3Converter.converterWavToMp3(nameFileWav, nameFileMp3);

        String listString = String.join(",", radadasteid);
       // listString = listString.replace(".wav," + pathToAudio.getPathLanguageRadasteid(), "");
       listString = listString.replace(".wav,", "");
        listString = listString.replace(pathToAudio.getPathLanguageRadasteid(), "");
        listString = listString.replace(pathToAudio.getPathToAudio(), "");
       // listString = listString.replace("/", "");


        System.out.println("Радастеид с удалением путей -> " + listString);
    }
}

