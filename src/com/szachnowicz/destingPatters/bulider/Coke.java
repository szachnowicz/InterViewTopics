package com.szachnowicz.destingPatters.bulider;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String getName() {
        return "Coke";
    }
}