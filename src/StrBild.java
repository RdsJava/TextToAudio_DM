import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StrBild {
    public void sBild() throws IOException {


        MapR100 mapR100 = new MapR100();
        List<String> lines = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderCheck = new StringBuilder();

        FileReader fr = new FileReader("F:\\textToAudio/doc.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("F:\\textToAudio/docR100.txt");
        String line;


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

        String listString = String.join(",", stringBuilderCheck);
        listString = listString.replace(".wav,F:\\textToAudio/R100_DM/Smoll/", "").replace("ОЗРА", "_");
        listString = listString.replace("F:\\textToAudio/R100_DM/Big/", "").replaceAll("\\d", ""); //replaceAll("\\d", "") удаляет все цифры
        listString = listString.replace("F:\\textToAudio/R_DM/", "").replace(".wav,", "*");

        //System.out.println(stringBuilderCheck);
        System.out.println("Радастеид-100 с удалением путей++ " + listString);
    }
}


