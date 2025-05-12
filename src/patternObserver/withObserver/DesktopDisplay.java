package patternObserver.withObserver;

public class DesktopDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Desktop Display: Temperature: " + temperature + 
                         "°C, Humidity: " + humidity + 
                         "%, Pressure: " + pressure + " hPa");
    }
} 