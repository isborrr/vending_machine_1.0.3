package vending_machine_application;

import java.util.HashMap;
import java.util.Map;

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

    public Product dispenseProduct(String code) {
        if (code == null || code.isEmpty()) {
            throw new IllegalArgumentException("Code cannot be null or empty");
        }
        Slot<? extends Product> slot = slots.get(code);
        if (slot.getQuantity() > 0) {
            slot.setQuantity(slot.getQuantity() - 1);
            return slot.getProduct();
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
}


