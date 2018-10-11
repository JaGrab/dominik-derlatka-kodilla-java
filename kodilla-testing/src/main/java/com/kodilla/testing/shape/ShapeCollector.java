package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> listOfShapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(listOfShapes.contains(shape)){
            listOfShapes.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        Shape figure = null;
        if(n >= 0 && n < listOfShapes.size()){
            figure = listOfShapes.get(n);
        }
        return figure;
    }
    public void showFigures() {
        String result = new String();
        for(Shape figure: listOfShapes){
            result = result + figure + ", field: " + figure.getField() + "\n";
        }
        System.out.println(result);
    }
    public int getShapeQuantity() {
        return listOfShapes.size();
    }
}
