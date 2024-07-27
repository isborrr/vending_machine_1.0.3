package vending_machine_application;
//Create `Beverage` Class Extending `Product
public class Beverage extends Product{
    //*Attributes:**flOunces` (double)
    private double flOunces;
    //*Constructor:**
            //- Throw `IllegalArgumentException` if `flOunces` is negative.
          //  - **Setters:**
          //  - Throw `IllegalArgumentException` if `flOunces` is negative.


    public Beverage(String name, double price, double flOunces) {
        super(name, price);
        if (flOunces < 0) {
            throw new IllegalArgumentException(" flOunces cannot be negative");
        }
        //constructor to initialize `name`, `price`, and `flOunces`
        this.flOunces = flOunces;
    }
// Getters and setters for `flOunces`.
    public double getFlOunces() {
        return flOunces;
    }

    public void setFlOunces(double flOunces) {
        if (flOunces < 0) {
            throw new IllegalArgumentException("flOunces cannot be negative");
        }
        this.flOunces = flOunces;
    }
// Override `toString()` method.
    @Override
    public String toString() {
        return "Beverage{name='" + getName() + "', price=" + getPrice() + ", flOunces=" + flOunces + "}";
  //*Hint:** The `toString` method should return a string representation
        // of the beverage, including `name`, `price`, and `flOunces`.
    }
}

