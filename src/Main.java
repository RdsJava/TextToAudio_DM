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
            line = line.trim(); // remove leading and trailing whitespace
            line = line.replaceAll("^\\s+", "").replaceAll("\\s+$", "");
            line = line.replaceAll("\\s+", " ").trim().concat("\n");
            line = line.replaceAll("(?m)^[ \t]*\r?\n", ""); //удалением пустых строк
            line = line.replaceAll("\\s", "_"); //Замена пробелов на '_'

            if (!line.equals("")) {
                line = "*" + line;
                lines.add(line);

            }
            ;
        }
        System.out.println(lines);

        fr.close(); // Закрытие FileReader
        fw.close(); // Закрытие BufferedReader


        for (String s : lines) {
            for (int i = 0; i < s.length(); i++) {
                stringBuilder.append(mapR100.replaceR100(s.charAt(i))).append(",");
                }
            }

        System.out.println(stringBuilder);
    }
}



