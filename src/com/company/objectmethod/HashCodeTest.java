package com.company.objectmethod;

public class HashCodeTest {

    public static class PersonA {
        String name;

        public PersonA(String name ){
            this.name = name;
        }

    }

    public static class PersonB {
        String name;

        public PersonB (String name ){
            this.name = name;
        }
    }


    public static void testPerson() {
        PersonA personA = new PersonA("Kimchi-dev");
        PersonB personB = new PersonB("Kimchi-dev");

        /** 1265094477 */
        System.out.println("personA.hashCode() = " + personA.hashCode());
        /** 2125039532 */
        System.out.println("personB.hashCode() = " + personB.hashCode());



        PersonA personC = personA;
        /** 1265094477 */
        System.out.println("personC.hashCode() = " + personC.hashCode());
        /** true */
        System.out.println("personA.equals(personC) = " + personA.equals(personC));

        String stringHash01 = "stringA";
        String stringHash02 = "stringB";

        System.out.println("stringHash01.hashCode() = " + stringHash01.hashCode());
        System.out.println("stringHash02.hashCode() = " + stringHash02.hashCode());


    }
}
