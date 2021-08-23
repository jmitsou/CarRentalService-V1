package com.company;

import java.util.ArrayList;

public class Inventory {

    public ArrayList<Car> available;
    public ArrayList<Car> notAvailable;

    public Inventory() {
        this.available = new ArrayList<>();
        this.notAvailable = new ArrayList<>();
        fillLot();
    }

    public void displayCars() {

        for (int i = 0, count = 0; i < available.size(); i++) {
            Car cars = available.get(i);
            System.out.println((i +1) + ") " + cars.getMake() + " " + cars.getModel());
        }
    }

    public void rent(int input){
        input = input - 1;
        Car cars = available.get(input);
        notAvailable.add(cars);
        available.remove(cars);
        System.out.println("\nThank you for your rental");
        //displayCars();
    }

    public void fillLot(){
       Car car1 = new Car("Ford", "Mustang", "Red",35,false);
        available.add(car1);
       Car car2 = new Car("Ford", "Fusion", "Silver", 25,false);
        available.add(car2);
       Car car3 = new Car("Nissan", "Maxima", "White",20,false);
        available.add(car3);
       Car car4 = new Car("Nissan", "Rogue", "Blue",30,false);
        available.add(car4);

    }

}
