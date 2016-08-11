package com.tiy.ssa.weektwo.PersonRegistry;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
public class Factorials {

    static final Map<Integer, BigInteger> CACHE = new HashMap<>();
    private Factorials(){
        
    }
    public static <BitInteger> BigInteger factorial (int input){
        if (input <0){
            throw new IllegalArgumentException("factorial only defined on >=0");
            //return = 1;
        }
        
       
        Integer factor = 1; // this  will be the result
        for (int i = 1; i <= input; i++) {
            factor *= i;
        }
        //BitInteger bi = factor;
        BigInteger bi = BigInteger.valueOf(factor.intValue());
        CACHE.put(input, bi);
        return bi;
        
       
        
    }
    }
