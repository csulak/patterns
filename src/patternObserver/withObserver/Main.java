package patternObserver.withObserver;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        
        // Create displays
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        WebDisplay webDisplay = new WebDisplay();
        DesktopDisplay desktopDisplay = new DesktopDisplay();
        
        // Register observers
        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(webDisplay);
        weatherStation.registerObserver(desktopDisplay);
        
        // Simulate weather changes
        System.out.println("\nFirst weather update:");
        weatherStation.setMeasurements(25.5f, 65.0f, 1013.1f);
        weatherStation.notifyObservers();
        
        System.out.println("\nRemoving web display...");
        weatherStation.removeObserver(webDisplay);
        
        System.out.println("\nSecond weather update:");
        weatherStation.setMeasurements(26.8f, 70.0f, 1014.3f);
        weatherStation.notifyObservers();
    }
} 