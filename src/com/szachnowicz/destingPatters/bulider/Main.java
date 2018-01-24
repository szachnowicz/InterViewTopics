package com.szachnowicz.destingPatters.bulider;

public class Main {
    public static void main(String[] args) {

        MealBulider mealBuilder = new MealBulider();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}
