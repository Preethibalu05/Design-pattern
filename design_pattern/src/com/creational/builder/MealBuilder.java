package creational.builder;

public class MealBuilder {
    private String mainCourse;
    private String drink;
    private String dessert;

    public MealBuilder setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    public MealBuilder setDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public MealBuilder setDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public Meal build() {
        return new Meal(mainCourse, drink, dessert);
    }
}
