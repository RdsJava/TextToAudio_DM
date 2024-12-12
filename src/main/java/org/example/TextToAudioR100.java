package org.example;

import org.example.maps.MapR100;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextToAudioR100 {
    public void textToAudioR100(String text) throws IOException {

        PathToAudio pathToAudio = new PathToAudio();
        Concatenate concatenateR100 = new Concatenate();
        Duration duration = new Duration();
        MapR100 mapR100 = new MapR100();
        RenameFile renameFileF = new RenameFile();
        IfDigitalInWords ifDigital = new IfDigitalInWords();
        WavToMp3Converter wavToMp3Converter = new WavToMp3Converter();
        CreateNameFile createNameFile = new CreateNameFile();

        String filePath = pathToAudio.getPathToAudio() + "готовое/";
        List<String> lines = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();

        FileReader fr = new FileReader(pathToAudio.getPathToAudio() + "doc.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(pathToAudio.getPathToAudio() + "docR100.txt");
        String line = text;


        String fileName = createNameFile.createNameFile(text);


        // Удаление пустых строк и пробелов в конце и в начале строк++
        while ((line = br.readLine()) != null) {
            line = line.trim(); // remove leading and trailing whitespace
            line = line.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
            line = line.replaceAll("\\s+", " ").trim().concat("\n");
            line = line.replaceAll("(?m)^[ \t]*\r?\n", ""); //удалением пустых строк
            line = line.replaceAll("\\s", "_"); //Замена пробелов на '_'

            if (!line.isEmpty()) {
                if (Character.isUpperCase(line.charAt(0))) {
                    stringBuilder.append("^").append(line.charAt(0)); // Проверка первого символа В начале строки на Прописную букву и Добавление символа '@' перед ним
                } else if (Character.isLowerCase(line.charAt(0))) {
                    stringBuilder.append(line.charAt(0)); // Проверка первого символа В начале строки на строчную букву
                } else if (String.valueOf(line.charAt(0)).matches("\\d")) { // Проверка на цифру(от 0 до 9) с возвратом цифруСловом
                    stringBuilder.append(ifDigital.checkDigitalChar(line.charAt(0)));
                }
            }

            for (int i = 1; i < line.length(); i++) {
                if (Character.isUpperCase(line.charAt(i))) {  //Проверка строки на наличие Прописных букв и добавление символа '#' перед ними
                    stringBuilder.append("#").append(line.charAt(i));
                } else if (line.charAt(i) == '.') {
                    stringBuilder.append(line.charAt(i)).append("$");
                } else if (line.charAt(i) == '!') {
                    stringBuilder.append(line.charAt(i)).append("$");
                } else if (line.charAt(i) == '?') {
                    stringBuilder.append(line.charAt(i)).append("$");
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
        //string = "%"; // добавления фразы "начало п.."
        string = "%" + ">" + string; //Открытие языка
        string = string + ">" + "*"; // Закрытие языка
        System.out.println("string " + string);

        String[] rad100 = new String[string.length()];
        String ss;
        for (
                int i = 0; i < string.length(); i++) {
            ss = mapR100.replaceR100(string.charAt(i));
            rad100[i] = ss;
        }

        try {
            concatenateR100.concatenateFiles(rad100, filePath + fileName + "_Р100_");
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File fileR100 = new File(filePath + fileName + "_Р100_");
        String nameFileWav = renameFileF.renameFile(filePath + fileName + "_Р100_", duration.durationFileOnly48kGh(fileR100), ".wav");
        String nameFileMp3 = nameFileWav.replaceAll("wav", "mp3");

        wavToMp3Converter.converterWavToMp3(nameFileWav, nameFileMp3);


        String listString = String.join(",", rad100);
        listString = listString.replace(
                ".wav," + pathToAudio.getPathLanguageR100(), "");

        listString = listString.replace(
                ".wav," + pathToAudio.getPathLanguageR100(), "")
                        .replaceAll("\\d", ""); //replaceAll("\\d", "") удаляет все цифры

        listString = listString.replace(
                "ЦЖ (Заглавные буквы в начале строки)", "+ЦЖ_");
        listString = listString.replace(
                "ЩХ (Заглавные буквы внутри строки)", "+ЩХ_");
        listString = listString.replace(
                "ФШ (знаки препинания)", "+ФШ ");
        listString = listString.replace(
                "ОЗРА (отделяет слова)", "_");
        listString = listString.replace(
                "СТЛУ (отделяет предложения)", "+СТЛУ ");
        listString = listString.replace(
                "РИТЛ (Открывает закрывает)", " +РИТЛ ");
        listString = listString.replace(
                pathToAudio.getPathLanguageR100(), "");
        listString = listString.replace(
                ".wav", " ");
        listString = listString.replace(
                "F:/YandexDisk/textToAudio/R_DM", "");

        listString = listString.replace(
                pathToAudio.getPathToAudio(), "");
        listString = listString.replace(
                "/", "");

        listString = listString.replace(
                " ", "*");

        //System.out.println(stringBuilderCheck);
        System.out.println(
                "Радастеид-100 с удалением путей -> " + listString);
    }
}



