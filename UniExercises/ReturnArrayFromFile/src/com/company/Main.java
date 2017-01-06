package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Phone[] smth = readFromFile();
        for (Phone item : smth) {
            System.out.println(item);
        }
    }
    private static Phone[] readFromFile() {

        Phone[] phones= new Phone[3];
        try (BufferedReader bfr = new BufferedReader(new FileReader("text.txt.txt"))) {
            String currentLine = bfr.readLine();
            int index = 0;
            while (currentLine != null) {

                String[] temp = currentLine.split("\\|");

                Phone phone = new Phone(temp[0], temp[1],Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));

                phones[index++] = phone;
                currentLine=bfr.readLine();
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return phones;
    }
}
