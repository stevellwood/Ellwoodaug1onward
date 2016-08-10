package com.tiy.ssa.weektwo.day3;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tiy.ssa.weektwo.day2.User;

public class WordCountTest
{

    
static String SOURCE = "CONTENT content of of go go of WIKIPEDIA PARAGRAPHS GO go here HERE";
WordCount wordCount = new WordCount();

@Before
public void parse()
{   
    String[] words = SOURCE.split("\\W+"); //should take care of punctuation and other special 
                                           //characters
    for (String word : words)
    {
        this.wordCount.addWord(word);
        //System.out.println("words: "+ word);
    }}
    @After
public void clear()
{
    this.wordCount = null;
}

@Test
public void initial() {
//Map <String, Integer> map = new HashMap<>();
//User user = new User("Joe", "Smith",1);
//    map.put(new SocialSecurityNumber("123456789"), user);
        assertEquals("", 2, wordCount.count("content") );
}
@Test
public void descending() {
  //Map <String, Integer> map = new HashMap<>();
  //User user = new User("Joe", "Smith",1);
//      map.put(new SocialSecurityNumber("123456789"), user);
          //assertEquals("", 2, wordCount.count("content") );
    for(String s: wordCount.top(4))
            System.out.print(s + " ");
  }
}


