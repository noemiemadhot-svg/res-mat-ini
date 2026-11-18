package sio.spring.resmat;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initData() {
        return args -> {
            System.out.println("=== GENERATION DES DONNEES DE TEST ===");

            // Les insertions seront ajoutées ici.

            System.out.println("=== GENERATION TERMINEE ===");
        };
    }
