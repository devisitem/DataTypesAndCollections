package com.company.objectmethod;

public class EqualsTest {

    public static class PersonA {
        String name;

        public PersonA(String name){
            this.name = name;
        }
    }

    public static class PersonB {
        String name;

        public PersonB(String name){
            this.name = name;
        }
    }

    public static void testPerson(){

        EqualsTest.PersonA personA = new EqualsTest.PersonA("Kimchi-dev");
        EqualsTest.PersonA personA2 = new EqualsTest.PersonA("Kimchi-dev");

        System.out.println("personA : "+ personA);
        System.out.println("personA2 : "+ personA2);

        System.out.println("personA == personA2 : " + (personA == personA2) );
        System.out.println("personA.equals(personA2) : "+ personA.equals(personA2));

    }

}
