package org.ytmf.behavioral.observer.pubsub.async;


/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:48
 */
public class WebsiteDisplay implements Subscriber {
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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.temperature = event.getTemperature();
        this.humidity = event.getHumidity();
        this.pressure = event.getPressure();
        display();
    }

    public void display() {
        System.out.println("WebsiteDisplay: Temperature: " + temperature + "°C," +
                "Humidity: " + humidity + "%, Pressure: " + pressure + " hPa");
    }
}
