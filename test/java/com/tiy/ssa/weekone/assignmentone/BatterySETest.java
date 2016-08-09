package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class BatterySETest {

    @Test
    public void test() {
        assertEquals("big", 3.7f, new BatterySE(10f).Discharge(3),.1);//need delta because of floating points are imprecise in java. It will not run unless you give it even a delta of 0 works
        assertTrue(new BatterySE(10f).Discharge(3)==3.7f);//you can right a short equality statement this way but it will still fail if floats are not exact
        assertEquals("big", 3, new BatterySE(12f).howLong(4),.001);//need delta because of floating points are imprecise in java 
        assertTrue(9f/5!=1.8f);//need delta because of floating points are imprecise in java 
        //this is not = for floats but it is mathematically the same.
        
        
        ///use BigDecimal for numbers like 1/3 where infinite or 9.5 where need 
        //IEEE754 
        
        
        //float compare1 = new BatterySE(10f).Discharge(3);
        // assertTrue(compare1 == 3.7, .01);
        //        assertEquals("power one", 9, new Power(3, 2).PowerofTwo(3, 2));
//        assertEquals("power one", 27, new Power(3, 3).PowerofThree(3, 3));
//        assertEquals("power one", 27, new Power(3, 3).PowerAll());
//        assertEquals("power one", 8, new Power(2, 3).PowerAll());
    }

}