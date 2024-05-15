package org.example.auntifucationspring;

import org.example.auntifucationspring.JWToken.JwtCore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class AuntifucationSpringApplication {

    private JwtCore jwtCore;

    private void setJwtCore(JwtCore jwtCore) {
        this.jwtCore = jwtCore;
    }


    public static void main(String[] args) {
        SpringApplication.run(AuntifucationSpringApplication.class, args);
    }

}
