import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String s = "D:\\text.txt";
        ReadFile readFile = new ReadFile();

        var g = readFile.FileRead(s);

        System.out.println(Arrays.toString(g));
    }
}



