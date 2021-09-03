package com.company;

import static com.company.User.userDB;

public class Menu {


    public static void start() {
        Inventory lot = new Inventory();
        System.out.println("\nWe have " + lot.available.size() + " cars available to rent");
        int choice = 0;


        do { //Check to see if all the cars have been rented
            if (lot.available.size() > 0) {
                System.out.println("1) Rent a car (" + lot.available.size() + ")");
                System.out.println("2) Return a car (" + lot.rented.size() + ")");
                System.out.print("\nSelect an option:");
                int enteredValue = CLI.getNum(1, 2);

                if (enteredValue == 1) {
                    System.out.println("\nAvailable Cars: ");
                    lot.displayCars(1);
                    System.out.println("\nEnter a number to select the car you'd like to rent:");
                    System.out.print("\nCar Selection: ");
                    int selCar = CLI.getNum(1, 4);
                    lot.rentalProcessor(enteredValue, selCar);

                } else if (enteredValue == 2 && lot.rented.size() > 0) {
                        System.out.print("Please confirm password.\nPassword: ");
                        String conf = CLI.getStr();
                        for (User user : userDB) {
                            if (conf.equals(user.getPassword())) {
                                System.out.println("\nRented Cars: ");
                                lot.displayCars(2);
                                System.out.println("\nEnter a number to select the car you'd like to return:");
                                System.out.print("\nCar Selection: ");
                                int selCar = CLI.getNum(1, 4);
                                lot.rentalProcessor(enteredValue, selCar);
                            }
                        }
                    System.out.println("Sorry password was incorrect. Try again");

                }

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
        System.out.println("\nWould you like to rent another car or return a car");
        System.out.println("(1) Rent or Return.\n(2) Reset Inventory \n(3) Exit");
        System.out.print("\nSelection: ");
        int choice = CLI.getNum(1, 3);
        return choice;
    }

    public static void login() {
        //Adds temp user to have an account in to match against
        User admin = new User("admin", "password");
        User.userDB.add(admin);

        System.out.println("\nPlease login or sign-up: ");
        System.out.println("\n1)Sign up");
        System.out.println("2)Login");
        System.out.println("3)Exit");
        System.out.print("\nSelection: ");
        int option = CLI.getNum(1, 3);

        if (option == 1) {
            User.storeCredentials();
        } else if (option == 2) {
            if (User.userDB.size() > 0) {
                User.credentials();
            } else {
                System.out.println("No users found please create an account");
                User.storeCredentials();
            }

        } else if (option == 3) {
            System.out.println("Sorry we couldn't help you. Maybe next time");
        }
    }


}
