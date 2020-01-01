package com.hero.ms.system.web;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class MsSystemWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsSystemWebApplication.class, args);
        log.info("已启动");
    }

}
