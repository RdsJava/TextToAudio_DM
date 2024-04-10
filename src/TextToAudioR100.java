import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextToAudioR100 {
    public void textToAudioR100(String text) throws IOException {

        Concatenate concatenateR100 = new Concatenate();
        Duration duration = new Duration();
        MapR100 mapR100 = new MapR100();
        List<String> lines = new ArrayList<>();
        List<String> r100 = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderCheck = new StringBuilder();
        String filePathName = "F:\\textToAudio/готовое/";
        RenameFile renameFileF = new RenameFile();

        FileReader fr = new FileReader("F:\\textToAudio/doc.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("F:\\textToAudio/docR100.txt");
        String line = text;

        //String firstStringNoWhiteSpaceStartEnd = text.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
        String fileName = "Проба";//firstStringNoWhiteSpaceStartEnd.toUpperCase();

        // Удаление пустых строк и пробелов в конце и в начале строк

        while ((line = br.readLine()) != null) {
            line = line.trim(); // remove leading and trailing whitespace
            line = line.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
            line = line.replaceAll("\\s+", " ").trim().concat("\n");
            line = line.replaceAll("(?m)^[ \t]*\r?\n", ""); //удалением пустых строк
            line = line.replaceAll("\\s", "_"); //Замена пробелов на '_'

            if (!line.equals("")) {

                if (Character.isUpperCase(line.charAt(0))) {
                    stringBuilder.append("@").append(line.charAt(0));// Проверка первого символа В начале строки на Прописную букву и Добавление символа '@' перед ним
                    for (int i = 1; i < line.length(); i++) {
                        if (Character.isUpperCase(line.charAt(i))) {  //Проверка строки на наличие прописных букв и добавление символа '$' перед ними
                            stringBuilder.append("$").append(line.charAt(i));
                        } else if (line.charAt(i) == '.') { //Проверка строки на наличие точки '#' после неё
                                stringBuilder.append("#");
                        } else {
                            stringBuilder.append(line.charAt(i));
                        }
                    }
                }
            }
        }
        System.out.println("line " + lines);
        System.out.println();

        fr.close(); // Закрытие FileReader
        fw.close(); // Закрытие BufferedReader

        System.out.println("stringBuilder " + stringBuilder);
        String string = String.valueOf(stringBuilder);

        if (string.endsWith("_")) {
            string = string.substring(0, string.length() - 1);
        }

        string = ">" + string; //Открытие языка
        string += ">"; // Закрытие языка


        System.out.println("string " + string);
        for (int i = 0; i < string.length(); i++) {
            stringBuilderCheck.append(mapR100.replaceR100(string.charAt(i))).append(",");

        }
// Создать arryList и загнмть туда stringBilderCheck

        r100 = Collections.singletonList(String.valueOf(stringBuilderCheck));







        try {
            concatenateR100.concatenateFiles(r100, filePathName + fileName + "_Ц+ ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        File fileC = new File(filePathName + fileName + "_Ц+ ");

        renameFileF.rename(filePathName + fileName + "_Ц+ ", duration.durationFile(fileC), ".wav");



        String listString = String.join(",", stringBuilderCheck);
        listString = listString.replace(".wav,F:\\textToAudio/R100_DM/Smoll/", "").replace("ОЗРА", "_");
        listString = listString.replace("F:\\textToAudio/R100_DM/Big/", "").replaceAll("\\d", ""); //replaceAll("\\d", "") удаляет все цифры
        listString = listString.replace("F:\\textToAudio/R_DM/", "").replace(".wav,", "*");

        //System.out.println(stringBuilderCheck);
        System.out.println("Радастеид-100 с удалением путей++ " + listString);
    }
}


