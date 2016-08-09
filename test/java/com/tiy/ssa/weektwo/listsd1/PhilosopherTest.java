package com.tiy.ssa.weektwo.listsd1;

import com.tiy.ssa.weektwo.listsd1.Philosopher.Era;
import com.tiy.ssa.weektwo.listsd1.Philosopher.Nationality;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author thurston
 */
public class PhilosopherTest
{

    List<Philosopher> philosophers = new ArrayList<>();

    public PhilosopherTest()
    {
    }

    @Before
    public void setup()
    {
        this.philosophers.add(new Philosopher(Nationality.GREEK, "Aristotle", new Era(-384, -322)));
        this.philosophers.add(new Philosopher(Nationality.ENGLISH, "John Stuart Mill", new Era(1806, 1873)));
        this.philosophers.add(new Philosopher(Nationality.GERMAN, "Friedrich Nietszhe", new Era(1844, 1900)));
        this.philosophers.add(new Philosopher(Nationality.GERMAN, "Georg Wilhelm Friedrich Hegel ", 
                                              new Era(1770, 1851)));
        this.philosophers.add(new Philosopher(Nationality.GREEK, "Socrates", new Era(-470, -399)));
    }

    @After
    public void clear()
    {
        this.philosophers.clear();
    }
    @Test
    public void filter()
    {
        List<Philosopher> greeks = nationality(Nationality.GREEK);
        assertEquals("", 2, greeks.size());
        assertEquals("", 1, greeks.stream().filter(p -> p.getName().equals("Aristotle")).count());
        assertEquals("", 1, greeks.stream().filter(p -> p.getName().equals("Socrates")).count());
    }

    @Test
    public void foo()
    {
        List<Philosopher> nonNationals = nonNationals(Nationality.GERMAN);
        assertEquals("", 3, nonNationals.size());
    }

    @Test
    public void include19th()
    {
        inclusivePlace(19);
        assertEquals("- Mill and Heidegger", 3, this.philosophers.size());
    }

    @Test
    public void exclusionary()
    {
        exclude4thBCGreeksAndEnglish();
        assertEquals("", 3, this.philosophers.size());
    }
    @Test
    public void centuryTests()
    {
        assertTrue("", new Era(1503, 1587).inCentury(16));
        assertTrue("", new Era(-487, -411).inCentury(-5));
    }

    List<Philosopher> nationality(Nationality nation)
    {
        List<Philosopher> greeks = new ArrayList<>();
        for (Philosopher philo : this.philosophers)
        {
            if (nation == philo.getNationality())
                greeks.add(philo);
        }

        return greeks;
    }

    List<Philosopher> nonNationals(Nationality nation)
    {
        List<Philosopher> aliens = new ArrayList<>();
        for (Philosopher philo : this.philosophers)
        {
            if (nation != philo.getNationality())
                aliens.add(philo);
        }

        return aliens;
    }


    void inclusivePlace(int century)
    {
        for (Iterator<Philosopher> iterator = this.philosophers.iterator(); iterator.hasNext();)
        {
            Philosopher next = iterator.next();
            if (! next.inCentury(century))
                iterator.remove();;

        }
    }

    void exclude4thBCGreeksAndEnglish()
    {
        for (Iterator<Philosopher> iterator = this.philosophers.iterator(); iterator.hasNext();)
        {
            Philosopher next = iterator.next();
            if ((next.getNationality() == Nationality.ENGLISH || next.getNationality() == Nationality.GREEK) 
                 && next.inCentury(-4))
                iterator.remove();
        }
    }
}
