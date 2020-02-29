package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private int mTemperature;

    List<Observer> devices;

    public void add(Observer pObserver) {
        if(this.devices == null) {
            this.devices = new ArrayList<>();
        }
        this.devices.add(pObserver);
    }

    public void remove(Observer pObserver) {
        if(this.devices == null) {
            return;
        }
        this.devices.remove(pObserver);
    }

    public void notifyObservers() {
        if(devices != null) {
            this.devices.forEach((device) -> {
                device.update();
            });
        }
    }

    public int getTemperature() {
        return this.mTemperature;
    }

    public void setTemperature(int pTemperature) {
        this.mTemperature = pTemperature;
        notifyObservers();
    }
}
