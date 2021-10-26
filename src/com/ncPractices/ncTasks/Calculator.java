package com.ncPractices.ncTasks;

public class Calculator {
    private int operand1, operand2;

    public void displayOperand(){
        System.out.println("The value of operand 1 is: "+operand1);
        System.out.println("The value of Operand2 is: "+operand2);
    }

    public void setOperand1(int operand1){
        this.operand1 = operand1;
    }
    public void setOperand2(int operand2){
        this.operand2 = operand2;
    }
}
