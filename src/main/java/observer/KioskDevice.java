package observer;

public class KioskDevice implements Observer {

    private WeatherStation mWeatherStation;

    public KioskDevice(WeatherStation pWeatherStation) {
        this.mWeatherStation = pWeatherStation;
    }

    @Override
    public void update() {
        System.out.println("KioskDevice " + this.mWeatherStation.getTemperature());
    }
}
