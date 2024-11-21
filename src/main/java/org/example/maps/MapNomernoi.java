package org.example.maps;

import org.example.PathToAudio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapNomernoi implements Map<Character, String> {
    public String replace(char a) {
        PathToAudio pathToAudio = new PathToAudio();
        Map<Character, String> nomernoi = new HashMap<>();

        nomernoi.put('_', pathToAudio.getPathToAudio() + "Nomernoi_DM/_Близь.wav");
        nomernoi.put('А', pathToAudio.getPathToAudio() + "Nomernoi_DM/А1.wav");
        nomernoi.put('Б', pathToAudio.getPathToAudio() + "Nomernoi_DM/Б2.wav");
        nomernoi.put('В', pathToAudio.getPathToAudio() + "Nomernoi_DM/В3.wav");
        nomernoi.put('Г', pathToAudio.getPathToAudio() + "Nomernoi_DM/Г4.wav");
        nomernoi.put('Д', pathToAudio.getPathToAudio() + "Nomernoi_DM/Д5.wav");
        nomernoi.put('Е', pathToAudio.getPathToAudio() + "Nomernoi_DM/Е6.wav");
        nomernoi.put('Ё', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ё7.wav");
        nomernoi.put('Ж', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ж8.wav");
        nomernoi.put('З', pathToAudio.getPathToAudio() + "Nomernoi_DM/З9.wav");
        nomernoi.put('И', pathToAudio.getPathToAudio() + "Nomernoi_DM/И10.wav");
        nomernoi.put('Й', pathToAudio.getPathToAudio() + "Nomernoi_DM/Й11.wav");
        nomernoi.put('К', pathToAudio.getPathToAudio() + "Nomernoi_DM/К12.wav");
        nomernoi.put('Л', pathToAudio.getPathToAudio() + "Nomernoi_DM/Л13.wav");
        nomernoi.put('М', pathToAudio.getPathToAudio() + "Nomernoi_DM/М14.wav");
        nomernoi.put('Н', pathToAudio.getPathToAudio() + "Nomernoi_DM/Н15.wav");
        nomernoi.put('О', pathToAudio.getPathToAudio() + "Nomernoi_DM/О16.wav");
        nomernoi.put('П', pathToAudio.getPathToAudio() + "Nomernoi_DM/П17.wav");
        nomernoi.put('Р', pathToAudio.getPathToAudio() + "Nomernoi_DM/Р18.wav");
        nomernoi.put('С', pathToAudio.getPathToAudio() + "Nomernoi_DM/С19.wav");
        nomernoi.put('Т', pathToAudio.getPathToAudio() + "Nomernoi_DM/Т20.wav");
        nomernoi.put('У', pathToAudio.getPathToAudio() + "Nomernoi_DM/У21.wav");
        nomernoi.put('Ф', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ф22.wav");
        nomernoi.put('Х', pathToAudio.getPathToAudio() + "Nomernoi_DM/Х23.wav");
        nomernoi.put('Ц', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ц24.wav");
        nomernoi.put('Ч', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ч25.wav");
        nomernoi.put('Ш', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ш26.wav");
        nomernoi.put('Щ', pathToAudio.getPathToAudio() + "Nomernoi_DM/Щ27.wav");
        nomernoi.put('Ъ', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ъ28.wav");
        nomernoi.put('Ы', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ы29.wav");
        nomernoi.put('Ь', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ь30.wav");
        nomernoi.put('Э', pathToAudio.getPathToAudio() + "Nomernoi_DM/Э31.wav");
        nomernoi.put('Ю', pathToAudio.getPathToAudio() + "Nomernoi_DM/Ю32.wav");
        nomernoi.put('Я', pathToAudio.getPathToAudio() + "Nomernoi_DM/Я33.wav");

        nomernoi.put('а', pathToAudio.getPathToAudio() + "Nomernoi_DM/а1.wav");
        nomernoi.put('б', pathToAudio.getPathToAudio() + "Nomernoi_DM/б2.wav");
        nomernoi.put('в', pathToAudio.getPathToAudio() + "Nomernoi_DM/в3.wav");
        nomernoi.put('г', pathToAudio.getPathToAudio() + "Nomernoi_DM/г4.wav");
        nomernoi.put('д', pathToAudio.getPathToAudio() + "Nomernoi_DM/д5.wav");
        nomernoi.put('е', pathToAudio.getPathToAudio() + "Nomernoi_DM/е6.wav");
        nomernoi.put('ё', pathToAudio.getPathToAudio() + "Nomernoi_DM/ё7.wav");
        nomernoi.put('ж', pathToAudio.getPathToAudio() + "Nomernoi_DM/ж8.wav");
        nomernoi.put('з', pathToAudio.getPathToAudio() + "Nomernoi_DM/з9.wav");
        nomernoi.put('и', pathToAudio.getPathToAudio() + "Nomernoi_DM/и10.wav");
        nomernoi.put('й', pathToAudio.getPathToAudio() + "Nomernoi_DM/й11.wav");
        nomernoi.put('к', pathToAudio.getPathToAudio() + "Nomernoi_DM/к12.wav");
        nomernoi.put('л', pathToAudio.getPathToAudio() + "Nomernoi_DM/л13.wav");
        nomernoi.put('м', pathToAudio.getPathToAudio() + "Nomernoi_DM/м14.wav");
        nomernoi.put('н', pathToAudio.getPathToAudio() + "Nomernoi_DM/н15.wav");
        nomernoi.put('о', pathToAudio.getPathToAudio() + "Nomernoi_DM/о16.wav");
        nomernoi.put('п', pathToAudio.getPathToAudio() + "Nomernoi_DM/п17.wav");
        nomernoi.put('р', pathToAudio.getPathToAudio() + "Nomernoi_DM/р18.wav");
        nomernoi.put('с', pathToAudio.getPathToAudio() + "Nomernoi_DM/с19.wav");
        nomernoi.put('т', pathToAudio.getPathToAudio() + "Nomernoi_DM/т20.wav");
        nomernoi.put('у', pathToAudio.getPathToAudio() + "Nomernoi_DM/у21.wav");
        nomernoi.put('ф', pathToAudio.getPathToAudio() + "Nomernoi_DM/ф22.wav");
        nomernoi.put('х', pathToAudio.getPathToAudio() + "Nomernoi_DM/х23.wav");
        nomernoi.put('ц', pathToAudio.getPathToAudio() + "Nomernoi_DM/ц24.wav");
        nomernoi.put('ч', pathToAudio.getPathToAudio() + "Nomernoi_DM/ч25.wav");
        nomernoi.put('ш', pathToAudio.getPathToAudio() + "Nomernoi_DM/ш26.wav");
        nomernoi.put('щ', pathToAudio.getPathToAudio() + "Nomernoi_DM/щ27.wav");
        nomernoi.put('ъ', pathToAudio.getPathToAudio() + "Nomernoi_DM/ъ28.wav");
        nomernoi.put('ы', pathToAudio.getPathToAudio() + "Nomernoi_DM/ы29.wav");
        nomernoi.put('ь', pathToAudio.getPathToAudio() + "Nomernoi_DM/ь30.wav");
        nomernoi.put('э', pathToAudio.getPathToAudio() + "Nomernoi_DM/э31.wav");
        nomernoi.put('ю', pathToAudio.getPathToAudio() + "Nomernoi_DM/ю32.wav");
        nomernoi.put('я', pathToAudio.getPathToAudio() + "Nomernoi_DM/я33.wav");

        return nomernoi.get(a);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public String get(Object key) {
        return null;
    }

    @Override
    public String put(Character key, String value) {
        return null;
    }

    @Override
    public String remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends Character, ? extends String> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<Character> keySet() {
        return null;
    }

    @Override
    public Collection<String> values() {
        return null;
    }

    @Override
    public Set<Entry<Character, String>> entrySet() {
        return null;
    }
}
