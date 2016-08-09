package com.tiy.ssa.weektwo.listsd1;

//import Modelling.PhilosopherTh.Era;
public class Philosopher {
    private final Nationality nationality; 
    private final String name;
    private final Era era;//we could make these static to satisfy the static calls, but don't do this unless necessary
    //private int birth;////???
    public Philosopher(Nationality nationality, String name, Era era){
        this.nationality = nationality;
        this.name = name;
        this.era = era;
    }
    public enum Nationality{
        GREEK, GERMAN, ENGLISH;
    }
    public boolean inCentury(int century){
        return this.era.inCentury(century);//what is going on here?
// return something from the class
    }
    public Nationality getNationality() {
        return nationality;
    }
//    public void setNationality(Nationality nationality) {
//        this.nationality = nationality;
//    }setters fail with final vars
    public String getName() {
        return this.name;
    }
    public Era getEra() {
        return era;
    }
 /////////new class no need to put } to end class above
    
    ///not trying to create all purpose era class
    public static class Era{// why is this
        final int birth, death;//new class. Why not using private?
        public Era(int birth, int death){
            this.birth = birth;
            this.death = death;
            }
        public boolean inCentury(int century){
            if (century >0)
                return ad(century);
            return bc(century);
        }
        
//        public Era getEra() {
//            return era;
            //static variable belongs to a class. each static variable only has 1 memoetyr slot
       // }//if one objects changes static variable, it changes for all the objects.
        //for final, it can't be changed
        boolean ad(int century){
            int lastOfCentury = century*100 -1;
            int firstOfCentury = (century -1) *100;
            return this.birth >= firstOfCentury && this.birth <=lastOfCentury
                    || (this.death >= firstOfCentury && this.death <= lastOfCentury);
        }
        private boolean bc (int century){
            int firstOfCentury = century * 100 - 1;
            int lastOfCentury = (century -1)*100;
            return this.birth >= firstOfCentury && this.birth <=lastOfCentury
                    || (this.death >= firstOfCentury && this.death <= lastOfCentury);
        }
        public String toString(){
            return String.format("b. %d -d. %d", this.birth, this.death);
        }
        @Override
        public boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            final Era other = (Era) obj;
            if (this.birth != other.birth)
            {
                return false;
            }
            if (this.death != other.death)
            {
                return false;
            }
            return true;
        }
}
}
