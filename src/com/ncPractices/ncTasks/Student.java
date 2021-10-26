package com.ncPractices.ncTasks;

public class Student {
    private int registrationId;
    //the one in purple is class level variable
    // the one in white is method level variable
    public void setRegistrationId(int registrationId){
        this.registrationId = registrationId;
    }
    void displayRegistrationId(){
        System.out.println("the Student Registration id is: "+ registrationId);
    }
}
