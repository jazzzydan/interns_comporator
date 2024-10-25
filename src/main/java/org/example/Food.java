package org.example;

public enum Food {
    RIB_EYE_STEAK(1),
    EGGS(10),
    PIZZA(2),
    TERIYAKI_CHICKEN_NOODLES(5),
    SUSHI(2),
    SALMON_TEMPURA(3);

    private final int spicyLevel;

    Food(int spicyLevel) {
        this.spicyLevel = spicyLevel;
    }

    public int getSpicyLevel() {
        return spicyLevel;
    }
}
