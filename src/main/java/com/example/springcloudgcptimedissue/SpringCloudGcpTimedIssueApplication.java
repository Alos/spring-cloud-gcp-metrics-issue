package com.example.springcloudgcptimedissue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCloudGcpTimedIssueApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudGcpTimedIssueApplication.class, args);
  }

}
