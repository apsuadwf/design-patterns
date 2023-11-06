package org.ytmf.behavioral.observer.observer;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:48
 */
public class PhoneApp implements Observer {
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 大气压
     */
    private float pressure;
    /**
     * 被观察者
     */
    private Subject weatherStation;

    public PhoneApp(Subject weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("PhoneApp: Temperature: " + temperature + "°C," +
                "Humidity: " + humidity + "%, Pressure: " + pressure + " hPa");
    }
}
