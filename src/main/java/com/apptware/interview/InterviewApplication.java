package com.apptware.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
class InterviewApplication {
  public static void main(String[] args) {
    SpringApplication.run(InterviewApplication.class, args);
  }

  @Bean
  public String someString() {
    return "default";
  }
}
