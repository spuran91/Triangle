package com.tradeshift.model;


import java.util.Objects;

public class Triangle {
    private final double side1;
    private final double side2;
    private final double side3;

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getSide1(), getSide1()) == 0 &&
                Double.compare(triangle.getSide2(), getSide2()) == 0 &&
                Double.compare(triangle.getSide3(), getSide3()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide1(), getSide2(), getSide3());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public Triangle(Builder builder)
    {
        this.side1 = builder.side1;
        this.side2 = builder.side2;
        this.side3 = builder.side3;
    }

    // Static class Builder
    public static class Builder {

        /// instance fields
        private double side1;
        private double side2;
        private double side3;

        public static Builder newInstance()
        {
            return new Builder();
        }

        public Builder() {}

        // Setter methods
        public Builder setSide1(double side1)
        {
            this.side1 = side1;
            return this;
        }
        public Builder setSide2(double side2)
        {
            this.side2 = side2;
            return this;
        }
        public Builder setSide3(double side3)
        {
            this.side3 = side3;
            return this;
        }

        // build method to deal with outer class
        // to return outer instance
        public Triangle build()
        {
            return new Triangle(this);
        }
    }

    public boolean isTriangle()  {
        if(this.side1 + this.side2 <= this.side3 || this.side2 +this.side3 <= this.side1 || this.side1 +this.side3 <= this.side2){
           return false;
        }
        else {
            return true;
        }
    }

    public String getTypeofTriangle(){
        double a =this.side1;
        double b = this.side2;
        double c = this.side3;
        if (a == b && b == c) return "EQUILATERAL";
        if (b==c || a==b || c==a) return "ISOSCELES";
        return "SCALENE";
    }
}
