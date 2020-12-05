package com.ventas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VentasApplication {

    private static final Logger logger = LoggerFactory.getLogger(VentasApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(VentasApplication.class, args);

    }

}
