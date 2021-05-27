package com.tockdata.das.monitoradmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class MonitoradminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitoradminApplication.class, args);
    }

}
