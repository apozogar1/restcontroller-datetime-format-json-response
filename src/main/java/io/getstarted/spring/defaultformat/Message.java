package io.getstarted.spring.defaultformat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Message {

  private String text;

  private LocalDate date;

  private LocalTime time;

  private LocalDateTime timestamp;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public LocalTime getTime() {
    return time;
  }

  public void setTime(LocalTime time) {
    this.time = time;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }
}
