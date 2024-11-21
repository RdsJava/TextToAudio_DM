package org.example;

import org.example.maps.MapNomernoi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextToAudioNomernoi {
        public void textToAudioNomernoi(String text) throws IOException {

            PathToAudio pathToAudio = new PathToAudio();
            Concatenate concatenate = new Concatenate();
            Duration duration = new Duration();
            RenameFile renameFileF = new RenameFile();
            String filePathName = pathToAudio.getPathToAudio() + "готовое/";
            CreateNameFile fileName =new CreateNameFile();
            CheckAudioText checkAudioText = new CheckAudioText();
            CreateForConcatenateFile createForConcatenateFile = new CreateForConcatenateFile();
            String[] language = createForConcatenateFile.CreateForConcatenateFile(text, "Nomernoi");

            try {
                concatenate.concatenateFiles(language, filePathName + fileName + " N ");
            } catch (
                    Exception e) {
                e.printStackTrace();
            }

            File fileLanguage = new File(filePathName + fileName + " N ");
            renameFileF.renameFile(filePathName + fileName + " N ", duration.durationFileOnly48kGh(fileLanguage), ".wav");

            checkAudioText.checkAudioText(language, "Nomernoi");
        }
    }
