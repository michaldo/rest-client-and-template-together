package com.example.restclientjson;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.MockRestServiceServer;
import org.springframework.web.client.RestClient;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.requestTo;
import static org.springframework.test.web.client.response.MockRestResponseCreators.withSuccess;

@RestClientTest
class RestClientAndTemplateTogetherTest {


    /*
    Test pass when

    @Bean RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    is commented out
     */
    @Test
    void test(@Autowired RestClient restClient, @Autowired MockRestServiceServer server) {

        // given
        server.expect(requestTo("/")).andRespond(withSuccess());

        // when then
        restClient.get()
                .uri("/")
                .retrieve();
    }

}