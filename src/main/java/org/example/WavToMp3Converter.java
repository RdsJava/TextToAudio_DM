package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WavToMp3Converter {
    public void converterWavToMp3(String wavFilePath, String mp3FilePath) {

        System.setProperty("file.encoding", "UTF-8"); // Чтобы задать кодировку названия файла в Java, можно использовать опцию  Это установит кодировку UTF-8 по умолчанию для JVM на время работы программы.

        // Команда для конвертации с помощью командной строки (без командной строки ограничение больше 24 минут файл.wav в файл.mp3 не конвентирует)
        String command = "cmd.exe /c start " + "ffmpeg -i " + wavFilePath + " -c:a libmp3lame -b:a 96k " + mp3FilePath; // пробел разделитель в этой токе
        //String command = "cmd.exe /c start " + "ffmpeg -i " + wavFilePath +  " -c:a libfdk_aac -profile:a aac_he -b:a 64k " + mp3FilePath;



        Runtime runtime = Runtime.getRuntime();

        try {
            Process process = runtime.exec(command);

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.exitValue();
            if (exitCode == 0) {
                System.out.println("Конвертация завершена успешно!");
                Path path = Paths.get(wavFilePath);
                Files.delete(path);
                System.out.println("Wave-файл удален");
            } else {
                System.out.println("Ошибка конвертации. Код выхода: " + exitCode);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}