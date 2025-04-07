package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Welcome to demo Project!");
        count(1,100);
    }

    private static void count(int ini, int end) {
        for (int i = ini; i <= end; i++) {
            System.out.println("i = " + i);
        }
    }


}