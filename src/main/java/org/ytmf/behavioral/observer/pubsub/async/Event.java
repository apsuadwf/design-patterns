package org.ytmf.behavioral.observer.pubsub.async;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: apsuadwf
 * @Date: 2023/11/06 18:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
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
}
