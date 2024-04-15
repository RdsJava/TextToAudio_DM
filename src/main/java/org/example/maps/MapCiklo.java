package org.example.maps;

import java.util.HashMap;
import java.util.Map;

public class MapCiklo {
    public String replace(char a) {

        Map<Character, String> ciklohladovit = new HashMap<>();

        ciklohladovit.put('_', "F:\\textToAudio/Ciklo_DM/_оль.wav"); // пробел
        ciklohladovit.put('А', "F:\\textToAudio/Ciklo_DM/Аоль.wav");
        ciklohladovit.put('Б', "F:\\textToAudio/Ciklo_DM/Боль.wav");
        ciklohladovit.put('В', "F:\\textToAudio/Ciklo_DM/Воль.wav");
        ciklohladovit.put('Г', "F:\\textToAudio/Ciklo_DM/Голь.wav");
        ciklohladovit.put('Д', "F:\\textToAudio/Ciklo_DM/Доль.wav");
        ciklohladovit.put('Е', "F:\\textToAudio/Ciklo_DM/Еоль.wav");
        ciklohladovit.put('Ё', "F:\\textToAudio/Ciklo_DM/Ёоль.wav");
        ciklohladovit.put('Ж', "F:\\textToAudio/Ciklo_DM/Жоль.wav");
        ciklohladovit.put('З', "F:\\textToAudio/Ciklo_DM/Золь.wav");
        ciklohladovit.put('И', "F:\\textToAudio/Ciklo_DM/Иоль.wav");
        ciklohladovit.put('Й', "F:\\textToAudio/Ciklo_DM/Йоль.wav");
        ciklohladovit.put('К', "F:\\textToAudio/Ciklo_DM/Коль.wav");
        ciklohladovit.put('Л', "F:\\textToAudio/Ciklo_DM/Лоль.wav");
        ciklohladovit.put('М', "F:\\textToAudio/Ciklo_DM/Моль.wav");
        ciklohladovit.put('Н', "F:\\textToAudio/Ciklo_DM/Ноль.wav");
        ciklohladovit.put('О', "F:\\textToAudio/Ciklo_DM/Ооль.wav");
        ciklohladovit.put('П', "F:\\textToAudio/Ciklo_DM/Поль.wav");
        ciklohladovit.put('Р', "F:\\textToAudio/Ciklo_DM/Роль.wav");
        ciklohladovit.put('С', "F:\\textToAudio/Ciklo_DM/Соль.wav");
        ciklohladovit.put('Т', "F:\\textToAudio/Ciklo_DM/Толь.wav");
        ciklohladovit.put('У', "F:\\textToAudio/Ciklo_DM/Уоль.wav");
        ciklohladovit.put('Ф', "F:\\textToAudio/Ciklo_DM/Фоль.wav");
        ciklohladovit.put('Х', "F:\\textToAudio/Ciklo_DM/Холь.wav");
        ciklohladovit.put('Ц', "F:\\textToAudio/Ciklo_DM/Цоль.wav");
        ciklohladovit.put('Ч', "F:\\textToAudio/Ciklo_DM/Чоль.wav");
        ciklohladovit.put('Ш', "F:\\textToAudio/Ciklo_DM/Шоль.wav");
        ciklohladovit.put('Щ', "F:\\textToAudio/Ciklo_DM/Щоль.wav");
        ciklohladovit.put('Ъ', "F:\\textToAudio/Ciklo_DM/Ъоль.wav");
        ciklohladovit.put('Ы', "F:\\textToAudio/Ciklo_DM/Ыоль.wav");
        ciklohladovit.put('Ь', "F:\\textToAudio/Ciklo_DM/Ьоль.wav");
        ciklohladovit.put('Э', "F:\\textToAudio/Ciklo_DM/Эоль.wav");
        ciklohladovit.put('Ю', "F:\\textToAudio/Ciklo_DM/Юоль.wav");
        ciklohladovit.put('Я', "F:\\textToAudio/Ciklo_DM/Яоль.wav");

        ciklohladovit.put('а', "F:\\textToAudio/Ciklo_DM/аоль.wav");
        ciklohladovit.put('б', "F:\\textToAudio/Ciklo_DM/боль.wav");
        ciklohladovit.put('в', "F:\\textToAudio/Ciklo_DM/воль.wav");
        ciklohladovit.put('г', "F:\\textToAudio/Ciklo_DM/голь.wav");
        ciklohladovit.put('д', "F:\\textToAudio/Ciklo_DM/доль.wav");
        ciklohladovit.put('е', "F:\\textToAudio/Ciklo_DM/еоль.wav");
        ciklohladovit.put('ё', "F:\\textToAudio/Ciklo_DM/ёоль.wav");
        ciklohladovit.put('ж', "F:\\textToAudio/Ciklo_DM/жоль.wav");
        ciklohladovit.put('з', "F:\\textToAudio/Ciklo_DM/золь.wav");
        ciklohladovit.put('и', "F:\\textToAudio/Ciklo_DM/иоль.wav");
        ciklohladovit.put('й', "F:\\textToAudio/Ciklo_DM/йоль.wav");
        ciklohladovit.put('к', "F:\\textToAudio/Ciklo_DM/коль.wav");
        ciklohladovit.put('л', "F:\\textToAudio/Ciklo_DM/лоль.wav");
        ciklohladovit.put('м', "F:\\textToAudio/Ciklo_DM/моль.wav");
        ciklohladovit.put('н', "F:\\textToAudio/Ciklo_DM/ноль.wav");
        ciklohladovit.put('о', "F:\\textToAudio/Ciklo_DM/ооль.wav");
        ciklohladovit.put('п', "F:\\textToAudio/Ciklo_DM/поль.wav");
        ciklohladovit.put('р', "F:\\textToAudio/Ciklo_DM/роль.wav");
        ciklohladovit.put('с', "F:\\textToAudio/Ciklo_DM/соль.wav");
        ciklohladovit.put('т', "F:\\textToAudio/Ciklo_DM/толь.wav");
        ciklohladovit.put('у', "F:\\textToAudio/Ciklo_DM/уоль.wav");
        ciklohladovit.put('ф', "F:\\textToAudio/Ciklo_DM/фоль.wav");
        ciklohladovit.put('х', "F:\\textToAudio/Ciklo_DM/холь.wav");
        ciklohladovit.put('ц', "F:\\textToAudio/Ciklo_DM/цоль.wav");
        ciklohladovit.put('ч', "F:\\textToAudio/Ciklo_DM/чоль.wav");
        ciklohladovit.put('ш', "F:\\textToAudio/Ciklo_DM/шоль.wav");
        ciklohladovit.put('щ', "F:\\textToAudio/Ciklo_DM/щоль.wav");
        ciklohladovit.put('ъ', "F:\\textToAudio/Ciklo_DM/ъоль.wav");
        ciklohladovit.put('ы', "F:\\textToAudio/Ciklo_DM/ыоль.wav");
        ciklohladovit.put('ь', "F:\\textToAudio/Ciklo_DM/ьоль.wav");
        ciklohladovit.put('э', "F:\\textToAudio/Ciklo_DM/эоль.wav");
        ciklohladovit.put('ю', "F:\\textToAudio/Ciklo_DM/юоль.wav");
        ciklohladovit.put('я', "F:\\textToAudio/Ciklo_DM/яоль.wav");


        return ciklohladovit.get(a);
    }
}
