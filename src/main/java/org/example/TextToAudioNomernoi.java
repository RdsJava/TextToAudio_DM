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

            CreateNameFile fileNames = new CreateNameFile();
            CheckAudioText checkAudioText = new CheckAudioText();
            CreateForConcatenateFile createForConcatenateFile = new CreateForConcatenateFile();
            WavToMp3Converter wavToMp3Converter = new WavToMp3Converter();

            String fileName = fileNames.createNameFile(text);
            String filePath = pathToAudio.getPathToAudio() + "готовое/";
            String[] language = createForConcatenateFile.CreateForConcatenateFile(text, "Nomernoi");

            try {
                concatenate.concatenateFiles(language, filePath + fileName + "_N_");
            } catch (
                    Exception e) {
                e.printStackTrace();
            }

            File fileLanguage = new File(filePath + fileName + "_N_");

            String nameFileWav = renameFileF.renameFile(filePath + fileName + "_N_", duration.durationFileOnly48kGh(fileLanguage), ".wav");
            String nameFileMp3 = nameFileWav.replaceAll("wav", "mp3");

            wavToMp3Converter.converterWavToMp3(nameFileWav, nameFileMp3);
            checkAudioText.checkAudioText(language, "Nomernoi");
        }
    }
