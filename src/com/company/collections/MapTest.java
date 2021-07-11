package com.company.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class MapTest {

    static class Person{
        String name;
        public Person(String name){
            this.name = name;
        }

        public String toString(){
            return String.format("{name: %s }",this.name);
        }
    }

    public static void hashMapTest(){

        Map<Integer, Person> people = new HashMap<>();
        IntStream.range(0, 10).forEach(i ->people.put(Integer.valueOf(i),new Person("Kimchi no."+i)));

        people.get(6).name = "23";

        people.forEach((k,v) -> System.out.println("v = " + v.name));

    }
}



