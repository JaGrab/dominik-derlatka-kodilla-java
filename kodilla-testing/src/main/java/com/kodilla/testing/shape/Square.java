package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {
    private Double side;
    private static final String shapeName = "Square";

    public Square(Double side) {
        this.side = side;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public Double getField() {
        return side * side;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(side, square.side);
    }
    @Override
    public int hashCode() {
        return Objects.hash(side);
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
