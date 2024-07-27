package vending_machine_application;
// Create the `Product` class.
//     - Define the specified attributes.name price
public class Product {
    private String name;
    private double price;
    //*Constructor:**
    //  - Throw `IllegalArgumentException` if `name` is null or empty, or if `price` is negative.
    //- **Setters:**
    //  - Throw `IllegalArgumentException` if `name` is null or empty, or if `price` is negative.

    public Product(String name, double price) {

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException(" price cannot be negative");
        }
        //he constructor should take two parameters (`name` and `price`)
        this.name = name;
        this.price = price;
    }

  //  Generate Getter/Setter methods.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be negative");
        }
        this.price = price;
    }

    // Override the `toString` method.
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
//Hint:** The `toString` method should return a
// string representation of the product, including `name` and `price`.

    }



}
