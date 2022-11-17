package com.company;

public class Square implements Area {
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public void calculateArea() {
        System.out.println(lenght*lenght);
    }
}
