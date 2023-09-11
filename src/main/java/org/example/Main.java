package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" +
                "\n the menu but we need to decide on pricing.");
        // New scanner object to accept input from users
        Scanner input = new Scanner(System.in);
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        // Standard cupcake description:
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);

        // Now use the price value as a parameter to call the setPrice() method:
        cupcake.setPrice(price);

        // RED VELVET CUPCAKE MENU ITEM //

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        // Red velvet cupcake description:
        redVelvet.type();
        System.out.println("How much would you like to charge for the red velvet cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        // Now use the price value as a parameter to call the setPrice() method:
        redVelvet.setPrice(price);

        // CHOCOLATE CUPCAKE MENU ITEM //

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");
        // Chocolate cupcake description:
        chocolate.type();
        System.out.println("How much would you like to charge for the chocolate cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        // Now use the price value as a parameter to call the setPrice() method:
        chocolate.setPrice(price);

        // Add each cupcake type to the cupcake menu:
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        // WATER DRINK MENU ITEM

        System.out.println("We are deciding on the price for our water. Here is the description:");
        // Drink description:
        water.type();
        System.out.println("How much would you like to charge for the water?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        // Now use the price value as a parameter to call the setPrice() method:
        water.setPrice(price);

        // SODA DRINK MENU ITEM
        System.out.println("We are deciding on the price for our soda. Here is the description:");
        // Soda description:
        soda.type();
        System.out.println("How much would you like to charge for the soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        // Now use the price value as a parameter to call the setPrice() method:
        soda.setPrice(price);

        // MILK DRINK MENU ITEM:
        System.out.println("We are deciding on the price for our milk. Here is the description:");
        // Milk description:
        milk.type();
        System.out.println("How much would you like to charge for the milk?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        // Now use the price value as a parameter to call the setPrice() method:
        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu, drinkMenu);

    }
}

class Cupcake {
    public double price;

    // A getter method that takes no parameters and returns the price.
    public double getPrice() {
        return price;
    }
    // A setter method that takes a single parameter, a double named price, and returns void.
    public void setPrice(double price) {
        this.price = price;
    }
    // Method that prints a description and returns void.
    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

class RedVelvet extends Cupcake {

    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }

}

class Chocolate extends Cupcake {
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}

class Drink {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("This is the drink description");
    }
}

class Soda extends Drink {
    public void type() {
        System.out.println("A bottle of soda.");
    }
}

class Milk extends Drink {
    public void type() {
        System.out.println("A bottle of milk.");
    }
}

