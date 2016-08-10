package com.tiy.ssa.weektwo.day3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SocialSecurityNumberTest {

    @Test
    public void last4() {
        assertEquals("","1234",new SocialSecurityNumber("9998881234").last4Digits());
    }

}
