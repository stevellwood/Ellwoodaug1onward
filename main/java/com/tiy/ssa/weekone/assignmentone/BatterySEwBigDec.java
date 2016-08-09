package com.tiy.ssa.weekone.assignmentone;

import java.math.BigDecimal;
import java.math.RoundingMode;

//import java.math.BigDecimal;

//import com.tiy.ssa.weekone.assignmentone.BatterySE.BatterySEwBigDec;
//http://www.opentaps.org/docs/index.php/How_to_Use_Java_BigDecimal:_A_Tutorial
public class BatterySEwBigDec {
    //in KWh
        final BigDecimal capacity2;//this gives ide errors until define constuctor
        //leftover can be changed by calcs and setters since not final
        BigDecimal leftover;
        public BatterySEwBigDec (BigDecimal capacity2a){//can a constructor work in the middle of problem??
            this.capacity2 = capacity2a;
            this.leftover = capacity2a;
        }
        public BatterySEwBigDec(BigDecimal maxKWH, BigDecimal currentKWH) throws Exception
        {//from EZ:
            if(maxKWH.compareTo(BigDecimal.ZERO) >= 0 && currentKWH.compareTo(BigDecimal.ZERO) >= 0 && ((maxKWH.compareTo(currentKWH) >= 0)))
            {
                this.capacity2 = maxKWH;
                this.leftover = currentKWH;
            }
            else
            {
                throw new Exception();
            }
        }
        public java.math.BigDecimal getLeftover() {
            return leftover;
        }

        public void setLeftover(BigDecimal leftov) {//    floatValue()
            //BigDecimal leftoverflt = floatValue(leftov);
            this.leftover = leftov;
        }
       public BigDecimal Discharge(int input){
           BigDecimal remainder = getLeftover();
           BatterySEwBigDec remainderbd = new BatterySEwBigDec(remainder);
            System.out.println(remainderbd);
            //BigDecimal testbd = floatValue(remainderbd);
            BigDecimal remainderbd2 = new BigDecimal("remainder");
            System.out.println(remainderbd2);
//            int rem = 0;
            double disperUse = 2.0;
            int useNo = input;
            //rem = remainderbd - useNo*disperUse;
            double dbl = useNo*disperUse;
            BigDecimal disp = BigDecimal.valueOf(dbl);
            BigDecimal rem = remainder.subtract(disp);
            //BatterySEwBigDec rembd = new BatterySEwBigDec(rem);
//            if (rembd.compareTo(0)) ==0;      //("0"): -1)
//                BigDecimal(0)) rembd = BigDecimal(0);
            this.leftover = rem;    
            return rem;
        }
      public BigDecimal Charge(int input){
          BigDecimal remainder = getLeftover();
            float rem = 0;
            float disperUse = 2.1f;
            int useNo = input;
           
            BigDecimal remd = BigDecimal.valueOf(useNo*disperUse);
            BigDecimal remc = remainder.add(remd);
            if (remc.compareTo(this.capacity2) == 1);//greater than
                remc = this.capacity2;
            setLeftover(remc);      
            return remc;
            
        }
        public BigDecimal howLong(BigDecimal power){
            //power is to watts what speed is to km/h
            //power is kw power.  Power* time = leftover
            BigDecimal hours =(getLeftover().divide(power,20,RoundingMode.HALF_EVEN)); //this is in hours
            BigDecimal minutes = (hours.multiply(BigDecimal.valueOf(60)));//cannot cast a bigdouble to an int
            return minutes;
        }
        public void main(String[] args) {
            BatterySEwBigDec big1 = new BatterySEwBigDec(BigDecimal.valueOf(20));
            
            Discharge(2);
            System.out.println();
        }
    }