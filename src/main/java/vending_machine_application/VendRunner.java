package vending_machine_application;

import java.io.IOException;

// Create the `VendRunner` class.
public class VendRunner {
    public static void main(String[] args) throws IOException {
        //Add code to the `main` method to intentionally pass invalid data to constructors and methods, demonstrating error handling.
        //- Catch and print exception messages to show that error handling is working as expected.
        //- Ensure the `main` method clearly shows the workflow and exception handling of the vending machine system.


// In the `main` method, create instances of `Snack`, `Beverage`, and `Slot`.
        // **Hint:** Use the provided `Snack` and `Beverage` constructors to create instances
        Snack snack1 = new Snack("Chips", 1.50, true);
        Snack snack2 = new Snack("Chocolate", 2.00, false);
        Beverage beverage1 = new Beverage("Soda", 1.25, 12.0);
        Beverage beverage2 = new Beverage("Water", 1.00, 16.9);

        Slot<Snack> slot1 = new Slot<>(snack1, 1);
        Slot<Snack> slot2 = new Slot<>(snack2, 5);
        Slot<Beverage> slot3 = new Slot<>(beverage1, 7);
        Slot<Beverage> slot4 = new Slot<>(beverage2, 20);

        //   - Create a `VendingMachine` instance.
        //Add products to the vending machine.
        //       - **Hint:** Use the `addProduct` method to add slots with codes.
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct("222", slot1);
        vendingMachine.addProduct("444", slot2);
        vendingMachine.addProduct("666", slot3);
        vendingMachine.addProduct("246", slot4);

        // Demonstrate the creation, modification, and retrieval of data.
        //       - **Hint:** Use the `dispenseProduct` method to simulate vending products
        //       and the `displayProducts` method to show available products.

        vendingMachine.displayProducts();

        System.out.println( vendingMachine.dispenseProduct("222"));
        System.out.println("Vending machine dispense testing: Create file and write product out of stock ");
        System.out.println( vendingMachine.dispenseProduct("222"));
        System.out.println(vendingMachine.dispenseProduct("444"));

        System.out.println("Products after dispensing:");
        vendingMachine.displayProducts();

        System.out.println("Testing loadProductsFromCsv and displayProducts:");
        vendingMachine.loadProductsFromCsv("products.csv");
        vendingMachine.displayProducts();
        System.out.println("-----------------------Product class handing Exception-------------------------------");
//
//        try {
//            Product product = new Product("", -1.00);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Exception handling: " + e.getMessage());
//        }
//
//        try {
//            Product product = new Product("choclate", -1.00);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Exception handling: " + e.getMessage());
//        }
//
//        System.out.println("-----------------------Beverage class handing Exception-------------------------------");
//        try {
//            Beverage  invalidBeverage  = new Beverage ("choclate", 1.25,-12.0); // This should throw an exception
//        } catch (IllegalArgumentException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//
//        System.out.println("-----------------------Slot class handing Exception-------------------------------");
//        try {
//            Slot<Snack> slotInvalid = new Slot<>(null, 10);
//
//    } catch (IllegalArgumentException e) {
//        System.out.println("Exception caught: " + e.getMessage());
//    }
//
//        try {
//            Slot<Snack> slotInvalid = new Slot<>(snack1, -10);
//
//        } catch (IllegalArgumentException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//
//        System.out.println("-----------------------VendingMachine class handing Exception-------------------------------");
//
//        VendingMachine InvalidvendingMachine = new VendingMachine();
//        try {
//            InvalidvendingMachine.addProduct(null, slot1);
//        }catch (IllegalArgumentException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//
//        try {
//            InvalidvendingMachine.addProduct("222", null);
//        }catch (IllegalArgumentException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//        try {
//            InvalidvendingMachine.dispenseProduct(null);
//        }catch (IllegalArgumentException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
//
//        try {
//            InvalidvendingMachine.dispenseProduct("");
//        }catch (IllegalArgumentException e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }
    }
}
