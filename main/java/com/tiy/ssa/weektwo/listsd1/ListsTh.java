package com.tiy.ssa.weektwo.listsd1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListsTh {
    public ListsTh(){}
    
    public static <T> List <T> matchTh(List<T> one, List<T> other)
    //T is needed for declaring static return types not for nonstatic
    {
        List <T> dupes = new ArrayList<>();
        for (T t: one){
            for (T o: other){
            if (t.equals(o))
                dupes.add(t);
                break;
}}return dupes;
    }///above might fail if get duplicate in list

public static <T> List <T> matchwHash(List<T> listOne, List<T> listTwo)
{
    HashSet<T> mySet = new HashSet<T>();
    
    Iterator<T> it = listOne.iterator();//iterator is a built in object of collection classes whose job is to step through a collection
    
    while(it.hasNext())
    {
        T item = it.next();
        
        if(listTwo.contains(item))
        {
            mySet.add(item);
        }
    }
    
    return new ArrayList<T>(mySet);
}

public static ArrayList<String> mergewStrings(List<String> listOne, List<String> listTwo)
{
    HashSet<String> mySet = new HashSet<String>();

    for(int i = 0; i < listOne.size(); i++)
    {
        String item = listOne.get(i);
    
        if(listTwo.contains(item))
        {
            mySet.add(item);
        }
    }
    
    return new ArrayList<String>(mySet);
}
}