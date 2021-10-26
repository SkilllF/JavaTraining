package com.ncPractices.day2;

public class SelectionDemo {

    public static void main(String[] args) {
        int x = 17 % 6;
        switch (x){
            case 0:
                System.out.println("It is even");
                break;
            case 1:
                System.out.println("It is odd");
                break;
            default:
                System.out.println("It is a default statement");
                break;
        }


    }
}
