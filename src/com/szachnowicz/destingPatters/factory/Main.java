package com.szachnowicz.destingPatters.factory;

import com.szachnowicz.destingPatters.factory.Shape;
import com.szachnowicz.destingPatters.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        Shape circle = new ShapeFactory().getShape("CIRCLE");
        Shape circle2 = new ShapeFactory().getShape("as");

        circle.draw();
        circle2.draw();

    }
}
