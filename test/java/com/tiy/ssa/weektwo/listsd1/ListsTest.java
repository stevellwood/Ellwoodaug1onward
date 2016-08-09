package com.tiy.ssa.weektwo.listsd1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import com.tiy.ssa.weektwo.listsd1.*;
//import Modelling.Lists;
import Modelling.Philosopher;
import Modelling.Philosopher.Era;
import Modelling.Philosopher.Nationality;


public class ListsTest {
    List<Philosopher> philos1 = new ArrayList<>();
    List<Philosopher> philos2 = new ArrayList<>();

@Test
public void tmatch2(){
    //List <String> phcombo = new ArrayList<>();

    List<String> larger = Arrays.asList("he", "bye");
    List<String> xtralarger = Arrays.asList("he", "hello", "he");
    List<String> phcombo = Lists.tmatch2(larger, xtralarger);
    assertEquals("",1, phcombo.size()); //fails
    System.out.println("tmatcht2");
    showme(phcombo);
}
private <T> void showme(List<T> list)
{
//    System.out.print(list.get(0));
//    for (int i = 1; i < list.size(); i++)
//    {
//        System.out.print(", " + list.get(i));
//    }
    System.out.println(list.toString());
}
@Test
public void matchTh(){
    //List <String> phcombo = new ArrayList<>();

    List<String> larger = Arrays.asList("hi", "bye","good");
    List<String> xtralarger = Arrays.asList("hi", "hello", "hi");
    List<String> phcombo = ListsTh.matchTh(larger, xtralarger);
    assertEquals("",1, phcombo.size()); //fails
    System.out.println("matchTh \n");
    showme(phcombo);
}
@Test
public void matchwHash(){
    //List <String> phcombo = new ArrayList<>();

    List<String> larger = Arrays.asList("hei", "bye","good");
    List<String> xtralarger = Arrays.asList("hei", "hello", "hei");
    List<String> phcombo = ListsTh.matchwHash(larger, xtralarger);
    assertEquals("",1, phcombo.size()); //fails
    System.out.println("matchhash");
    showme(phcombo);
}
@Test
public void mergewStrings(){
    //List <String> phcombo = new ArrayList<>();

    List<String> larger = Arrays.asList("hit", "bye","good");
    List<String> xtralarger = Arrays.asList("hit", "hello", "hit");
    List<String> phcombo = ListsTh.mergewStrings(larger, xtralarger);
    assertEquals("",1, phcombo.size()); //fails
    System.out.println("mergewstrings");
    showme(phcombo);
}
@Test
public void ListsDescendOrderTest()
{
    List<String> strlist = new ArrayList<>();
    strlist.add("a");
    strlist.add("ab");
    strlist.add("abc");
    strlist.add("abcd");
    strlist.add("string");

    List<String> expected = new ArrayList<>();
    expected.add("string");
    expected.add("abcd");
    expected.add("abc");
    expected.add("ab");
    expected.add("a");

    List<String> descendedList = Lists.descreaseSizeLS(strlist);
    assertEquals(expected, descendedList);
    System.out.println("ListsdecreasesizeLS");
    showme(descendedList);
}
@Test
public void descendingBySAM()
{
    List<String> strlist = new ArrayList<>();
    strlist.add("a");
    strlist.add("ab");
    strlist.add("abc");
    strlist.add("abcd");
    strlist.add("string");

    List<String> expected = new ArrayList<>();
    expected.add("string");
    expected.add("abcd");
    expected.add("abc");
    expected.add("ab");
    expected.add("a");

    List<String> descendedList = Lists.descendingBySAM(strlist);
    assertEquals(expected, descendedList);
    System.out.println("Listsdescendingbysam");
    showme(descendedList);
}





}
