package com.company;

public class Main {

    public static void main(String[] args) {

        //This example deals with an array that is being deliberately setup in a way to have its predefined size exceeded with too many write attempts from the for loop.
        //Usually it throws the ArrayIndexOutOfBoundsException, a pre-configured part of the Java toolkit , a RuntimeException, and as with all RuntimeExceptions it will terminate the code from the line it is triggered.

        int[] array = new int[5];

        try {
            for(int i = 0; i < 6; i++) {
                array[i] = i;
            }
        } catch(ArrayIndexOutOfBoundsException e) { //This is pretty much all the same as the standard pre-defined RuntimeException for this type of occurrence. But since we defined it separately it will NOT terminate the program any longer.
            e.printStackTrace();
        }

        System.out.println("test");
    }
}
