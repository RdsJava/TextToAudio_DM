import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int count = 0;
        MapR100 mapR100 = new MapR100();
        List<String> lines = new ArrayList<>();
        List<String> linesR100_2 = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        FileReader fr = new FileReader("F:\\textToAudio/doc.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("F:\\textToAudio/docR100.txt");
        String line;

        // Удаление пустых строк и пробелов в конце и в начале строк
        while ((line = br.readLine()) != null) {
            System.out.println(count++);
            line = line.trim(); // remove leading and trailing whitespace
            System.out.println("Удаление пробелов " + line );
            line = line.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
            System.out.println("line.replaceAll(\"^\\\\s+\", \"\").replaceAll(\"\\\\s+$\", \"\"); " + line);
            line = line.replaceAll("\\s+", " ").trim().concat("\n");
            System.out.println("line.replaceAll(\"\\\\s+\", \" \").trim().concat(\"\\n\") " + line);
            line = line.replaceAll("(?m)^[ \t]*\r?\n", ""); //удалением пустых строк
            System.out.println("удалением пустых строк " + line);
            line = line.replaceAll("\\s", "_"); //Замена пробелов на '_'
            System.out.println("Замена пробелов на '_' " + line);

            if (!line.equals("")) {
               // line = count++ + line;
                lines.add(line);
            }
        }
        System.out.println("line " + lines);
        System.out.println();

        fr.close(); // Закрытие FileReader
        fw.close(); // Закрытие BufferedReader

        for (String s : lines) {
            for (int i = 0; i < s.length(); i++) {
                stringBuilder.append(mapR100.replaceR100(s.charAt(i))).append(",");
                }
            }
        String listString = String.join(",", stringBuilder);
        String listString2 = listString.replace(".wav,F:\\textToAudio/R100_DM/", "").replace("ОЗРА", "_");
        String listString3 = listString2.replace("F:\\textToAudio/R100_DM", "").replaceAll("\\d", ""); //replaceAll("\\d", "") удаляет все цифры


        //System.out.println(stringBuilder);
        System.out.println("Радастеид-100 " + listString3);
    }

}



