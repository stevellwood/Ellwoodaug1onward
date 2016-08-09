package com.tiy.ssa.weekone.assignmentone;

public class ThermometerRev
{

    private final int temperature;
    final Unit unit;
//private will make thes unavailable
//tttt"package private" or default will make this visible to only classes in the same packaage
 
    public ThermometerRev(int temperature, Unit unit)
    {
        this.temperature = temperature;
        this.unit = unit;
    }

    public ThermometerRev(int temperature)
    {
        this(temperature, Unit.FAHRENHEIT);
    }

    public int display()
    {
        return this.temperature;
    }

    public int display(Unit desired)
    {
        if (this.unit == desired)
        {
            return this.temperature;//we are not changing this value but just calling it here
        }
        return desired.convert(this.temperature);//convert is defined below
    }

    public enum Unit
    {
        FAHRENHEIT, CELSIUS;

        int convert(int temperature)
        {
            if (this == CELSIUS)
                return Math.round(5F / 9 * (temperature - 32));
  //float and int in same problem led to a float fina value          
            return Math.round(temperature * 9F / 5 + 32);
        }
    };
}