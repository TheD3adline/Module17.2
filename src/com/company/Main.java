package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[5];

        try {
            for(int i = 0; i < 6; i++) {
                array[i] = i;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("test");
    }
}
