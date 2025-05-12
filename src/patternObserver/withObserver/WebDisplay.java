package patternObserver.withObserver;

public class WebDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Web Display: Temperature: " + temperature + 
                         "°C, Humidity: " + humidity + 
                         "%, Pressure: " + pressure + " hPa");
    }
} 