package behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        DisplayDevice phone = new DisplayDevice("Phone Display");
        DisplayDevice tv = new DisplayDevice("TV Display");

        station.addObserver(phone);
        station.addObserver(tv);

        station.setTemperature(28.5f);
        station.setTemperature(30.0f);
    }
}
