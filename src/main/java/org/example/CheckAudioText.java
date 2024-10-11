package org.example;

public class CheckAudioText {

    public void checkAudioText(String[] language) {
        System.out.println(language[0]);

        String checkEndLanguage = "";
        String endFileName = "";

        PathToAudio pathToAudio = new PathToAudio();
        ChoiceLanguage choiceLanguage = new ChoiceLanguage();

        if (choiceLanguage.getChoiceLanguage() == 1) {
            System.out.println("choiceLanguage.getChoiceLanguage() " + choiceLanguage.getChoiceLanguage());
            checkEndLanguage = "оль";
            endFileName = " Ц ";
        }

            String listString = String.join(",", language);
            listString = listString.replace(".wav," + pathToAudio.getPathLanguageCiklo(), "");
            listString = listString.replace(pathToAudio.getPathLanguageCiklo(), "");
            listString = listString.replace(checkEndLanguage, "");

            System.out.println(endFileName + " с удалением путей -> " + listString);
        }
    }
