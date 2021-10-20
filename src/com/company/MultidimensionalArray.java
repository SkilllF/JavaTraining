package com.company;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] array = new int[2][3];

        array[001][101] =100;
        array[001][102] =102;
        array[001][103] =103;

        array[002][201] = 200;
        array[002][202] = 201;
        array[002][203] = 202;

        System.out.println("the output is: "+array[002][001]);

    }
}
