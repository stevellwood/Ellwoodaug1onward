package com.tiy.ssa.weekone.asnm3;

import java.util.Scanner;

public class PigLatinse {
    String tot;// totranslate
    String[] transarray = null;

    public PigLatinse(String pig) {
        // System.out.println("enter the sentence to translate");
        this.tot = pig.toLowerCase();
        // Scanner scan = new Scanner(System.in);
        // this.tot = scan.nextLine().toLowerCase();
    }

    // String[] ary = "abc".split("");
    public String translate() {// added static
        String[] twords = tot.split(" ");
        String aeiou = "aeiou";
        String createPL = "";
        // loop through each word and transalte
        for (int i = 0; i < twords.length; i++) {
            // one letter words or begin with vowelws
            if ((twords[i].length() == 1) || (aeiou.indexOf(twords[i].charAt(0)) != -1)) {
                twords[i] = twords[i] + "way";
            } // consonant+vowel as their first two letters
            else if ((aeiou.indexOf(twords[i].charAt(1)) != -1)) {// is there a
                // vowel in
                // place 2?
                twords[i] = twords[i].substring(1) + twords[i].substring(0, 1) + "ay";
            } else if ((aeiou.indexOf(twords[i].charAt(1)) != -1)) {
                twords[i] = twords[i] + "way";
            } else {
                // Now translate words beginning with two consonants as being
                // rep of all rest of words
                twords[i] = twords[i].substring(2) + twords[i].substring(0, 2) + "ay";
            }
        }
        // loop through words array and create sentence cumulative
        for (int i = 0; i < twords.length; i++) {
            // After the second word in the array, add a space to string before
            // adding translated word
            if (i > 0) {
                createPL = createPL + " " + twords[i];
            }
            // add the rest of word types to the string
            else {
                createPL = createPL + twords[i];
            }
        }
        // Capitalize first letter in array for grammar
        if (twords.length > 1) {
            return createPL.substring(0, 1).toUpperCase() + createPL.substring(1) + ".";
        }
        return createPL;
    }

    public String toString() {
        // for(string:)
        return "translation: " + translate();// translate(tot);
    }

    public static void main(String[] args) {
        PigLatinse pg1 = new PigLatinse("test");
        System.out.println(pg1.toString());
    }
}

// if firstcharisvowel
// substring 0 1
// platiword = word+way
// else if(secondchar isvoewl)
// wordbuilder.append(charArray[0])
//
// while sc.hasenext()
// currentword;
// paiglatinword+= " ";
// Stringbuilder wordbuilder = new Stringbuilder(word)

// how exit loops?
