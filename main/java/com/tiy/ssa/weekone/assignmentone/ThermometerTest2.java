package com.tiy.ssa.weekone.assignmentone;

public class ThermometerTest2 {
    private final int temperature;
    boolean convert;
    private String type;
    //private final will allow you to have instance variables that are immutable: only the contructors can change them.
    //the ide will give error if you keep all vars 
    //some students were using top levels inside of classes 
    public  ThermometerTest2 (int temperature){
        this(temperature, "c");}
    
    public ThermometerTest2(int temperature,  String type )//boolean convert,
    {
        this.temperature = temperature;
        //this.convert = convert;
        this.type = type;
        
    }
    //Thermometer implementation: shouldn't name the implementation class ThermometerTest, that's very confusing; also, a boolean convert doesn't make sense as a constructor argument, i.e. should be: Thermometer(double temper, String unit) if you want to use a String for either "F" or "C"

    public int display(String degType ){
        //don't use the temperature!! This causes problems. if
          int temp = 0;
          
          if(degType.toLowerCase() == "c")
            {              
                if(this.type.toLowerCase() == "f") { 
                    double temp1 = (temperature * 9f / 5f) + (32);
                    //int range 2^31 -1
                    temp =  (int) Math.round(temp1);//double converts to a long add cast int to make an int
                    //System.out.println(temp);
                    System.out.printf("%.2f is final temp %n", temp1);
                }
                else //if(convert == false)
                  {
                      temp = temperature;
                      System.out.println(temp);
                  }
               }
            else if(deg.toLowerCase() == "f")
                  {
                      
//                      if(convert == true)
//                      {
                          temp = ((temperature - 32) * (5))/9;
                          System.out.println(temp);
                          
                      }
                      else if(convert == false)
                      {
                          temp = temperature;
                          System.out.println(temp);
                      }
                  }
    //  mine      if (userWantsFahrenheit == this.isFahrenheit){//for true or false
//            return this.temperature;}
////        if (userWantsFahrenheit!=this.isFahrenheit){
//        else {
//            temp = (int) ((temperature -32) *5.0/9.0);}
//       // if (true)
       return temp;
        
    }
    int fahrenheitToCelsisus(int temperature){//as long as it's in same package
        return -1;
    }
    int CelsisustoFahrenheit(){//as long as it's in same package
        return -1;
    }
 //does assignmet of memory slot occur at declaration or initialization   

}
//9/5*temperature + 32