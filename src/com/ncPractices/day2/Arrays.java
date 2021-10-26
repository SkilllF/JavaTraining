package com.ncPractices.day2;

public class Arrays {

   // public static boolean asList;
    int []arr = new int[10];

    public void storeNumber() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

        }
    }
    public void printEvenNumbers(){
        for(int num: arr){
            if(num % 2 ==0)
                System.out.println("Print number is even: "+num);

        }
    }

    public void printArray(){
        for( int num: arr){
            System.out.println(" "+num);
        }
    }
    public static void main(String[] args) {

        Arrays obj = new Arrays();
        obj.storeNumber();
       // obj.printEvenNumbers();
        obj.printArray();


    }
}
