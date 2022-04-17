package dev.patika.restservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ExceptionHandler;

@SpringBootApplication
@Slf4j
public class RestServiceApplication {

    @ExceptionHandler
    public static void main(String[] args) {
        log.info("Null pointer metotuna girdi");
        SpringApplication.run(RestServiceApplication.class, args);
    }

}
