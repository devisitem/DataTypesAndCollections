package com.company.objectmethod;

public class EqualsTest {


    public static class PersonA {
        String name;

        public PersonA(String name){
            this.name = name;
        }

       /* @Override
        public String toString() {
            return String.format("PersonA : {" +
                    "name: " + this.name +
                                        "}");
        }*/
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
        /** return false */
        System.out.println("personA.equals(personA2) : "+ personA.equals(personA2));
        /** return false */
        System.out.println("personA == personA2 : " + (personA == personA2) );
        /** 해당 객체의 주소값을 복사하므로 값이 변경되면 기존 주소값에 영향을 미침  */
        PersonA personA3 = personA;
        personA.name = "2";

        System.out.println("personA3 = " + personA3);
        System.out.println("personA = " + personA);


        /** return true */
        System.out.println("(personA == personA3) = " + (personA == personA3));
        /** return true */
        System.out.println("personA.equals(personA3) = " + personA.equals(personA3));


        String stringA = "stringA";
        String stringB = "stringA";

        System.out.println("stringA.equals(stringB) = " + stringA.equals(stringB));

        stringA.chars().forEach(chr -> {
            System.out.println("chr = " + (int) chr);
        });

        System.out.println("stringA.hashCode() = " + stringA.hashCode());
        String a = "AB";
        System.out.println("a.hashCode() = " + a.hashCode());
    }

}
