package com.tiy.ssa.weektwo.day2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class NameTest {
    List <User> users = new ArrayList<>();
    List <Name> knownChildren = new ArrayList<>();
    
    
    @Before 
    public void setup() {//test fixture
        
        this.users.add(new User("J","T",20));
        this.users.add(new User("Tiny","Tom",2));
        knownChildren.add(new Name("Tiny","Tom"));
        this.users.add(new User("T","J",15));
        knownChildren.add(new Name("T","J"));
        this.users.add(new User("Amy","Sh",14));
        this.users.add(new User("Joe","Poe",20));
        this.users.add(new User("Marco","Polo",40));
        knownChildren.add(new Name("Amy","Sh"));
    }
    @After
    public void clear() {
        this.users.clear();
        knownChildren.clear();}
    
    
    static Collection<Name> children(Collection<? extends User> users){
        Collection <Name> youth = new ArrayList <>();
        for (User auser: users){
            if(auser.getAge() < 16) {
                String first = auser.getFirstName();
                String last = auser.getLastName();
                Name aname = new Name(first,last);
                youth.add(aname);
            }
        }
        return youth;
    }
    @Test
    public void testChildren() {       
        Collection <Name> cnames = NameTest.children(this.users);
        System.out.println(cnames.toString());
        System.out.println("Size of coll: " +cnames.size());
        assertTrue(knownChildren.containsAll(cnames));//   (new goo("a")));
    }   
    @Test
    public void testAverage() {       
        //Collection <Name> cnames = NameTest.children(this.users);
        int agetot = 111,userstot = 6;
        float average = 111/6;
       System.out.println("expect: "+ agetot/userstot + " result: "+ adultAverageAge(users));
        assertEquals("float",average,NameTest.adultAverageAge(users),.01);//   (new goo("a")));    
     //if two things are equal, their has code needs to be the same   
    }
    static float adultAverageAge(Collection<? extends User> users){
        //Collection <Integer> users2 = new ArrayList<Integer>();
        int years = 0;
        //for (int i = 0; i < users.size(); i++){
        int counter = 0;
        for(User abc: users){
            int prsn = abc.getAge();
            years = years + prsn;
            counter++;
        }
        float average = years/counter;
        return average;
    }

}
