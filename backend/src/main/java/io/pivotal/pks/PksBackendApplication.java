package io.pivotal.pks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(PodInformation.class)
public class PksBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PksBackendApplication.class, args);
    }

}
