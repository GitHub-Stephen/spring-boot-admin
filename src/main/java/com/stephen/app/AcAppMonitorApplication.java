package com.stephen.app;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class AcAppMonitorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AcAppMonitorApplication.class, args);
    }
}
