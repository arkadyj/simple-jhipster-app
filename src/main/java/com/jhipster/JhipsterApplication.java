package com.jhipster;

import com.jhipster.domain.Task;
import com.jhipster.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class JhipsterApplication {
    private final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        SpringApplication.run(JhipsterApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(TaskService taskService) {
        return args -> {
            taskService.save(new Task(1L,"Create Spring Boot Application", LocalDate.now().format(dateFormat), true));
            taskService.save(new Task(2L,"Create Spring Project Packages", LocalDate.now().format(dateFormat), false));
            taskService.save(new Task(3L,"Create the Task Domain Class", LocalDate.now().format(dateFormat), false));
        };
    }
}
