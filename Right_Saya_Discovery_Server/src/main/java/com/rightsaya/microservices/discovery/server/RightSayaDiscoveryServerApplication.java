package com.rightsaya.microservices.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.config.GatewayAutoConfiguration;
import org.springframework.cloud.gateway.config.GatewayMetricsAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(exclude = {GatewayAutoConfiguration.class, GatewayMetricsAutoConfiguration.class})
public class RightSayaDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RightSayaDiscoveryServerApplication.class, args);
    }

}
