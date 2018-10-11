package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private Double base;
    private Double height;
    private static final String shapeName = "Triangle";

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public String getShapeName() {
        return shapeName;
    }
    @Override
    public Double getField() {
        return 0.5 * base * height;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(base, triangle.base) &&
                Objects.equals(height, triangle.height);
    }
    @Override
    public int hashCode() {
        return Objects.hash(base, height);
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
