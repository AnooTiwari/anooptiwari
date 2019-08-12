package com.example.java_prectics;

import java.util.HashMap;
import java.util.Map;

public class HashMapkey {
    public static void main(String args[])
    {
        HashMap<Emp,Emp> map = new HashMap<>();

        Emp emp1= new Emp(101,"Anoop",28);
        Emp emp2= new Emp(101,"Anoop",52);
        Emp emp3= new Emp(103,"C",25);
        Emp emp4= new Emp(104,"D",24);
        Emp emp5= new Emp(105,"E",35);
        map.put(emp1,emp1);
        map.put(emp2,emp2);
        map.put(emp3,emp3);
        map.put(emp4,emp4);
        map.put(emp5,emp5);

        for(Map.Entry<Emp,Emp> entry:map.entrySet()){
            System.out.println(entry.getKey()+"         "+entry.getValue());


        }

    }
}
