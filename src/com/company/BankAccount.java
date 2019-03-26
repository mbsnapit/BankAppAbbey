package com.company;
import java.util.Scanner;

public class BankAccount {
    String userName = "Abbey";
    int balance = 0;
    int customerId = 112233;
    String userChoice;


    public void showMenu() {


        System.out.println("Welcome " + userName + "!" + "\nYour customerID is : " + customerId);


        do {

            System.out.println("Press 1 to check balance.");

            System.out.println("Press 2 to deposit funds.");

            System.out.println("Press 3 to withdraw funds.");

            System.out.println("Press 4 to exit application ");

            System.out.println();


            Scanner scanner = new Scanner(System.in);

            userChoice = scanner.nextLine();

            int amount = 0;

            switch (Integer.parseInt(userChoice)) {

                case 1:
                    System.out.println("Your balance is : " + balance );
                    break;

                case 2:
                    deposit(amount);
                    break;

                case 3:
                    withdraw(balance);
                    break;

                case 4:
                    System.out.println("Thank you for using this banking application!.");
                    break;
            }

        } while ((Integer.parseInt(userChoice)) != 4);

    }

    public void deposit(int amount) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much would you like to deposit?");
        amount = Integer.parseInt(scanner.nextLine());

            balance += amount;

            System.out.println(amount + " Has been deposited.");
            System.out.println("your new balance is : " + balance);
    }

    public void withdraw(int amount) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much would you like to withdraw?");
        amount = Integer.parseInt(scanner.nextLine());


        if (amount > balance) {
            System.out.println("your don't have enough money.");
        } else {

            balance = amount - amount;
            //balance = balance - amount;
            balance = amount;

            System.out.println( amount + " Has been withdrawn.");

        }
    }
}





