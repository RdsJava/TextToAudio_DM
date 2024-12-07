package org.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextToAudioCiklo  {

    public void textToAudioCiklo(String text) throws IOException {


        PathToAudio pathToAudio = new PathToAudio();
        Concatenate concatenate = new Concatenate();
        Duration duration = new Duration();
        RenameFile renameFileF = new RenameFile();
        CreateNameFile fileNames = new CreateNameFile();
        CheckAudioText checkAudioText = new CheckAudioText();
        CreateForConcatenateFile createForConcatenateFile = new CreateForConcatenateFile();
        WavToMp3Converter wavToMp3Converter = new WavToMp3Converter();

        String fileName = fileNames.createNameFile(text);
        String filePath = pathToAudio.getPathToAudio() + "готовое/";
        String[] language = createForConcatenateFile.CreateForConcatenateFile(text, "Ciklo");

        try {
            concatenate.concatenateFiles(language, filePath + fileName + "_Ц_");
        } catch (
                Exception e) {
            e.printStackTrace();
        }

        File fileLanguage = new File(filePath + fileName + "_Ц_");

        String nameFileWav = renameFileF.renameFile(filePath + fileName + "_Ц_", duration.durationFileOnly48kGh(fileLanguage), ".wav");
        String nameFileMp3 = nameFileWav.replaceAll("wav", "mp3");

        wavToMp3Converter.converterWavToMp3(nameFileWav, nameFileMp3); // в строке не должно быть пробелов совсем!!!
        checkAudioText.checkAudioText(language, "Ciklo");

    }
}


