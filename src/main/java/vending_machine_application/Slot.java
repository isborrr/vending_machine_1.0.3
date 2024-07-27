package vending_machine_application;
//Create `Slot` Class**
public class Slot <T extends Product> {
//Attributes:**product` (T extends Product),quantity` (int)
        private T product;
        private int quantity;
//*Constructor:**
//  - Throw `IllegalArgumentException` if `product` is null or if `quantity` is negative.
//- **Setters:**
//  - Throw `IllegalArgumentException` if `product` is null or if `quantity` is negative.
        public Slot(T product, int quantity) {
            if (product == null) {
                throw new IllegalArgumentException("Product cannot be null");
            }
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative");
            }
            //A constructor to initialize `product` and `quantity`.
            this.product = product;
            this.quantity = quantity;
        }
        //- **Hint:** The constructor should take two parameters (`product` and `quantity`) and assign them to the class attributes.


     //  - Getters and Setters for `product` and `quantity`.
        public T getProduct() {
            return product;
        }

        public void setProduct(T product) {
            if (product == null) {
                throw new IllegalArgumentException("Product cannot be null");
            }
            this.product = product;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            if (quantity < 0) {
                throw new IllegalArgumentException("Quantity cannot be negative");
            }
            this.quantity = quantity;
        }
//Override `toString()` method.
        @Override
        public String toString() {
            return "Slot{product=" + product + ", quantity=" + quantity + "}";
        }
        //toString` method should return a string representation of the slot,
    // including the product's details and quantity.

    }

