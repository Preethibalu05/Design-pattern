package creational.factory;

public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) return null;
        return switch (type.toLowerCase()) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            default -> null;
        };
    }
}
