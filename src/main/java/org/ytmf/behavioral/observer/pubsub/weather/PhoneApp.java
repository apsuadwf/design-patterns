package org.ytmf.behavioral.observer.pubsub.weather;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:48
 */
public class PhoneApp implements Subscriber {
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

    @Override
    public void onEventUpdate(Event event) {
        this.temperature = event.getTemperature();
        this.humidity = event.getHumidity();
        this.pressure = event.getPressure();
        display();
    }

    public void display() {
        System.out.println("PhoneApp: Temperature: " + temperature + "°C," +
                "Humidity: " + humidity + "%, Pressure: " + pressure + " hPa");
    }
}
