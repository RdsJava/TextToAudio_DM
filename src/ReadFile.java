import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFile {
    // построчное считывание файла
    public ArrayList[] FileRead(String s) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        StrBild strBild = new StrBild();
        Scanner scanner = new Scanner(new File(s));
        String string = String.valueOf(scanner);


        do {
            if (string != null)
                list.add(strBild.sBild(string));
        }
        while (scanner.hasNextLine());

        return new ArrayList[]{list};
    }
}
