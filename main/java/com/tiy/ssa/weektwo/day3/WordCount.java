package com.tiy.ssa.weektwo.day3;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
//We want to implement a class WordCount, that can input words as arguments and keep track of the count of how many times that word has been seen. Each student can choose a Wikipedia article's paragraph(s) as the basis for testing the implementation
//
//Here's the public API (which must be defined as exactly as specified); students are free to add other methods as well.
import java.util.Map;

import com.tiy.ssa.weektwo.day2.User;

public class WordCount {
    Map<String, Integer> map = new HashMap<>();

    /**
     * 
     * @param word
     *            callers are responsible for ensuring <code>word</code> <br>
     *            is an actual word, parsing is done by the caller
     */
    public void addWord(String word) {
        int val = 0;
        // int valstart = 1;
        // word is new to the hashmap
        String winput = word.toLowerCase().trim();
        if (map.get(winput) == null)
            map.put(winput, 1);
        else
            val = map.get(winput);
        val++;
        map.put(winput, val);

        /**
         * @return a <em>case-insensitive</em> count of <code>word</word> in the
         *         words added to this instance
         */
    }

    public int count(String word) {
        return map.get(word);
    }

    /**
     *
     * @param many
     * @return a logical set of words ordered in descending poularity order, so
     *         top <code>many</code> words
     */
    public List<String> top(int many) {
        List<String> sortedEntries = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
            int x = (entry.getValue());
            newList.add(x); //create a list of the uniquevalue in the map
            // System.out.println(map.get(entry));
            // System.out.println(x);

        }
        Collections.sort(newList);
        Collections.reverse(newList);
        System.out.println("After Sorting:");
        for (int counter = 0; counter<newList.size(); counter++) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == counter){
                    sortedEntries.add(entry.getKey());
                    //System.out.println(counter + " " + entry.getKey());
                }
            }
        }
        List<String> returnedSortedEntries = new ArrayList<>();

        for (int i = 0; i < many; i++) {
            returnedSortedEntries.add(sortedEntries.get(i));
        }
        
        // for(int i=0; i<many;i++){
        //
        // if()
        // sortedEntries.
        //
        // sortedEntries.add(entry.getKey(newList.get(i)); //
        // getKey(newList.get(i));
        //
        return returnedSortedEntries;

        // int i=0;
        // for (Map.Entry<String, Integer> entry : map.entrySet()){
        // if(entry.getValue().equals(newList.get(i)))

    }
    // }
    // static <K,V extends Comparable<? super V>> List<Entry<K, V>>
    // entriesSortedByValues(Map<K,V> map) {
    //
    // List<Entry<K,V>> sortedEntries = new
    // ArrayList<Entry<K,V>>(map.entrySet());
    //
    // Collections.sort(sortedEntries,
    // new Comparator<Entry<K,V>>() {
    // @Override
    // public int compare(Entry<K,V> e1, Entry<K,V> e2) {
    // return e2.getValue().compareTo(e1.getValue());
    // }

    public static List<String> descendingBySize(List<String> input) {
        List<String> newList = new ArrayList<>();

        for (String str : input)
            newList.add(str);

        for (int i = 0; i < newList.size(); i++)
            for (int j = 0; j < newList.size() - 1; j++) {
                if (newList.get(j).length() < newList.get(j + 1).length()) {
                    String temp = newList.get(j);
                    newList.set(j, newList.get(j + 1));
                    newList.set(j + 1, temp);
                }
            }
        return newList;

    }

    /**
     *
     * @param many
     * @return a logical set of words ordered in ascending least popularity
     *         order, so bottom <code>many</code> words
     */
    public List<String> bottom(int many) {
        return null;

    }

    /**
     *
     * @return the input that is being word counted (maintaining the order
     *         prescribed by {@link #addWord(String) }
     * @see #addWord(String)
     */
    public String source() {
        return null;

    }

    @Override
    public String toString() {
        return "WordCount [map=" + map + "]";
    }

}
