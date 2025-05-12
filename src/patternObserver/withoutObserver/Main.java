package patternObserver.withoutObserver;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        
        // Simulate weather changes
        System.out.println("First weather update:");
        weatherStation.setMeasurements(25.5f, 65.0f, 1013.1f);
        
        System.out.println("\nSecond weather update:");
        weatherStation.setMeasurements(26.8f, 70.0f, 1014.3f);
    }
} 