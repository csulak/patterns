package patternObserver.withoutObserver;

public class DesktopDisplay {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Desktop Display: Temperature: " + temperature + 
                         "°C, Humidity: " + humidity + 
                         "%, Pressure: " + pressure + " hPa");
    }
} 