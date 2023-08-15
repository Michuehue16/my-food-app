package pl.zajavka.myfoodapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMyFoodAppApplication {

    public static void main(String[] args) {
        SpringApplication.from(MyFoodAppApplication::main).with(TestMyFoodAppApplication.class).run(args);
    }

}
