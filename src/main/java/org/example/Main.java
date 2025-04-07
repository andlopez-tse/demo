package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.printf("Welcome to demo Project!\n");
        countFor(1,10);
        countWithWhile(1,10);
    }

    private static void countWithWhile(int ini, int end) {
        System.out.println("\ncountWithWhile ==================");
        while(ini<=end){
            System.out.println("while i = " + ini);
            ++ini;
        }
    }

    private static void countFor(int ini, int end) {
        System.out.println("\ncountFor =======================");
        for (int i = ini; i <= end; i++) {
            System.out.println("count i = " + i);
        }
    }

}