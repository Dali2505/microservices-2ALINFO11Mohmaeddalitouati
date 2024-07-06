package com.store.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class OrderConfig {
    @Bean
    @LoadBalanced
    public WebClient.Builder orderWebClient() {
        return WebClient.builder();
    }
}
