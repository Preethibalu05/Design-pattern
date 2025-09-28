package creational.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Meal meal = new MealBuilder()
                .setMainCourse("Pasta")
                .setDrink("Juice")
                .setDessert("Ice Cream")
                .build();

        System.out.println(meal);
    }
}
