package com.company;

import java.util.Scanner;

public class Menu {

    public static void start() {
        Inventory lot = new Inventory();
        int choice = 0;

        do { //Check to see if all the cars have been rented
            if (lot.available.size() > 0){
                System.out.println("\nAvailable Cars: ");
                lot.displayCars();
                System.out.println("\nEnter a number to select the car you'd like to rent:");
                System.out.print("\nSelection: ");
                int enteredValue = CLI.getNum(1,4);
                lot.rent(enteredValue);

            }
            choice = subMenu();

            if (choice == 1 && lot.available.size() == 0) {
                System.out.println("No more cars to rent please select option 2");
            } else if (choice == 2 && lot.available.size() == 0) {
                lot.fillLot();
            } else if (choice == 3) {
                System.out.println("\nBye have a nice day");
            }

        }
        while (choice != 3);


    }

    public static int subMenu() {
        System.out.println("\nWould you like to rent another car");
        System.out.println("(1) Rent another car.\n(2) Reset Inventory \n(3) Exit");
        System.out.print("\nSelection: ");
        int choice = CLI.getNum(1,3);
        return choice;
    }


}
