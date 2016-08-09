package com.tiy.ssa.weekone.asnm3;

import java.util.Scanner;

public class StringReverse1 {
    static Scanner scan = new Scanner(System.in);
   String usertry;
   
   public StringReverse1(String palilap){
       readClean(palilap);
       this.usertry = palilap;
   }
   
   public boolean isPalindrome(){
       int left,right=0;
       String guess = this.usertry;
       char[] chararr= guess.toCharArray();
       guess.toCharArray();
       right=chararr.length-1;
       //switch values of left and right
       for (left=0; left < right ; left++ ,right--){
           char ch = chararr[left];//save the leftmost digit
           chararr[left] = chararr[right];//replace the slot for left digit with the right one
           chararr[right] = ch; //replace the right slot with the saved left slot.
           //increment left and move pointer to 2nd from right.
       }
       guess = new String(chararr);//http://stackoverflow.com/questions/7655127/how-to-convert-a-char-array-back-to-a-string
       return (guess == this.usertry) ?  true: false;
   }
   @Override
   public String toString(){
       return this.usertry + (this.isPalindrome()? " is":" isn't") + "a palindrome"; //() essential 
   }
   public String readClean(String alula){
       //System.out.println("enter palindrome spaces ok");
       //String alula = scan.nextLine();
       alula = alula.replaceAll("\\s","").trim().toLowerCase();
       return alula;
   }
   public static void main(String[] args) {
       StringReverse1 sr1 = new StringReverse1("asdfset");
       //sr1.isPalindrome();
       //sr1.toString();
        System.out.println(sr1.toString());
   }
    //a = a.replaceAll("\\s","");In the context of a regex, \s will remove anything that is a space character (including space, tab characters etc). You need to escape the backslash in Java so the regex turns into \\s. Also, since Strings are immutable it is important that you assign the return value of the regex to a.
}
///////////////////////////////////Thurston
//public boolean isPalindrome(){
//    final char[] = this.candidate.toCharArray)(); 
//    if (0 ==chars.length)
//        return false;
//    for(int left = 0, right = chars.length-1;right > left; left ++, right--){
//        if (chars[left] != charst[right])
//    }
//}//the first expression is run only once at start to initialize start conditions
//second boolean runs atstart of each loop
////////////////thurston:
//public class MaybePalindrome 
//{
//    final String candidate;
//
//    public MaybePalindrome(String candidate)
//    {
//        this.candidate = candidate.trim();
//    }
//    
//    public boolean isPalindrome()
//    {
//        
//        final char[] chars = this.candidate.toCharArray();
//        if (0 == chars.length)
//            return false;
//        for (int left = 0, right = chars.length - 1; left