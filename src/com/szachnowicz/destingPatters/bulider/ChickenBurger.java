package com.szachnowicz.destingPatters.bulider;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String getName() {
        return "Chicken Burger";
    }
}