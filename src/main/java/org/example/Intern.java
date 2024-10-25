package org.example;

import java.util.Comparator;

public record Intern(String firstName, String lastName, int age, Food bestFood) {

    public static Comparator<Intern> byFirstName() {
        return new Comparator<Intern>() {
            @Override
            public int compare(Intern nr1, Intern nr2) {
                return nr1.firstName.compareTo(nr2.firstName);
            }
        };
    }

    public static Comparator<Intern> byAge() {
        return new Comparator<Intern>() {
            @Override
            public int compare(Intern nr1, Intern nr2) {
                return nr1.age - nr2.age;
            }
        };
    }

    public static Comparator<Intern> byFirstNameLength() {
        return new Comparator<Intern>() {
            @Override
            public int compare(Intern nr1, Intern nr2) {
                return nr1.firstName.length() - nr2.firstName.length();
            }
        };
    }

    public static Comparator<Intern> byLastNameLength() {
        return new Comparator<Intern>() {
            @Override
            public int compare(Intern nr1, Intern nr2) {
                return nr1.lastName.length() - nr2.lastName.length();
            }
        };
    }

    public static Comparator<Intern> byFoodSpiceLevel() {
        return new Comparator<Intern>() {
            @Override
            public int compare(Intern nr1, Intern nr2) {
                return nr1.bestFood.getSpicyLevel() - nr2.bestFood.getSpicyLevel();
            }
        };
    }

    @Override
    public String toString() {
        return "\n" + firstName + " " + lastName + ", age: " + age + ", best food: " + bestFood;
    }

}
