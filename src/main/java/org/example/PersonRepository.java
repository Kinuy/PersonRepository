package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    List<Person> persons = new ArrayList<Person>();

    public Optional getPersonById(String id) {
        for (Person person : persons) {
            if (person.id().equals(id)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public Optional getPersonByName(String name) {
        for (Person person : persons) {
            if (person.name().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public void getNumberOfPersonsByGender() {
        int maleCount = 0;
        int femaleCount = 0;
        int diverseCount = 0;
        for (Person person : persons) {
            if (person.personGender().equals(Gender.MALE)) {
                maleCount += 1;
            } else if (person.personGender().equals(Gender.FEMALE)) {
                femaleCount += 1;

            } else if (person.personGender().equals(Gender.DIVERSE)) {
                diverseCount += 1;
            }
        }
        System.out.println("We have: " + maleCount + " male ,  " + femaleCount + " female , " + diverseCount + " diverse persons in our list.");
    }

    public List<Person> getPersonsByWeekday(DaysOfWeek dayOfWeek) {
        List<Person> personsByWeekday = new ArrayList<>();
        for (Person person : persons) {
            if(person.favoriteDay().equals(dayOfWeek)) {
                personsByWeekday.add(person);
            }
        }
        return personsByWeekday;
    }


}
