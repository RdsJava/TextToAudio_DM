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

        String[] language = new String[string.length()];
        String ss;

        language[0] = "F:\\textToAudio/Начало_переизлучения.wav";

        if (choiceLanguage.equals("Ciklo")) {
            MapCiklo mapCiklo = new MapCiklo();
            for (int i = 1; i < string.length(); i++) {
                ss = mapCiklo.replace(string.charAt(i));
                language[i] = ss;
            }

        } else if (choiceLanguage.equals("Nomernoi")) {
            MapNomernoi mapNomernoi = new MapNomernoi();
            for (int i = 1; i < string.length(); i++) {
                ss = mapNomernoi.replace(string.charAt(i));
                language[i] = ss;
            }

        } else if (choiceLanguage.equals("Ritmo")) {
            MapRitmo mapRitmo = new MapRitmo();
            for (int i = 1; i < string.length(); i++) {
                ss = mapRitmo.replace(string.charAt(i));
                language[i] = ss;
            }
        }

        return language;
    }
}

