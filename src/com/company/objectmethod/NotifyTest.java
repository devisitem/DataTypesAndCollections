package com.company.objectmethod;

public class NotifyTest {

    public static class PersonA{
        int id;
        String name;

        public PersonA(String name) {
            this.name = name;
        }
    }

    public static void testPerson() {
        PersonA personA = new PersonA("Kimchi-dev");

        personA.notify();
    }
}
