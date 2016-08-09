package com.tiy.ssa.weekone.assignmentone;

public class Power {
    int input;
    int power;
    
    public Power(int given, int mypower){
        this.input = given;
        this.power = mypower;
        
    }
    public int PowerofOne(int given, int urpower){
        int value;
        value = given;
        return value;
    }
    public int PowerofTwo(int given, int urpower){
        int value;
        value = given*given;
        return value;
    }
    public int PowerAll(){
        int value;
        if (power <2)
            value = input;
        else
            value = (int) Math.pow(input,power);
        
        return value;
    }
    public int PowerofThree(int given, int urpower){
        int value;
        value = given*given*given;
        return value;
    }
}
//////////////////////////
//https://github.com/stevellwood/AssignmentsSE1
//    public int pOf()
//{
//    
//    if(powerO < 2)
//    {
//        result = num;
//    }
//    else
//    {
//        result = Math.pow((double)num, (double)powerO);
//        
//    }
//    return (int) result;
//}