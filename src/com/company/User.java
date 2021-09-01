package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class User {

    public static ArrayList<User> userDB = new ArrayList<>();

    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static void credentials(){
        System.out.println("Please enter your username & password: ");
        System.out.print("\nUserName: ");
        String usr = CLI.getStr() ;
        System.out.print("Password: ");
        String pass = CLI.getStr();
        System.out.println("test");

        for (int i = 0; i < userDB.size(); i++) {
            if ( usr.equals(userDB.get(i).userName) && pass.equals(userDB.get(i).password)){
                Menu.start();
            }else{
                System.out.println("\nUsername or Password are incorrect, Please try again\n");
                credentials();
            }
        }


    }

    public static void storeCredentials(){
        System.out.println("\nWe will need a username and password to let you rent a car.");
        System.out.print("\nEnter your username: ");
        String usr = CLI.getStr();
        System.out.print("Enter your password: ");
        String pass = CLI.getStr();
        System.out.println("\nThank you your credentials have been stored.");
        User newUser = new User(usr,pass);
        userDB.add(newUser);
        Menu.start();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
