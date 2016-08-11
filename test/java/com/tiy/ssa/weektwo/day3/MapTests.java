package com.tiy.ssa.weektwo.day3;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.tiy.ssa.weektwo.day2.User;

public class MapTests {
//unordered list, but can get a specific item by asking for its key
    @Test
    public void initial() {
        
       SocialSecurityNumber ssn1 = new SocialSecurityNumber("123456789");

       
       Map <SocialSecurityNumber,User> map = new HashMap<>();
       User user = new User("Joe", "Smith",1);
       map.put(new SocialSecurityNumber("123456789"), user);
       assertEquals("", user, map.get(new SocialSecurityNumber("123456789")));
    // using the same key no tthe samekey instance
       // why use new? This would be how a webserver would pass a request to you)
    User removed = map.remove(new SocialSecurityNumber("123456789"));
    assertEquals("",user,removed);
    //get returns the user when they key is SSN object whose data valueis 123456789
    assertEquals("",user,map.get(new SocialSecurityNumber("123456789")));
    //remove with just key value
    //to print out elements of a map as a collection
    for (Entry entry : map.entrySet()){
        //entry.//we could add a list of entries to one hascode value
    }
    map.putIfAbsent(key, value); very useful if don't want to overwrite entries already there
    }
    @Test
    public void stringshash(){
        System.out.println("horse".hashCode());
        System.err.println("hoarse".hashCode());
    }
    @Test
    public void exceptions(){
        try{ 
            foo();}
        catch (Exception ex){
        }
    }
    static void foo(){}
//?why do we need to create new object for getting a value when 
}
