package hello.proxy.config;

import hello.proxy.app.v1.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppV1config {

    @Bean
    public OrderControllerV1 orderControllerV1(){
        return new OrderControllerV1Impl(orderServiecV1());

    }

    @Bean
    public OrderServiceV1 orderServiecV1() {
        return new OrderServiceV1Impl(orderRepositroyV1());

    }

    @Bean
    public OrderRepositroyV1 orderRepositroyV1() {
       return new OrderRepositoryV1Impl();
    }

}
