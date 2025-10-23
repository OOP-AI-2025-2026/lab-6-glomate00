package org.example;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Рекс");
        Animal cat = new Cat("Мурчик");
        System.out.println(dog.getName() + ": " + dog.makeSound());
        System.out.println(cat.getName() + ": " + cat.makeSound());
    }
}
