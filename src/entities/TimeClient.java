package entities;

import java.time.LocalDateTime;

public interface TimeClient {
	void setTime(int hour, int minute, int second);
	void setDate(int day, int month, int year);
	void setDateAndTime(int day, int month, int year, int hour, int minute, int second);
	LocalDateTime getLocalDateTime();
	
	
}
