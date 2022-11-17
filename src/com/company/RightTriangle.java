package com.company;

public class RightTriangle implements Area{
    private double lenght1;
    private double lenght2;

    public RightTriangle(double lenght1, double lenght2) {
        this.lenght1 = lenght1;
        this.lenght2 = lenght2;
    }

    @Override
    public void calculateArea() {
        System.out.println((lenght1*lenght2)/2);
    }
}
