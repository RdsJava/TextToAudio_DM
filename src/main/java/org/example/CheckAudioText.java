package org.example;

public class CheckAudioText {

    public void checkAudioText(String[] language, String choiceLanguage) {

        String checkEndLanguage = "";
        String endFileName = "";
        String path = "";

        PathToAudio pathToAudio = new PathToAudio();

        if (choiceLanguage.equals("Ciklo")) {
            checkEndLanguage = "оль";
            endFileName = " Цикло ";
            path = pathToAudio.getPathLanguageCiklo();

        } else if (choiceLanguage.equals("Nomernoi")) {
            checkEndLanguage = "";
            endFileName = " Номерной ";
            path = pathToAudio.getPathLanguageNomernoi();

        } else if (choiceLanguage.equals("Ritmo")) {
            checkEndLanguage = "ИРЪ";
            endFileName = " Ритмо ";
            path = pathToAudio.getPathLanguageRitmo();
        }

        String listString = String.join(",", language);
        listString = listString.replace(".wav," + path, "");
        listString = listString.replace(".wav", "");
        listString = listString.replace(path, "");
        listString = listString.replace(checkEndLanguage, "");
        listString = listString.replace("F:\\textToAudio/Начало_переизлучения",  "Фраза Начало ");
        listString = listString.replace(",F:\\textToAudio/Конец_переизлучения",  " Фраза Конец");

        System.out.println(endFileName + " с удалением путей -> " + listString);
    }
}
