package com.mika.principle;

import com.mika.principle.beanlife.BeanLifeComponent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringPrincipleApplicationTests {

    @Autowired
    private BeanLifeComponent beanLifeComponent;

    @Test
    void contextLoads() {
        beanLifeComponent.use();
    }

}
