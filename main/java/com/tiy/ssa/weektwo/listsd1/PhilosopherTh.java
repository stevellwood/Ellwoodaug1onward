package com.tiy.ssa.weektwo.listsd1;

public class PhilosopherTh 
{
    private final Nationality nationality;
    private final String name;
    private final Era era;

    public PhilosopherTh(Nationality nationality, String name, Era era)
    {
        this.nationality = nationality;
        this.name = name;
        this.era = era;
    }

    public Nationality getNationality()
    {
        return this.nationality;
    }

    public String getName()
    {
        return this.name;
    }

    public Era getEra()
    {
        return this.era;
    }

    public boolean inCentury(int century)
    {
        return this.era.inCentury(century);
    }

    public enum Nationality
    {
        GREEK, GERMAN, ENGLISH;
    };

    public static class Era
    {
        final int birth, death;

        public Era(int birth, int death)
        {
            this.birth = birth;
            this.death = death;
        }
        public boolean inCentury(int century)
        {
            if (century > 0)
                return ad(century);
            return bc(century);

        }
        boolean ad(int century)
        {
            int lastOfCentury = century * 100 - 1;
            int firstOfCentury = (century - 1) * 100;

            return this.birth >= firstOfCentury && this.birth <= lastOfCentury || this.death >= firstOfCentury && this.death <= lastOfCentury;
        }

        @Override
        public String toString()
        {
            return String.format("b. %d - d. %d", this.birth, this.death);
        }

        @Override
        public int hashCode()
        {
            int hash = 3;
            hash = 89 * hash + this.birth;
            hash = 89 * hash + this.death;
            return hash;
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

        private boolean bc(int century)
        {
            int firstOfCentury = century * 100 + 1;
            int lastOfCentury = (century + 1) * 100;
            return this.birth >= firstOfCentury && this.birth <= lastOfCentury 
                   || this.death >= firstOfCentury && this.death <= lastOfCentury;
        }

    };
}
