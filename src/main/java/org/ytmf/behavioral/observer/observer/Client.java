package org.ytmf.behavioral.observer.observer;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 16:52
 */
public class Client {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        PhoneApp phoneApp = new PhoneApp(weatherStation);
        // 模拟气象站数据更新
        weatherStation.setMeasurements(25, 65, 1010);
        weatherStation.setMeasurements(22, 58, 1005);
        // 添加更多观察者 网站上显示-电子大屏
        WebsiteDisplay websiteDisplay = new WebsiteDisplay(weatherStation);
        ElectronicScreen electronicScreen = new ElectronicScreen(weatherStation);
        // 再次模拟气象站数据更新
        weatherStation.setMeasurements(18, 52, 1008);

    }
}
