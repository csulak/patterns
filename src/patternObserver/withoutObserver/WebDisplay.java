package patternObserver.withoutObserver;

public class WebDisplay {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Web Display: Temperature: " + temperature + 
                         "°C, Humidity: " + humidity + 
                         "%, Pressure: " + pressure + " hPa");
    }
} 