package patternObserver.withObserver;

public class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Phone Display: Temperature: " + temperature + 
                         "°C, Humidity: " + humidity + 
                         "%, Pressure: " + pressure + " hPa");
    }
} 