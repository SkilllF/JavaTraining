package com.company;

public class Arrays {
    public static void main(String[] args) {

        //int [] marks = new int [50];
        int [] marks;
        marks = new int[90];

        int [] sum = {1,2,3,4,5};
        System.out.println("The array at 2 index is: "+sum[2]);
        System.out.println("the array length: "+sum.length);

        String [] studNames = {"Aryan", "bhata", "Sagar"};
        System.out.println("The String Stud name is: "+studNames[2]);

        for(int ele: sum){
            System.out.println("the elements are: " +ele);
        }
    }
}
