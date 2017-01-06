package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
saveInfile();
    }
    private static void saveInfile() {
         Phone[] phone = new Phone[3];
            phone[0] = new Phone("Samsumg" ,"57",2016,3700);
        phone[1] = new Phone("Apple","IPhone 7 Plus",2016,2900);
        phone[2] = new Phone("Lenovo","Vibe P1",2015,5000);


        try (BufferedWriter bfw = new BufferedWriter(new FileWriter("text.txt"))) {
            String[] newArray = new String[3];

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
