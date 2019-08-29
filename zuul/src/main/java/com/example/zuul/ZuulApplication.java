package com.example.zuul;

import com.example.zuul.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApplication {
    //追加bean的是实现
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }

}
