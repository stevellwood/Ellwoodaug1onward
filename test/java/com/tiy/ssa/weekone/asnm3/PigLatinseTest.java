package com.tiy.ssa.weekone.asnm3;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class PigLatinseTest {
    String startsWithVowel = "ellwood";
    //Scanner scan = new Scanner(System.in);
  //pig latin is hard to speak === Igpay Atinlay isway ardhay otay eakspay   
    //String startsWithOneConsonant = scan.nextLine().toLowerCase();;
    String startsWithOneConsonant = "pig";
    String startsWithTwoConsonants = "child";
    //only test 3 fails here
    @Test
    public void test() {
//       assertTrue("ealwoodway".compareToIgnoreCase(PigLatinse.translate(startsWithVowel)) == 0);
//        assertTrue("arrylay".compareToIgnoreCase(PigLatinse.translate(startsWithOneConsonant)) == 0);
//        assertTrue("ildchay".compareToIgnoreCase(PigLatinse.translate(startsWithTwoConsonants)) == 0);
        PigLatinse line = new PigLatinse("pig");
        assertEquals("a", "igpay", line.translate());
        //pali1.toString(); this doees nothing
        System.out.println(line.toString());
        
        PigLatinse line2 = new PigLatinse("is hard");
        assertEquals("a", "Isway ardhay.", line2.translate());
        //pali1.toString(); this doees nothing
        System.out.println(line2.toString());
        //fail
//        StringReverse1 pali1a = new StringReverse1("alilal");
//        assertNotEquals("a", false, pali1a.isPalindrome());
//        //pali1.toString(); this does nothing
//        System.out.println(pali1a.toString());
        PigLatinse line3 = new PigLatinse("Pig latin is hard to learn");
        assertEquals("a", "Igpay atinlay isway ardhay otay earnlay.", line3.translate());
        //pali1.toString(); this doees nothing
        System.out.println(line3.toString());
    
    }

}
