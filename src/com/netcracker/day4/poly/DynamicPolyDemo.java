package com.netcracker.day4;

class Animal{
    void name(){
        System.out.println("I am generic animal");
    }
}
class dog extends Animal{
    void name(){
        System.out.println(" I am a dog");
    }
}

public class DynamicPolyDemo {
    public static void main(String[] args) {
    Animal obj = new dog(); //creating instance of dog using animal as refrence
    obj.name();
    }
}
