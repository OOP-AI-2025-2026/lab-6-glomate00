package org.example;

public class Car implements Comparable {
    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Object o) {
        Car c = (Car) o;

        if (this.price != c.price)
            return c.price - this.price; // менша ціна = "більше"
        else if (this.year != c.year)
            return this.year - c.year;   // новіший = "більше"
        else
            return this.horsePower - c.horsePower; // більше кінських сил = "більше"
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }
}
