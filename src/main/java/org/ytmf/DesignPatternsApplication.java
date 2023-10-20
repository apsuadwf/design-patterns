package org.ytmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author XieRongji
 * @date 2023/10/20 16:51
 **/
@SpringBootApplication
@EnableAspectJAutoProxy
public class DesignPatternsApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class,args);
    }
}
