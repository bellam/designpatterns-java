package observer;

public class PhoneDevice implements Observer {

    private WeatherStation mWeatherStation;

    public PhoneDevice(WeatherStation pWeatherStation) {
        this.mWeatherStation = pWeatherStation;
    }

    @Override
    public void update() {
        System.out.println("Phone Device " + this.mWeatherStation.getTemperature());
    }
}
