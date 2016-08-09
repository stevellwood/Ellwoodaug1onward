package com.tiy.ssa.weektwo.listsd1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//Write a utility class Lists, with static methods described below: match finds all elements that are in both lists and returns a new List that contains only one of each common element
//
//another static method that takes a List<String> as input and th
public class Lists {
    private Lists() { // leave this blank as a meessage to users to not
                      // insubstantiate it
    }

    /**
     * @return a new List<T> containing only elements that are both in #one and
     *         #other (i.e. are "equal") - but just make sure that the returned
     *         List<T> is a logical set
     */
    public static <T> List<T> tmatch2(List<T> one, List<T> other) {
        List<T> combo = new ArrayList<>();
        for (Iterator<T> iterator = other.iterator(); iterator.hasNext();) {
            T next = iterator.next();
            if (one.contains(next) && !combo.contains(next)) {
                combo.add(next);
                // System.out.println(Arrays.deepToString(next.get(iterator)));
            } // Arrays.deepToString(houseAddress.get(i))
        }
        return combo;
    }
    // for(int i = 0; i < houseAddress.size(); i++) {
    // System.out.print(houseAddress.get(i));System.out.println(Arrays.toString(houseAddress));
    // shareimprove this answer
    // edited Feb 14 '12 at 8:28

    public static <T> List<T> matchTh(List<T> one, List<T> other)
    // T is needed for declaring static return types not for nonstatic
    {
        List<T> dupes = new ArrayList<>();
        for (T t : one) {
            for (T o : other) {
                if (t.equals(o))
                    dupes.add(t);
                break;
            }
        }
        return dupes;
    }/// above might fail if get duplicate in list

    public static <T> List<T> matchwHash(List<T> listOne, List<T> listTwo) {
        HashSet<T> mySet = new HashSet<T>();

        Iterator<T> it = listOne.iterator();// iterator is a built in object of
                                            // collection classes whose job is
                                            // to step through a collection

        while (it.hasNext()) {
            T item = it.next();

            if (listTwo.contains(item)) {
                mySet.add(item);
            }
        }

        return new ArrayList<T>(mySet);
    }

    public static ArrayList<String> mergewStrings(List<String> listOne, List<String> listTwo) {
        HashSet<String> mySet = new HashSet<String>();

        for (int i = 0; i < listOne.size(); i++) {
            String item = listOne.get(i);

            if (listTwo.contains(item)) {
                mySet.add(item);
            }
        }

        return new ArrayList<String>(mySet);
    }

    /**
     * @return a new List, ordered by the length of the input strings in
     *         descending order
     */

    // TODO Auto-generated method stub
    // public static List<String> descendingBySize(List<String> input){
    // Laras
    public static List<String> descreaseSizeLS(List<String> input) {
        List<String> descending = new ArrayList<String>(input);

        Comparator<String> sort = new Comparator<String>() {
            public int compare(String first, String second) {
                if (first.length() > second.length())
                    return -1;
                if (first.length() > second.length())
                    return 1;
                return 0;
            }
        };
        Collections.sort(descending, sort);
        return descending;
    }

    // Andrewm
    public static List<String> descendingBySAM(List<String> input) {
        List<String> sortedList = new ArrayList<>(input);
        sortedList.sort((s1, s2) -> -(s1.length() - s2.length()));
        return sortedList;
    }
}
// }
