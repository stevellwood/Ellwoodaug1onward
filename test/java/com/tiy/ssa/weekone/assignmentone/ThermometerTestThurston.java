package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;

import org.junit.Test;

//import org.junit.Test;

import com.tiy.ssa.weekone.assignmentone.ThermometerRev.Unit;

public class ThermometerTestThurston {

public class ThermometerTest
{

    @Test
    public void direct()
    {
        assertEquals("", 32, new ThermometerRev(32).display());
        assertEquals("", 320, new ThermometerRev(320, Unit.CELSIUS).display());
        assertEquals("", -32, new ThermometerRev(-32, Unit.FAHRENHEIT).display());
        
        
    }
    
    @Test
    public void convert()
    {
        assertEquals("", 0, new ThermometerRev(32, Unit.FAHRENHEIT).display(Unit.CELSIUS));
        assertEquals("", 32, new ThermometerRev(0, Unit.CELSIUS).display(Unit.FAHRENHEIT));
        assertEquals("", 212, new ThermometerRev(100, Unit.CELSIUS).display(Unit.FAHRENHEIT));
    }
}
}