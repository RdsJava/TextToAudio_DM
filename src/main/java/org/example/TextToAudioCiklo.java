package org.example;

import org.example.maps.MapCiklo;

import java.io.*;

public class TextToAudioCiklo {
    public void textToAudioCiklo(String text) throws IOException {


        PathToAudio pathToAudio = new PathToAudio();
        String filePathName = pathToAudio.getPathToAudio() + "готовое/";
        Concatenate concatenate = new Concatenate();
        Duration duration = new Duration();
        RenameFile renameFileF = new RenameFile();
        CreateNameFile fileName = new CreateNameFile();
        CheckAudioText checkAudioText = new CheckAudioText();
        CreateForConcatenateFile createForConcatenateFile = new CreateForConcatenateFile();
        String[] language = createForConcatenateFile.CreateForConcatenateFile(text, "Ciklo");

        try {
            concatenate.concatenateFiles(language, filePathName + fileName + " Ц ");
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File fileLanguage = new File(filePathName + fileName + " Ц ");
        renameFileF.renameFile(filePathName + fileName + " Ц ", duration.durationFileOnly48kGh(fileLanguage), ".wav");

        checkAudioText.checkAudioText(language, "Ciklo");

    }
}


