package com.tiy.ssa.weekone.assignmentone;

import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.Test;

public class BatterySEwBigDecTest {
    BatterySEwBigDec testPrecisionBattery;
        @Before
        public void createTestBattery() throws Exception
        {
            testPrecisionBattery = new BatterySEwBigDec(BigDecimal.valueOf(100));
        }
        
        @Test
        public void testBatteryWillNotAcceptNegativeEnergyValues() throws Exception
        {
ExpectedException thrown = null;
            //          When creating new instances of Battery, should throw an exception 
//          if negative values are passed into the Battery
           
            testPrecisionBattery = new BatterySEwBigDec(BigDecimal.valueOf(-100));
            testPrecisionBattery = new BatterySEwBigDec(BigDecimal.valueOf(-100), BigDecimal.valueOf(-50));
        }
        
        
            
        @Test
        public void testBatteryChargesCorrectlyWhenFull()
        {
//          Battery charge should not increase if battery is fully charged
            assertEquals(BigDecimal.valueOf(100), testPrecisionBattery.Charge(0));
            assertEquals(BigDecimal.valueOf(100), testPrecisionBattery.Charge(10));
        }
        
        @Test
        public void testBatteryChargesCorrectlyWhenNotFull() throws Exception
        {
//          Battery charge should increase appropriately when charged and battery is not full
//          Charge should not increase above maximum capacity
            testPrecisionBattery = new BatterySEwBigDec(BigDecimal.valueOf(100), BigDecimal.valueOf(0));
            //assertEquals(BigDecimal.valueOf(20), testPrecisionBattery.Charge(BigDecimal.valueOf(20)));
            //assertEquals(BigDecimal.valueOf(30.1), testPrecisionBattery.Charge(BigDecimal.valueOf(10.1)));
            assertEquals(BigDecimal.valueOf(100), testPrecisionBattery.Charge(10));
            assertEquals(BigDecimal.valueOf(100), testPrecisionBattery.Charge(80));
        }
        public void testBatteryDischargesCorrectly() throws Exception
        {
//          Battery charge should decrease appropriately when discharged
//          Charge should not decrease below zero
            testPrecisionBattery = new BatterySEwBigDec(BigDecimal.valueOf(100), BigDecimal.valueOf(20));
            assertEquals(BigDecimal.valueOf(6), testPrecisionBattery.Discharge(2));
            assertEquals(BigDecimal.valueOf(10), testPrecisionBattery.Discharge(5));
//            assertEquals(BigDecimal.valueOf(69.8), testPrecisionBattery.Discharge(BigDecimal.valueOf(10.1)));
//            assertEquals(BigDecimal.valueOf(0), testPrecisionBattery.Discharge(BigDecimal.valueOf(90)));
        }
      
}   
      