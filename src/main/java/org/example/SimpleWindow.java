package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class SimpleWindow extends JFrame {
    public SimpleWindow() {
        super();
        setTitle("Avtor");

        PathToAudio pathToAudio = new PathToAudio();

        TextToAudioOporiHladovit textToAudioOporiHladovit = new TextToAudioOporiHladovit();
        TextToAudioCiklo textToAudioCiklo = new TextToAudioCiklo();
        TextToAudioNomernoi textToAudioNomernoi = new TextToAudioNomernoi();
        TextToAudioRitmo textToAudioRitmo = new TextToAudioRitmo();
        TextToAudioOporiRadasteid textToAudioOporiRadasteid = new TextToAudioOporiRadasteid();
        TextToAudioR100 textToAudioR100 = new TextToAudioR100();
        TextToAudioRadasteid textToAudioRadasteid = new TextToAudioRadasteid();
        TextToAudioRozuzOpori textToAudioRozuzOpori = new TextToAudioRozuzOpori();

        JTextArea textArea = new JTextArea(60, 60);
        textArea.setLineWrap(true); //Управление включением переноса текста по строкам и типом этого переноса.
        textArea.setWrapStyleWord(true); //еренос происходит по словам, которые не разбиваются на части, а переходят на новую строку целиком

        JButton click = new JButton("Создать");// Создание кнопки

        JCheckBox o_hladovit = new JCheckBox("Опоры Хладавит", false);
        JCheckBox ciklo = new JCheckBox("Циклохладвит", false);
        JCheckBox nomernoi = new JCheckBox("Номерной", false);
        JCheckBox ritmo = new JCheckBox("Ритмохладавит", false);
        JCheckBox o_radasteid = new JCheckBox("Опоры Радастеид", false);
        JCheckBox radasteid100 = new JCheckBox("Радастеид - 100", false);
        JCheckBox radasteid = new JCheckBox("Радастеид", false);
        JCheckBox rozuzOpori = new JCheckBox("Розуз-опоры", false);

        JPanel mainPanel = new JPanel(); // Главная панель для обьединения textPanel и container
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.LINE_AXIS)); //* Метод setContentPane позволяет заменить панель содержимого окна.
        getContentPane().add(mainPanel);// Панель содержимого

        JPanel textPanel = new JPanel();// Текстовое поле
        JPanel container = new JPanel(); // Поле с кнопками

        GridLayout layout = new GridLayout(9, 0, 0, 2); //Табличное расположение GridLayout
        container.setLayout(layout);  //Упорядочивание кнопок(container) в табличный вид(layout)

        JPanel flow = new JPanel();// Для расположения поля с кнопками слева от текстового поля FlowLayout - Менеджер последовательного размещения
        flow.add(container);

        mainPanel.add(textPanel); //Добавляем текстовое поле на Главную панель
        mainPanel.add(flow);//Добавляем "левое" поле кнопок на Главную панель


//Созданное поле добавляется в окно аплета методом add.
        textPanel.add(textArea);

        container.add(click);
        container.add(o_hladovit);
        container.add(ciklo);
        container.add(nomernoi);
        container.add(ritmo);
        container.add(o_radasteid);
        container.add(radasteid100);
        container.add(radasteid);
        container.add(rozuzOpori);


        //setContentPane(container);
        pack(); //устанавливает такой минимальный размер контейнера, который достаточен для отображения всех компонентов.

// метод для сохранения в файл введенного текста в поле
        click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String d = textArea.getText();

                //Запись в файл текста:
                try {
                    FileWriter writer = new FileWriter(pathToAudio.getPathToAudio() + "doc.txt");
                    writer.write(d);
                    writer.flush();//Данные, которые вы записываете в Writer, иногда временно хранятся в буфере, метод flush() используется для сброса (flush) всех данных из буфера в целевой объект.
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
                BufferedReader brTest;
                try {
                    brTest = new BufferedReader(new FileReader(pathToAudio.getPathToAudio() + "doc.txt"));
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }

                String text = null;
                try {
                    text = brTest.readLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    if (o_hladovit.isSelected()) {
                        textToAudioOporiHladovit.textToAudioOporiHladovit(text);
                    }
                    if (ciklo.isSelected()) {
                        textToAudioCiklo.textToAudioCiklo(text);
                    }
                    if (nomernoi.isSelected()) {
                        textToAudioNomernoi.textToAudioNomernoi(text);
                    }
                    if (ritmo.isSelected()) {
                        textToAudioRitmo.textToAudioRitmo(text);
                    }
                    if (o_radasteid.isSelected()) {
                        textToAudioOporiRadasteid.textToAudioOporiRadasteid(text);
                    }
                    if (radasteid100.isSelected()) {
                        textToAudioR100.textToAudioR100(text);
                    }
                    if (radasteid.isSelected()) {
                        textToAudioRadasteid.textToAudioRadasteid(text);
                    }
                    if (rozuzOpori.isSelected()) {
                        textToAudioRozuzOpori.textToAudioRozuzOpori(text);
                    }
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}