package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerTest {

    @Test
    public void test() {
        assertEquals("power one", 10, new Power(10, 1).PowerofOne(10, 1));
        assertEquals("power one", 9, new Power(3, 2).PowerofTwo(3, 2));
        assertEquals("power one", 27, new Power(3, 3).PowerofThree(3, 3));
        assertEquals("power one", 27, new Power(3, 3).PowerAll());
        assertEquals("power one", 8, new Power(2, 3).PowerAll());
    }

}
