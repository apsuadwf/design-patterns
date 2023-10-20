package org.ytmf.structural.bridge.abstractor;

/**
 * @author XieRongji
 * @date 2023/10/20 22:03
 **/

public class OracleDriver implements Driver {
    @Override
    public Connection connect() {
        return new Connection("Oracle");
    }
}
