package com.tiy.ssa.weekone.asnm3;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tiy.ssa.weekone.assignmentone.ThermometerTest;

public class StringReverse1Test {

    @Test
    public void testPalindrome() {
        //fail("Not yet implemented");
//        ThermometerTest temp= new ThermometerTest(78,true);
//        temp.display(true); this is the same as an assert statement
        //StringReverse1 sr1 =   StringReverse1("alila");
        StringReverse1 pali1 = new StringReverse1("alila");
        assertEquals("a", true, pali1.isPalindrome());
        //pali1.toString(); this doees nothing
        System.out.println(pali1.toString());
        
        
        //fail
        StringReverse1 pali1a = new StringReverse1("alilal");
        assertNotEquals("a", false, pali1a.isPalindrome());
        //pali1.toString(); this doees nothing
        System.out.println(pali1a.toString());
        
    }   
   @Test
   public void numbersnSpaces(){
   StringReverse1 pali2 = new StringReverse1("12321");
   assertEquals("a", true, pali2.isPalindrome());
   System.out.println(pali2.toString());
      
        //System.out.println());
//        assertEquals("212F -> 100c", 100, new ThermometerTest(212, true, "f").display(true, "f"));
//        
//        
//        assertEquals("C", 212, new ThermometerTest(212, false, "c").display(false, "c"));
//        assertEquals("100c -> 212 F", 212, new ThermometerTest(100, true, "c").display(true, "c"));
//"" is for commentary
    }
//    @Test
//    public void FtoC(){
//        assertEquals("", 100, new ThermometerTest(212,true,"c").display(false,"c"));
//       
//    }
//    @Test
//    public void integerDivision(){
//        assertEquals("", 1.0, 9F/5, .001);
//       
//    }

}
