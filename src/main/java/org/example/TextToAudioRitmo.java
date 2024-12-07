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
        String filePath = pathToAudio.getPathToAudio() + "готовое/";
        CreateNameFile fileNames = new CreateNameFile();
        CheckAudioText checkAudioText = new CheckAudioText();
        CreateForConcatenateFile createForConcatenateFile = new CreateForConcatenateFile();
        WavToMp3Converter wavToMp3Converter = new WavToMp3Converter();

        String fileName = fileNames.createNameFile(text);
        String [] language = createForConcatenateFile.CreateForConcatenateFile(text, "Ritmo");

        try {
            concatenate.concatenateFiles(language, filePath + fileName + "_Р_");
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File fileLanguage = new File(filePath + fileName + "_Р_");

        String nameFileWav = renameFileF.renameFile(filePath + fileName + "_Р_", duration.durationFileOnly48kGh(fileLanguage), ".wav");
        String nameFileMp3 = nameFileWav.replaceAll("wav", "mp3");

        wavToMp3Converter.converterWavToMp3(nameFileWav, nameFileMp3);
        checkAudioText.checkAudioText(language, "Ritmo");
    }
}


