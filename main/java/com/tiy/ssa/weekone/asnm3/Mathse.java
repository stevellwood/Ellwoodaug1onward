package com.tiy.ssa.weekone.asnm3;

public class Mathse {
    static float  calcnf = 0;
    static boolean isPositiveNumber = true;
    public Mathse(){};
    static int squareRoot;  
    
    public static int findsquareRoot(int calcn) {
        
        
        int tempsr;
        //if the number given is a 0
        if(calcn==0)
        {
            System.out.println("Square root of "+calcn+" = "+0);
        }
 
        //If the number given is a - number, use the reverse
        else if(calcn<0)
        {
            calcn=calcn-2*calcn;
            isPositiveNumber = false;
        }
 
        //Proceeding to find out square root of the number
        squareRoot = calcn/2;
        do
        {
            tempsr=(int) squareRoot;
            squareRoot = (tempsr + (calcn/tempsr))/2;
        }
        while((tempsr-squareRoot)!=0);
        return squareRoot;
    }
     public  String toString(){
        //Displays square root in the case of a positive number
        if(isPositiveNumber)
        {
            return "Square roots of "+calcnf+" are "+"+"+squareRoot+"and - "+ squareRoot;
//            System.out.println("+"+squareRoot);
//            System.out.println("-"+squareRoot);
        }
        //Displays square root in the case of a -ve number
        else
        {
            System.out.println("Square roots of -"+calcnf+" are "+"+"+squareRoot+"and - "+ squareRoot);
            System.out.println("+"+squareRoot+" i");
            System.out.println("-"+squareRoot+" i");
        }
        return null;
 
    }
    public static double findcubeRoot(double calcn){
        return Math.cbrt(calcn);
    }
    public static void main(String[] args) {
//        PigLatinse pg1= new PigLatinse();
      //Number for which square root is to be found
        int number = Integer.parseInt(args[0]);

        //This method finds out the square root
        System.out.println("Square root of the no is: "+ findsquareRoot(number));
        System.out.println("Cubed root of the no is: "+ findcubeRoot(number));//    squareRoot(number));
    }

}

