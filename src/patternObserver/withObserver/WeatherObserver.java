package patternObserver.withObserver;

public interface WeatherObserver {
    void update(float temperature, float humidity, float pressure);
} 