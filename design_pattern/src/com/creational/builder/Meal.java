package creational.builder;

public class Meal {
    private String mainCourse;
    private String drink;
    private String dessert;

    public Meal(String mainCourse, String drink, String dessert) {
        this.mainCourse = mainCourse;
        this.drink = drink;
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Meal [Main=" + mainCourse + ", Drink=" + drink + ", Dessert=" + dessert + "]";
    }
}
