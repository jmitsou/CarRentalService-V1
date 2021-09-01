package com.company;

import java.util.ArrayList;

public class Inventory {

    public ArrayList<Car> available;
    public ArrayList<Car> rented;

    public Inventory() {
        this.available = new ArrayList<>();
        this.rented = new ArrayList<>();
        fillLot();
    }

    public void displayCars(int l) {
        if (l == 1) {
            for (int i = 0, count = 0; i < available.size(); i++) {
                Car cars = available.get(i);
                System.out.println((i + 1) + ") " + cars.getMake() + " " + cars.getModel());
            }
        }else if (l == 2) {
            for (int i = 0, count = 0; i < rented.size(); i++) {
                Car cars = rented.get(i);
                System.out.println((i + 1) + ") " + cars.getMake() + " " + cars.getModel());
            }

        }
    }

    public void rentalProcessor(int sel, int input){
        input = input - 1;
        Car cars = sel == 1 ? available.get(input) : rented.get(input);
        String name = cars.getMake() + " " + cars.getModel();

        if (sel == 1){
            rented.add(cars);
            available.remove(cars);
            System.out.println("\nThank you for your rental of " + name );
        }else if(sel == 2){
            available.add(cars);
            rented.remove(cars);
            System.out.println("\nThank you for your return of " + name );
        }
    }

    public void fillLot() {
        Car car1 = new Car("Ford", "Mustang", "Red", 35, false);
        available.add(car1);
        Car car2 = new Car("Ford", "Fusion", "Silver", 25, false);
        available.add(car2);
        Car car3 = new Car("Nissan", "Maxima", "White", 20, false);
        available.add(car3);
        Car car4 = new Car("Nissan", "Rogue", "Blue", 30, false);
        available.add(car4);

    }

}
