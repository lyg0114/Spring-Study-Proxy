package hello.proxy.config;

import hello.proxy.app.v1.*;
import hello.proxy.app.v2.OrderControllerV2;
import hello.proxy.app.v2.OrderRepositoryV2;
import hello.proxy.app.v2.OrderServiceV2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV2config {

    @Bean
    public OrderControllerV2 orderControllerV2(){
        return new OrderControllerV2(orderServiecV2());

    }

    @Bean
    public OrderServiceV2 orderServiecV2() {
        return new OrderServiceV2(orderRepositroyV2());
    }

    @Bean
    public OrderRepositoryV2 orderRepositroyV2() {
       return new OrderRepositoryV2();
    }

}
