package com.company;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
/*
port - 5038

BanckAccount - name , balance (obj)

client - sends name, balance
server - list of people


 */
            String name;
        double balance;
            Socket s = new Socket("192.168.0.15", 5038);
            Scanner scan = new Scanner(System.in);
            Scanner scan2 = new Scanner(s.getInputStream());
            PrintStream printout = new PrintStream(s.getOutputStream());
            System.out.println("Enter name:");
        name = scan.nextLine();
        System.out.println("Enter balance:");
        balance = scan.nextDouble();
        try {
            String send = name+ ";" +balance;
            printout.println(send);
            String input = scan2.nextLine();
            System.out.println(input);
        } catch (InputMismatchException e) {
            System.out.println("error");
        } finally {
            if (s != null)
                s.close();
            if (scan != null)
                scan.close();
            if (scan2 != null)
                scan2.close();
        }

    }
}
