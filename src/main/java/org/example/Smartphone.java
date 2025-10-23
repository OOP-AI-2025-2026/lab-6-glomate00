package org.example;

public class Smartphone implements GPS, Cellular {
    private String model;
    private double latitude;
    private double longitude;

    public Smartphone(String model, double latitude, double longitude) {
        this.model = model;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public double[] getCoordinates() {
        return new double[]{latitude, longitude};
    }

    @Override
    public void makeCall() {
        System.out.println(model + " здійснює дзвінок...");
    }

    @Override
    public void receiveCall() {
        System.out.println(model + " приймає дзвінок...");
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
