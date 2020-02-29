package observer.caller;

import observer.KioskDevice;
import observer.PhoneDevice;
import observer.WeatherStation;

import java.util.Random;

public class ObserverPatternExecutor {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        PhoneDevice iphone = new PhoneDevice(weatherStation);
        PhoneDevice android = new PhoneDevice(weatherStation);
        KioskDevice manhattanMall = new KioskDevice(weatherStation);

        weatherStation.add(iphone);
        weatherStation.add(android);
        weatherStation.add(manhattanMall);

        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                Random r = new Random();

                weatherStation.setTemperature(r.nextInt((100 - (-20)) + 1) + -20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
