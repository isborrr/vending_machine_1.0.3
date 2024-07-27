package vending_machine_application;
//Implement a `Snack` class that extends `Product`
public class Snack  extends Product{

//*Attributes:**- `isVegan` (boolean)
    private boolean isVegan;
// A constructor to initialize `name`, `price`, and `isVegan`
    public Snack(String name, double price, boolean isVegan) {
        super(name, price);
        this.isVegan = isVegan;
    }
// Getters and setters for `isVegan
    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }
//Override `toString()` method.
    @Override
    public String toString() {
        return "Snack{name='" + getName() + "', price=" + getPrice() + ", isVegan=" + isVegan + "}";
    }
    //toString` method should return a string representation of the snack,
    // including `name`, `price`, and `isVegan`.
}




