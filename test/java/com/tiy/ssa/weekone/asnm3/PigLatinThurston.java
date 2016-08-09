package com.tiy.ssa.weekone.asnm3;

ackage com.ironyard.ssa.week1.assignment3;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author thurston
 */
public class PigLatin 
{
    final String english;

    public PigLatin(String english)
    {
        this.english = english;
    }
    
    
    public String translate()
    {
        final String[] words = this.english.split("\\W");
        String collect = Arrays.stream(words).map(word -> 
        {
            int length = word.length();
            if (length == 1)
            {
                if (PigLatin.isVowel(word.charAt(0)))
                    return word + "way";
                return word;
            }
            
            String firstTwo = word.substring(0, 2);
            char first = firstTwo.charAt(0);
            if (PigLatin.isVowel(first))
                return word + "way";
            else if (PigLatin.isVowel(firstTwo.charAt(1)))
                return word.substring(1) + first + "ay";
            return word.substring(2) + firstTwo + "ay";
        }).collect(Collectors.joining(" "));
        return collect;
    }
    
    static boolean isVowel(char letter)
    {
        switch (Character.toUpperCase(letter))
        {
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                return true;
            default :
                return false;
        }
    }
}