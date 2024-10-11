package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        /*
        *
        Step 1: Create an enum DaysOfWeek with the weekdays (Monday to Sunday).

        Step 2: Write a method that returns the passed weekday as a string if it is a weekday (Monday to Friday), otherwise return 'Weekend'.

        Step 3: Create a record 'Person' with the properties 'id', 'name', and 'favoriteDay', where 'favoriteDay' is of type DaysOfWeek.

        Step 4: Create a class PersonRepository with a list/map of persons.

        Step 5: Write a method in the class PersonRepository that searches for and returns a person based on their id from the list/map. The method should return an Optional.

        Step 6: In your main method, check if the person exists. If they do, print the name and favorite day of the week to the console.
        *
        *
        Expand the Person record with an enum Gender (Male, Female, Diverse).

        Write a method in the PersonRepository that counts the number of persons by gender and outputs the results.

        Add a method in the PersonRepository that searches and returns a person by their name. The method should return an Optional.

        Write a method in the PersonRepository that searches and returns all persons by their favorite weekday. The method should return a list.
        * */


        System.out.println(DaysOfWeek.getWeekdayAsString(DaysOfWeek.SUNDAY));

        Person person = new Person("1", "Peter", DaysOfWeek.SUNDAY, Gender.MALE);
        Person person2 = new Person("2", "Hans", DaysOfWeek.MONDAY, Gender.MALE);
        Person person3 = new Person("3", "Marc", DaysOfWeek.WEDNESDAY, Gender.DIVERSE);
        Person person4 = new Person("4", "Anika", DaysOfWeek.WEDNESDAY, Gender.FEMALE);
        Person person5 = new Person("5", "Lilli", DaysOfWeek.WEDNESDAY, Gender.FEMALE);
        PersonRepository personRepository = new PersonRepository();
        personRepository.persons.add(person);
        personRepository.persons.add(person2);

        personRepository.getNumberOfPersonsByGender();

        Optional<Person> person1 = personRepository.getPersonById("1");
        Optional<Person> personOpt = personRepository.getPersonByName("Hans");


        if (person1.isPresent()) {
            System.out.println(person1.get().favoriteDay());
        }
        else {
            System.out.println("No person found by id");
        }
        if (personOpt.isPresent()) {
            System.out.println(personOpt.get().favoriteDay());
        }
        else {
            System.out.println("No person found by name");
        }

    }
}