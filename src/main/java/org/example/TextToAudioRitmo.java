package org.example;

import org.example.maps.MapRitmo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextToAudioRitmo {
    public void textToAudioRitmo(String text) throws IOException {

        PathToAudio pathToAudio = new PathToAudio();
        Concatenate concatenate = new Concatenate();
        Duration duration = new Duration();
        RenameFile renameFileF = new RenameFile();
        String filePathName = pathToAudio.getPathToAudio() + "готовое/";
        CreateNameFile fileName = new CreateNameFile();
        CheckAudioText checkAudioText = new CheckAudioText();

        CreateForConcatenateFile createForConcatenateFile = new CreateForConcatenateFile();
        String [] language = createForConcatenateFile.CreateForConcatenateFile(text, "Ritmo");

        try {
            concatenate.concatenateFiles(language, filePathName + fileName + " P ");
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File fileLanguage = new File(filePathName + fileName + " P ");
        renameFileF.renameFile(filePathName + fileName + " P ", duration.durationFileOnly48kGh(fileLanguage), ".wav");

        checkAudioText.checkAudioText(language, "Ritmo");
    }
}


