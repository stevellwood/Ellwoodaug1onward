package com.tiy.ssa.weektwo.day3;

public class SocialSecurityNumber {
    private final String data;
    public SocialSecurityNumber(String data){
        this.data= data;
    }
    //It is reallyimportant to override  equals and hashcode and you will not get what you expect
    public String last4Digits(){
        return this.data.substring(this.data.length() -4);
    }
    @Override
    public String toString() {
        return this.data;
    }
  //public User(String firstName, String lastName, int age)
//{
//    this.firstName = firstName;
//    this.lastName = lastName;
//    this.age = age;
//} "SocialSecurityNumber [data=" + data + "]";
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
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
        SocialSecurityNumber other = (SocialSecurityNumber) obj;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }
    }

@Override
    public String toString1() {
        return "SocialSecurityNumber [data=" + data + "]";
    }
public User()
{

}

public String getFirstName()
{
    return this.firstName;
}

public void setFirstName(String firstName)
{
    this.firstName = firstName;
}

public String getLastName()
{
    return this.lastName;
}

public void setLastName(String lastName)
{
    this.lastName = lastName;
}

public int getAge()
{
    return this.age;
}

public void setAge(int age)
{
    this.age = age;
}