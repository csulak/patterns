package patternObserver.withoutObserver;

public class PhoneDisplay {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Phone Display: Temperature: " + temperature + 
                "°C, Humidity: " + humidity + 
                "%, Pressure: " + pressure + " hPa");
    }
} 