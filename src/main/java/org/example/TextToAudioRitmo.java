package org.example;

import org.example.maps.MapRitmo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextToAudioRitmo {
    public void textToAudioRitmo(String text) throws IOException {

        MapRitmo map = new MapRitmo();
        String checkEndLanguage = "ИРЪ";
        String endFileName = " Р ";

        PathToAudio pathToAudio = new PathToAudio();
        Concatenate concatenate = new Concatenate();
        Duration duration = new Duration();
        RenameFile renameFileF = new RenameFile();
        String filePathName = pathToAudio.getPathToAudio() + "готовое/";
        CreateText createText = new CreateText();
        CreateNameFile fileName = new CreateNameFile();

        String string = createText.createText(text);
        String[] language = new String[string.length()];
        String ss;
        for (
                int i = 0; i < string.length(); i++) {
            ss = map.replace(string.charAt(i));
            language[i] = ss;
        }

        try {
            concatenate.concatenateFiles(language, filePathName + fileName + endFileName);
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File fileLanguage = new File(filePathName + fileName + endFileName);

        renameFileF.renameFile(filePathName + fileName + endFileName, duration.durationFileOnly48kGh(fileLanguage), ".wav");

        String listString = String.join(",", language);
        listString = listString.replace(".wav," + pathToAudio.getPathLanguageRitmo(), "");
        listString = listString.replace(pathToAudio.getPathLanguageRitmo(), "");
        listString = listString.replace(checkEndLanguage, "");

        System.out.println(endFileName + " с удалением путей++ " + listString);
    }
}


