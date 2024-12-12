package org.example;

import org.example.maps.MapCiklo;
import org.example.maps.MapNomernoi;
import org.example.maps.MapRitmo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class CreateForConcatenateFile {

    public String[] CreateForConcatenateFile(String text, String choiceLanguage) throws IOException {


        CreateText createText = new CreateText();
        String string = createText.createText(text);

        StringBuilder ss = new StringBuilder();
        String[] language = new String[string.length()];


        ss.append("F:\\textToAudio/Начало_переизлучения.wav" + ",");

        if (choiceLanguage.equals("Ciklo")) {
            MapCiklo mapCiklo = new MapCiklo();
            for (int i = 0; i < string.length(); i++) {
                ss.append(mapCiklo.replace(string.charAt(i)));
                ss.append(",");
                //language[i] = ss;
            }

        } else if (choiceLanguage.equals("Nomernoi")) {
            MapNomernoi mapNomernoi = new MapNomernoi();
            for (int i = 0; i < string.length(); i++) {
                ss.append(mapNomernoi.replace(string.charAt(i)));
                ss.append(",");
                //language[i] = ss;
            }

        } else if (choiceLanguage.equals("Ritmo")) {
            MapRitmo mapRitmo = new MapRitmo();
            for (int i = 0; i < string.length(); i++) {
                ss.append(mapRitmo.replace(string.charAt(i)));
                ss.append(",");
                //language[i] = ss;
            }
        }

        ss.append("F:\\textToAudio/Конец_переизлучения.wav");

        String sbString = ss.toString();
        language = sbString.split(",");

        

        return language;
    }
}

