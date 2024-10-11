package org.example;

import org.example.maps.MapCiklo;

import java.io.*;

public class TextToAudioCiklo {
    public void textToAudioCiklo(String text) throws IOException {

        MapCiklo map = new MapCiklo();
        String checkEndLanguage = "оль";
        String endFileName = " Ц ";

        PathToAudio pathToAudio = new PathToAudio();
        String filePathName = pathToAudio.getPathToAudio() + "готовое/";
        Concatenate concatenate = new Concatenate();
        Duration duration = new Duration();
        RenameFile renameFileF = new RenameFile();
        //IfDigitalInWords ifDigital = new IfDigitalInWords();
       // CreateForConcanateFile createForConcanateFile = new CreateForConcanateFile();
        CreateNameFile fileName = new CreateNameFile();
        CheckAudioText checkAudioText = new CheckAudioText();


        CreateText createText = new CreateText();

        String string = createText.createText(text);
        String[] language = new String[string.length()];
        String ss;
        for (
                int i = 0; i < string.length(); i++) {
            ss = map.replace(string.charAt(i));
            language[i] = ss;
        }


        //String[] language = createForConcanateFile.CreateForConcanateFile(text);

        try {
            concatenate.concatenateFiles(language, filePathName + fileName + endFileName);
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File fileLanguage = new File(filePathName + fileName + endFileName);
        renameFileF.renameFile(filePathName + fileName + endFileName, duration.durationFileOnly48kGh(fileLanguage), ".wav");

        checkAudioText.checkAudioText(language);

/*
        String listString = String.join(",", language);
        listString = listString.replace(".wav," +  pathToAudio.getPathLanguageCiklo(), "");
        listString = listString.replace( pathToAudio.getPathLanguageCiklo(), "");
        listString = listString.replace(checkEndLanguage, "");

        System.out.println(endFileName + " с удалением путей++ " + listString);

 */
    }
}


