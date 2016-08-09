package com.tiy.ssa.weektwo.day2;

//public class HashTest {
   
public class Hashfoo {
    

    public static class foo{
        String name = "Fred";
        public foo(String s){
            this.name = s;
        }
    
    }
    public static class goo{
        String name = "George";
        public goo(String s){
            this.name = s;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            goo other = (goo) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }
     

    
}}

