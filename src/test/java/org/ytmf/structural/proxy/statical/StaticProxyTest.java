package org.ytmf.structural.proxy.statical;

import org.junit.jupiter.api.Test;

/**
 * @author XieRongji
 * @date 2023/10/19 15:47
 **/

public class StaticProxyTest {
    @Test
    public void test() {
        DataBaseDataQueryProxy dataQueryProxy = new DataBaseDataQueryProxy();

        String value = dataQueryProxy.query("key1");
        System.out.println(value);

        value = dataQueryProxy.query("key1");
        System.out.println(value);

        value = dataQueryProxy.query("key2");
        System.out.println(value);
    }
}
