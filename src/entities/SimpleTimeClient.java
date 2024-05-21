package entities;

import java.time.LocalDateTime;

public class SimpleTimeClient implements TimeClient{
	
	
	private LocalDateTime dateAndTime;
	
	public SimpleTimeClient() {
		this.dateAndTime = LocalDateTime.now();
	}

	public LocalDateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(LocalDateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	@Override
	public void setTime(int hour, int minute, int second) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDate(int day, int month, int year) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDateAndTime(int day, int month, int year, int hour, int minute, int second) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LocalDateTime getLocalDateTime() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return dateAndTime.toString();
	}

	
	

}
