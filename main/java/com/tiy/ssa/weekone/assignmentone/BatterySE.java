package com.tiy.ssa.weekone.assignmentone;

public class BatterySE {
//in KWh
    final float capacity;//this gives ide errors until define constuctor
    //leftover can be changed by calcs and setters since not final
    float leftover;
    
    public float getLeftover() {
        return leftover;
    }

    public void setLeftover(float leftover) {
        this.leftover = leftover;
    }
//    public void setCapacity(float leftover) {
//        this.capacity = leftover;
//    }

    public BatterySE (float capacity2){
        this.capacity = capacity2;
        this.leftover = capacity2;
    }
    
    public float Discharge(int input){
        float remainder = getLeftover();
        float rem = 0;
        float disperUse = 2.1f;
        int useNo = input;
        rem = remainder - useNo*disperUse;
        if (rem < 0) rem = 0;
        setLeftover(rem);      
        return rem;
    }
    public float Charge(int input){
        float remainder = getLeftover();
        float rem = 0;
        float disperUse = 2.1f;
        int useNo = input;
        rem = remainder + useNo*disperUse;
        if (rem > this.capacity) rem = this.capacity;
        setLeftover(rem);      
        return rem;
        
    }
    public int howLong(float power){
        //power is to watts what speed is to km/h
        //power is kw power.  Power* time = leftover
        float time = getLeftover()/power; //this is in hours
        int minutes = (int) (time*60);
        return minutes;
    }

    

}
