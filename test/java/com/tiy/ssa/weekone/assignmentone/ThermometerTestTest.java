package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThermometerTestTest {

    @Test
    public void testDisplay() {
        //fail("Not yet implemented");
//        ThermometerTest temp= new ThermometerTest(78,true);
//        temp.display(true); this is the same as an assert statement
        assertEquals("F", 78, new ThermometerTest(78, false, "f").display(false, "f"));
        assertEquals("212F -> 100c", 100, new ThermometerTest(212, true, "f").display(true, "f"));
        
        
        assertEquals("C", 212, new ThermometerTest(212, false, "c").display(false, "c"));
        assertEquals("100c -> 212 F", 212, new ThermometerTest(100, true, "c").display(true, "c"));
//"" is for commentary
    }
    @Test
    public void FtoC(){
        assertEquals("", 100, new ThermometerTest(212,true,"c").display(false,"c"));
       
    }
    @Test
    public void integerDivision(){
        assertEquals("", 1.0, 9F/5, .001);
       
    }
}
//    public int displayq(boolean convert, String deg)
//    {
//        
//        int temp = 0;
//        
//        if(deg.toLowerCase() == "c")
//        {
//            
//            if(convert == true)
//            {
//                
//                
//                temp = (temperature * 9 / 5) + (32);
//                System.out.println(temp);
//                
//            }
//            else if(convert == false)
//            {
//                temp = temperature;
//                System.out.println(temp);
//                
//            }
//            
//        }
//        else if(deg.toLowerCase() == "f")
//        {
//            
//            if(convert == true)
//            {
//                temp = ((temperature - 32) * (5))/9;
//                System.out.println(temp);
//                
//            }
//            else if(convert == false)
//            {
//                temp = temperature;
//                System.out.println(temp);
//            }
//            
//        }
//        return temp;
//    }

