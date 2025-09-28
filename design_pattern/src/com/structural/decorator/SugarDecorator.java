package structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
    public double getCost() {
        return coffee.getCost() + 5.0;
    }
}
