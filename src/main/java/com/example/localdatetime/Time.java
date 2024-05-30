package com.example.localdatetime;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class Time {


  @JsonFormat(pattern = "yyyy:MM:dd HH:mm:ss:SSS")
  private LocalDateTime localDateTime;


  public Time() {
    this.localDateTime = LocalDateTime.now();
  }

  public LocalDateTime getLocalDateTime() {
    return localDateTime;
  }

}
