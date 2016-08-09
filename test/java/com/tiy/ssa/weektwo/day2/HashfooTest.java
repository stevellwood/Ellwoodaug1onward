package com.tiy.ssa.weektwo.day2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import com.tiy.ssa.weektwo.day2.Hashfoo.foo;
import com.tiy.ssa.weektwo.day2.Hashfoo.goo;

public class HashfooTest {

    @Test
    public void identity() {
    //not using override methods   
        Set<foo> fooset = new HashSet();
        assertTrue(fooset.add(new foo("a")));
        assertTrue(fooset.add(new foo("b")));
        assertTrue(fooset.add(new foo("b")));//shoudl fail but have same id
    } 
    @Test
    public void equals() {       
        Set<goo> gooset = new HashSet();
        assertTrue(gooset.add(new goo("a")));
        assertTrue(gooset.add(new goo("b")));
        assertFalse(gooset.add(new goo("b")));
        LocalDate now = LocalDate.now();
        
     //if two things are equal, their has code needs to be the same   
    }

}
