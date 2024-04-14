package org.example;

import javax.swing.*;
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
        //Создание окна для ввода текста
        JFrame myWindow = new SimpleWindow(); /** Для окна нужна "рама" - Frame */
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // закрывает окно нажатием на крестик
        myWindow.setVisible(true);  /** Чтобы отобразить окно на экране */
    }
}



