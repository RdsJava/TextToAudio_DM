import java.util.HashMap;
import java.util.Map;

public class MapR100 {

    public String replaceR100(char a) {

        String chars = null;

        Map<Character, String> radasteid100 = new HashMap<Character, String>();

        radasteid100.put('А', "F:\\textToAudio/R100_DM/26А.wav");
        radasteid100.put('Б', "F:\\textToAudio/R100_DM/23Б.wav");
        radasteid100.put('В', "F:\\textToAudio/R100_DM/31В.wav");
        radasteid100.put('Г', "F:\\textToAudio/R100_DM/5Г.wav");
        radasteid100.put('Д', "F:\\textToAudio/R100_DM/24Д.wav");
        radasteid100.put('Е', "F:\\textToAudio/R100_DM/30Е.wav");
        radasteid100.put('Ё', "F:\\textToAudio/R100_DM/12Ё.wav");
        radasteid100.put('Ж', "F:\\textToAudio/R100_DM/8Ж.wav");
        radasteid100.put('З', "F:\\textToAudio/R100_DM/33З.wav");
        radasteid100.put('И', "F:\\textToAudio/R100_DM/21И.wav");
        radasteid100.put('Й', "F:\\textToAudio/R100_DM/22Й.wav");
        radasteid100.put('К', "F:\\textToAudio/R100_DM/18К.wav");
        radasteid100.put('Л', "F:\\textToAudio/R100_DM/27Л.wav");
        radasteid100.put('М', "F:\\textToAudio/R100_DM/25М.wav");
        radasteid100.put('Н', "F:\\textToAudio/R100_DM/15Н.wav");
        radasteid100.put('О', "F:\\textToAudio/R100_DM/29О.wav");
        radasteid100.put('П', "F:\\textToAudio/R100_DM/32П.wav");
        radasteid100.put('Р', "F:\\textToAudio/R100_DM/19Р.wav");
        radasteid100.put('С', "F:\\textToAudio/R100_DM/7С.wav");
        radasteid100.put('Т', "F:\\textToAudio/R100_DM/36Т.wav");
        radasteid100.put('У', "F:\\textToAudio/R100_DM/6У.wav");
        radasteid100.put('Ф', "F:\\textToAudio/R100_DM/35Ф.wav");
        radasteid100.put('Х', "F:\\textToAudio/R100_DM/20Х.wav");
        radasteid100.put('Ц', "F:\\textToAudio/R100_DM/34Ц.wav");
        radasteid100.put('Ч', "F:\\textToAudio/R100_DM/13Ч.wav");
        radasteid100.put('Ш', "F:\\textToAudio/R100_DM/11Ш.wav");
        radasteid100.put('Щ', "F:\\textToAudio/R100_DM/10Щ.wav");
        radasteid100.put('Ъ', "F:\\textToAudio/R100_DM/17Ъ.wav");
        radasteid100.put('Ы', "F:\\textToAudio/R100_DM/14Ы.wav");
        radasteid100.put('Ь', "F:\\textToAudio/R100_DM/16Ь.wav");
        radasteid100.put('Э', "F:\\textToAudio/R100_DM/4Э.wav");
        radasteid100.put('Ю', "F:\\textToAudio/R100_DM/9Ю.wav");
        radasteid100.put('Я', "F:\\textToAudio/R100_DM/28Я.wav");
        radasteid100.put('а', "F:\\textToAudio/R100_DM/26А.wav");
        radasteid100.put('б', "F:\\textToAudio/R100_DM/23Б.wav");
        radasteid100.put('в', "F:\\textToAudio/R100_DM/31В.wav");
        radasteid100.put('г', "F:\\textToAudio/R100_DM/5Г.wav");
        radasteid100.put('д', "F:\\textToAudio/R100_DM/24Д.wav");
        radasteid100.put('е', "F:\\textToAudio/R100_DM/30Е.wav");
        radasteid100.put('ё', "F:\\textToAudio/R100_DM/12Ё.wav");
        radasteid100.put('ж', "F:\\textToAudio/R100_DM/8Ж.wav");
        radasteid100.put('з', "F:\\textToAudio/R100_DM/33З.wav");
        radasteid100.put('и', "F:\\textToAudio/R100_DM/21И.wav");
        radasteid100.put('й', "F:\\textToAudio/R100_DM/22Й.wav");
        radasteid100.put('к', "F:\\textToAudio/R100_DM/18К.wav");
        radasteid100.put('л', "F:\\textToAudio/R100_DM/27Л.wav");
        radasteid100.put('м', "F:\\textToAudio/R100_DM/25М.wav");
        radasteid100.put('н', "F:\\textToAudio/R100_DM/15Н.wav");
        radasteid100.put('о', "F:\\textToAudio/R100_DM/29О.wav");
        radasteid100.put('п', "F:\\textToAudio/R100_DM/32П.wav");
        radasteid100.put('р', "F:\\textToAudio/R100_DM/19Р.wav");
        radasteid100.put('с', "F:\\textToAudio/R100_DM/7С.wav");
        radasteid100.put('т', "F:\\textToAudio/R100_DM/36Т.wav");
        radasteid100.put('у', "F:\\textToAudio/R100_DM/6У.wav");
        radasteid100.put('ф', "F:\\textToAudio/R100_DM/35Ф.wav");
        radasteid100.put('х', "F:\\textToAudio/R100_DM/20Х.wav");
        radasteid100.put('ц', "F:\\textToAudio/R100_DM/34Ц.wav");
        radasteid100.put('ч', "F:\\textToAudio/R100_DM/13Ч.wav");
        radasteid100.put('ш', "F:\\textToAudio/R100_DM/11Ш.wav");
        radasteid100.put('щ', "F:\\textToAudio/R100_DM/10Щ.wav");
        radasteid100.put('ъ', "F:\\textToAudio/R100_DM/17Ъ.wav");
        radasteid100.put('ы', "F:\\textToAudio/R100_DM/14Ы.wav");
        radasteid100.put('ь', "F:\\textToAudio/R100_DM/16Ь.wav");
        radasteid100.put('э', "F:\\textToAudio/R100_DM/4Э.wav");
        radasteid100.put('ю', "F:\\textToAudio/R100_DM/9Ю.wav");
        radasteid100.put('я', "F:\\textToAudio/R100_DM/28Я.wav");
        radasteid100.put('_', "F:\\textToAudio/R100_DM/38ОЗРА.wav");
        radasteid100.put(',', "F:\\textToAudio/R100_DM/3ФШ.wav");
        radasteid100.put('.', "F:\\textToAudio/R100_DM/3ФШ.wav");
        radasteid100.put('1', "F:\\textToAudio/R100_DM/1ЦЖ.wav");
        radasteid100.put('2', "F:\\textToAudio/R100_DM/2ЩХ.wav");
        radasteid100.put('3', "F:\\textToAudio/R100_DM/3ФШ.wav");
        radasteid100.put('4', "F:\\textToAudio/R100_DM/37РИТЛ.wav");
        radasteid100.put('5', "F:\\textToAudio/R100_DM/38ОЗРА.wav");
        radasteid100.put('6', "F:\\textToAudio/R100_DM/39СТЛУ.wav");


        return radasteid100.get(a) ;
    }

}
