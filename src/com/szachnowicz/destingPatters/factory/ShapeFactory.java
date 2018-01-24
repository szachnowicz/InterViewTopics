package com.szachnowicz.destingPatters.factory;

public class ShapeFactory {
public Shape getShape( String shapeType) {
    if (shapeType == null) {
        return null;
    }

    if (shapeType.equalsIgnoreCase("CIRCLE")) {
        return new Circle();
    }
    if (shapeType.equalsIgnoreCase("RECTANGLE")) {
        return new Ractangle();
    }
    if (shapeType.equalsIgnoreCase("SQUARE")) {
        return new Square();
    }

    return null;
}

}
