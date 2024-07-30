package vending_machine_application;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//Create `VendingMachine` Class**
public class VendingMachine {

    //**Attributes:*##slots` (Map<String, Slot<? extends Product>>)
    private Map<String, Slot<? extends Product>> slots;
    //*Methods:**
    //  - `addProduct`: Throw `IllegalArgumentException` if `code` is null or empty, or if `slot` is null.
    //  - `dispenseProduct`: Throw `IllegalArgumentException` if `code` is null or empty.

    // Default constructor to initialize the `slots` map.
    public VendingMachine() {
        // - **Hint:** Initialize the `slots` attribute with a new `HashMap`.
        this.slots = new HashMap<>();
    }

    //addProduct(String code, Slot<T> slot)` to add a product slot.
    //         - **Hint:** Use `slots.put(code, slot)` to add the slot to the map.

    public <T extends Product> void addProduct(String code, Slot<T> slot) {
        if (code == null || code.isEmpty()) {
            throw new IllegalArgumentException("Code cannot be null or empty");
        }
        if (slot == null) {
            throw new IllegalArgumentException("Slot cannot be null");
        }
        slots.put(code, slot);
    }
//dispenseProduct(String code)` to dispense a product.
//         - **Hint:** Check if the slot exists and has a quantity greater than 0.
//         If so, decrease the quantity by 1 and return the product.
//         If not, print "Product not available" and return null.

    public Product dispenseProduct(String code) throws IOException {
        if (code == null || code.isEmpty()) {
            throw new IllegalArgumentException("Code cannot be null or empty");
        }
        Slot<? extends Product> slot = slots.get(code);
        if (slot.getQuantity() > 0) {
            slot.setQuantity(slot.getQuantity() - 1);
            System.out.println("Testing receipt ");
            this.printReceipt(slot.getProduct());
            return slot.getProduct();
        } else if (slot.getQuantity() == 0 ) {
            sendVendorNotification(slot.getProduct());
            return null;
        } else {
            System.out.println("Product not available");
            return null;
        }
    }
//displayProducts()` to display available products.
//       - **Hint:** Iterate over the entries in the `slots` map and print the code and slot details.

    public void displayProducts() {
        for (Map.Entry<String, Slot<? extends Product>> entry : slots.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }

    public <T extends Product> void printReceipt(T product) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("receipt.txt"));
            writer.write(product.toString());
            writer.newLine();
            // Creating object of date class
            Date d1 = new Date();

            // Printing the value stored in above object
            System.out.println("Date is:  " + d1);
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (writer != null){
                writer.close();
            }
        }
    }
    public <T extends Product> void sendVendorNotification(T product) throws IOException{
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter("notification_"+product.getName()+".txt"));
            writer.write("Product: "+ product.getName()+" Is out of stock");
            writer.newLine();
        }catch (IOException e) {
            e.printStackTrace();
        }   finally {
            if (writer != null){
                writer.close();
            }
        }
    }

    public void loadProductsFromCsv(String fileName) throws IOException, FileNotFoundException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            while (reader.ready()) {
                String [] line = reader.readLine().split(",");
                String code = line[0];
                String productType = line[1];
                String productName = line[2];
                double price = Double.parseDouble(line[3]);
                int quantity = Integer.parseInt(line[4]);
                if (productType.equalsIgnoreCase("Snack")) {
                    Snack snack = new Snack(productName, price, false);
                    Slot<Product> s1 = new Slot<>(snack, quantity);
                    addProduct(code, s1);

                }else if(productType.equalsIgnoreCase("Beverage")) {
                    Random random = new Random();
                   Beverage beverage = new Beverage(productName, price, random.nextDouble(10)+1);
                    Slot<Product> b1 = new Slot<>(beverage, quantity);
                    addProduct(code, b1);

                }
                //addProduct

            }


        }catch (FileNotFoundException fe) {
            fe.printStackTrace();
        }finally {
            reader.close();
        }

    }


}


