package patternObserver.withoutObserver;

public class WeatherStation {
    private float temperature;
    private float humidity;
    private float pressure;
    
    private PhoneDisplay phoneDisplay;
    private WebDisplay webDisplay;
    private DesktopDisplay desktopDisplay;
    
    public WeatherStation() {
        phoneDisplay = new PhoneDisplay();
        webDisplay = new WebDisplay();
        desktopDisplay = new DesktopDisplay();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        
        // Need to update each display manually
        phoneDisplay.update(temperature, humidity, pressure);
        webDisplay.update(temperature, humidity, pressure);
        desktopDisplay.update(temperature, humidity, pressure);
    }
} 