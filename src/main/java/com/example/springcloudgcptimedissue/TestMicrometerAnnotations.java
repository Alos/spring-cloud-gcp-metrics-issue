package com.example.springcloudgcptimedissue;

import io.micrometer.core.annotation.Timed;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TestMicrometerAnnotations {

  @Timed("test-cat-event")
  @Scheduled(
      fixedDelayString = "5",
      timeUnit = TimeUnit.MINUTES)
  public void doTheThing() throws InterruptedException {
    log.info("[doTheThing] Doing the thing...");
    Thread.sleep(7000); // Pause execution
    log.info("[doTheThing] Done!");
  }

}
