package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {
        Person person = new Person("Roni", 19, "Zgoda 9", 2005);
        person.displayDetails();
        person.growOld(10); //
        person.displayDetails();
        person.beYounger(); //
        person.displayDetails();
    }

    public static class Person {
        private String name;
        private int age;
        private String address;
        private int year_of_birth;

        public Person(String name, int age, String address, int year_of_birth) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.year_of_birth = year_of_birth;
        }

        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
            System.out.println("Year of Birth: " + year_of_birth);
        }

        public void growOld(int years) {
            age += years;
        }

        public void beYounger() {
            age--;
        }
    }
}
