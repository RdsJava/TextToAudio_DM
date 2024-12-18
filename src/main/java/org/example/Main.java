package org.example;

import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //Создание окна для ввода текста
        JFrame myWindow = new SimpleWindow();
        //myWindow.setSize(800, 800);/* Для окна нужна "рама" - Frame */
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // закрывает окно нажатием на крестик
        myWindow.setVisible(true);  /* Чтобы отобразить окно на экране */
    }
}



