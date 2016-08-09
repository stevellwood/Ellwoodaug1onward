package com.tiy.ssa.weekone.assignmentone;

public class PowerRecursive {
    

        private int intToMul;
        private int power;
        

        public PowerRecursive() {
        }
        
        public PowerRecursive(int intToMul){
            this.intToMul = intToMul;
            power = 1;
        }
        
        public PowerRecursive(int intToMul, int power){
            this.intToMul = intToMul;
            this.power = power; 
        }

        public int raisedBy(int intToMul, int power){
            if(power == 1)
                return intToMul;
            return (intToMul) * raisedBy(intToMul, power -1);
        }
    }

