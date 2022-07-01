package com.pascal.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hallo Welt!");

        try {
            Thread.sleep(5000); // 5 Sekunden
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
