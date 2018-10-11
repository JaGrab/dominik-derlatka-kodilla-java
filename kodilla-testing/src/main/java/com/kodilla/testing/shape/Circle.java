package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private Double radius;
    private static final String shapeName = "Circle";

    public Circle(Double radius) {
        this.radius = radius;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public Double getField() {
        return Math.PI * radius * radius;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius);
    }
    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
