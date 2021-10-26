package com.ncPractices.day2;


import java.util.List;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
      //  int []num = { 10, 20,30, 40,50};
        //System.out.println(Arrays.asList(num));

        Integer []arr = { 10,20,30,40,50, 15, 28, 32};
        List<Integer> numList = Arrays.asList(arr);
        System.out.println(numList);

        Arrays.sort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(numList);

        System.out.println("15?: "+Arrays.binarySearch(arr,15));
        System.out.println("115?: "+Arrays.binarySearch(arr,115));

        int [] arr1 = { 10, 20, 15};
        int []arr2 = {10, 20, 15, 22, 33 };

        System.out.println("Comparing two arrays in one ");
        System.out.println("Comparing Arrays: "+ Arrays.equals(arr1,arr2));

        //printing array using string format

        System.out.println("Array1: "+Arrays.toString(arr1));
        System.out.println("Array2: "+Arrays.toString(arr2));

        //copy contents of array

        int []arr3 = new int[3];
        System.arraycopy(arr2, 1, arr3,  0, arr3.length);
        System.out.println("copied array is: "+Arrays.toString(arr3));



    }
}
