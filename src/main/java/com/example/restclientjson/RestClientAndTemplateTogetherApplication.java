package com.example.restclientjson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientAndTemplateTogetherApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestClientAndTemplateTogetherApplication.class, args);
    }

    @Bean RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean RestClient restClient(RestClient.Builder builder) {
        return builder.build();
    }
}
