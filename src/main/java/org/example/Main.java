package org.example;

import java.util.ArrayList;

import static org.example.Food.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Intern> interns = new ArrayList<>();
        interns.add(new Intern("Daniil", "Starov", 41, RIB_EYE_STEAK));
        interns.add(new Intern("Mikk", "Sarv", 37, EGGS));
        interns.add(new Intern("Madli", "Petuhhov", 34, PIZZA));
        interns.add(new Intern("Liis", "Usin", 33, TERIYAKI_CHICKEN_NOODLES));
        interns.add(new Intern("Anna Brita", "Ani", 23, SUSHI));
        interns.add(new Intern("Liis", "Schotter", 33, SALMON_TEMPURA));


        interns.sort(Intern.byFoodSpiceLevel().reversed());
        System.out.println(interns);
        interns.sort(Intern.byAge());
        System.out.println(interns);
        interns.sort(Intern.byFirstNameLength().thenComparing(Intern.byLastNameLength()));
        System.out.println(interns);
    }
}