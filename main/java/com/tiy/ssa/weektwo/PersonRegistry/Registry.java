package com.tiy.ssa.weektwo.PersonRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tiy.ssa.weektwo.day3.SocialSecurityNumber;

public class Registry 
{
    final Map<SocialSecurityNumber, Person> regmap = new HashMap<>();

    public boolean add(Person person)
    {   
        if (regmap.get(person)==null) return false;
        else
        regmap.put(person.getSsn(), person);
        return true;
    }
   public Person progenitor(SocialSecurityNumber ssn)
    {

    }

//    public boolean remove(SocialSecurityNumber ssn)
//    {
//        
//    }

    public Person oldestLivingRelative(SocialSecurityNumber ssn)
    {

    }
    public List<Person> ancestors(SocialSecurityNumber ssn)
    {

    }

    public List<Person> descendants(SocialSecurityNumber ssn)
    {   //List<Person> descList;
          if(regmap.get(ssn).getChildren().size() != 0) { //is there 
            for(Person per: regmap.get(ssn).getChildren()){
                     per.getChildren().addAll( descendants(per.getSsn()));
            
            }
            return regmap.get(ssn).getChildren();
        }else 
            return regmap.get(ssn).getChildren();
               
            //  return per.getChildren());
                //     descList.add(per);
         //   Person per = regmap.get(ssn);
//return registryMap.get(ssn).getCildren();
            
          //  return new ArrayList<>();
    }

    public Person youngestDescendant(SocialSecurityNumber one)
    {
        return null;

    }
    public boolean areRelated(SocialSecurityNumber one, SocialSecurityNumber two)
    {
        return false;

    }

    public Person get(SocialSecurityNumber ssn)
    {
return null;
    }

    public Relationship related(SocialSecurityNumber one, SocialSecurityNumber two)
    {
 return Relationship.CHILD;
    }


    public static enum Relationship
    {
        PARENT, CHILD, GRANDPARENT, GRANDCHILD, COUSIN, SIBLING, NIBLING, AUNCLE;
    }

}
