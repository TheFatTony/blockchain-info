package com.chieftain.blockchaininfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration()
public class BlockchainInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockchainInfoApplication.class, args);
    }

}
