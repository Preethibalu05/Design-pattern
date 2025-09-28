package structural.decorator;

public class SimpleCoffee implements Coffee {
    public String getDescription() {
        return "Simple Coffee";
    }
    public double getCost() {
        return 50.0;
    }
}
SimpleCoffee.java