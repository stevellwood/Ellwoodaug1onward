package com.tiy.ssa.weektwo.day4;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import com.tiy.ssa.weektwo.PersonRegistry.Factorials;

public class FactorialsTest {

    @Test
    public void test() {
        assertEquals("", new BigInteger("6"), Factorials.factorial(3));
        assertEquals("", new BigInteger("1307674000000"), Factorials.factorial(15));
    }

}
