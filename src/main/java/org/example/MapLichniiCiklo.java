package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapLichniiCiklo {
    public String replace(char a) {

        Map<Character, String> LichniiCiklohladovit = new HashMap<>();

        LichniiCiklohladovit.put('_', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/_оль.wav"); // пробел
        LichniiCiklohladovit.put('А', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Ооль.wav");
        LichniiCiklohladovit.put('Б', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Аоль.wav");
        LichniiCiklohladovit.put('В', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Еоль.wav");
        LichniiCiklohladovit.put('Г', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Ноль.wav");
        LichniiCiklohladovit.put('Д', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Доль.wav");
        LichniiCiklohladovit.put('Е', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Толь.wav");
        LichniiCiklohladovit.put('Ё', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Иоль.wav");
        LichniiCiklohladovit.put('Ж', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Воль.wav");
        LichniiCiklohladovit.put('З', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Лоль.wav");
        LichniiCiklohladovit.put('И', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Соль.wav");
        LichniiCiklohladovit.put('Й', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Коль.wav");
        LichniiCiklohladovit.put('К', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Роль.wav");
        LichniiCiklohladovit.put('Л', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Поль.wav");
        LichniiCiklohladovit.put('М', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Уоль.wav");
        LichniiCiklohladovit.put('Н', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Ьоль.wav");
        LichniiCiklohladovit.put('О', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Золь.wav");
        LichniiCiklohladovit.put('П', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Моль.wav");
        LichniiCiklohladovit.put('Р', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Боль.wav");
        LichniiCiklohladovit.put('С', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Ыоль.wav");
        LichniiCiklohladovit.put('Т', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Яоль.wav");
        LichniiCiklohladovit.put('У', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Шоль.wav");
        LichniiCiklohladovit.put('Ф', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Голь.wav");
        LichniiCiklohladovit.put('Х', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Ёоль.wav");
        LichniiCiklohladovit.put('Ц', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Жоль.wav");
        LichniiCiklohladovit.put('Ч', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Йоль.wav");
        LichniiCiklohladovit.put('Ш', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Фоль.wav");
        LichniiCiklohladovit.put('Щ', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Холь.wav");
        LichniiCiklohladovit.put('Ъ', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Чоль.wav");
        LichniiCiklohladovit.put('Ы', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Юоль.wav");
        LichniiCiklohladovit.put('Ь', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Щоль.wav");
        LichniiCiklohladovit.put('Э', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Цоль.wav");
        LichniiCiklohladovit.put('Ю', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Ъоль.wav");
        LichniiCiklohladovit.put('Я', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/Эоль.wav");

        LichniiCiklohladovit.put('а', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/ооль.wav");
        LichniiCiklohladovit.put('б', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/аоль.wav");
        LichniiCiklohladovit.put('в', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/еоль.wav");
        LichniiCiklohladovit.put('г', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/ноль.wav");
        LichniiCiklohladovit.put('д', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/доль.wav");
        LichniiCiklohladovit.put('е', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/толь.wav");
        LichniiCiklohladovit.put('ё', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/иоль.wav");
        LichniiCiklohladovit.put('ж', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/воль.wav");
        LichniiCiklohladovit.put('з', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/лоль.wav");
        LichniiCiklohladovit.put('и', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/соль.wav");
        LichniiCiklohladovit.put('й', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/коль.wav");
        LichniiCiklohladovit.put('к', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/роль.wav");
        LichniiCiklohladovit.put('л', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/поль.wav");
        LichniiCiklohladovit.put('м', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/уоль.wav");
        LichniiCiklohladovit.put('н', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/ьоль.wav");
        LichniiCiklohladovit.put('о', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/золь.wav");
        LichniiCiklohladovit.put('п', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/моль.wav");
        LichniiCiklohladovit.put('р', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/боль.wav");
        LichniiCiklohladovit.put('с', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/ыоль.wav");
        LichniiCiklohladovit.put('т', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/яоль.wav");
        LichniiCiklohladovit.put('у', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/шоль.wav");
        LichniiCiklohladovit.put('ф', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/голь.wav");
        LichniiCiklohladovit.put('х', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/ёоль.wav");
        LichniiCiklohladovit.put('ц', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/жоль.wav");
        LichniiCiklohladovit.put('ч', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/йоль.wav");
        LichniiCiklohladovit.put('ш', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/фоль.wav");
        LichniiCiklohladovit.put('щ', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/холь.wav");
        LichniiCiklohladovit.put('ъ', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/чоль.wav");
        LichniiCiklohladovit.put('ы', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/юоль.wav");
        LichniiCiklohladovit.put('ь', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/щоль.wav");
        LichniiCiklohladovit.put('э', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/цоль.wav");
        LichniiCiklohladovit.put('ю', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/ъоль.wav");
        LichniiCiklohladovit.put('я', "F:\\YandexDisk\\textToAudio\\Ciklo_DM/эоль.wav");
        LichniiCiklohladovit.put('<', "F:\\YandexDisk\\textToAudio\\Начало_переизлучения.wav");
        LichniiCiklohladovit.put('>', "F:\\YandexDisk\\textToAudio\\Конец_переизлучения.wav");



        return LichniiCiklohladovit.get(a);
    }
}

