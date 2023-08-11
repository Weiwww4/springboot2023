package com.example.lesson07_config.bean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppBeanTest {
    @Autowired
    AppBean appBean;

    @Test
    public void test01(){
        System.out.println(appBean);
        // com.example.lesson07_config.bean.AppBean@4debbf0
        // com.example.lesson07_config.bean.AppBean$$SpringCGLIB$$0@66a5755

        appBean.print();
    }
}