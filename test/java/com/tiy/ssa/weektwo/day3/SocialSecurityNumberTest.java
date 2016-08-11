package com.tiy.ssa.weektwo.day3;

import static org.junit.Assert.*;

import org.junit.Test;

public class SocialSecurityNumberTest {

    @Test
    public void last4() {
        assertEquals("","1234",new SocialSecurityNumber("9998881234").last4Digits());
        //why? SSn is being asked for. to get paarameter object you need an instance
        //why not do this with strin? you do: new String"9998881234"
    }

}
