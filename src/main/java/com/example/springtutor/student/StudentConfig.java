package com.example.springtutor.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student david = new Student(
                        "David",
                        "david@gmail.com",
                        LocalDate.of(2002, 3, 23)
            );

            Student lois = new Student(
                        "Lois",
                        "lois@gmail.com",
                        LocalDate.of(2000, 5, 23)
            );
            studentRepository.saveAll(
                    List.of(david, lois)
            );
        };
    }
}
