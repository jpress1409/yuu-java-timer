package org.yearup.timer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yearup.timer.models.Clock;
import org.yearup.timer.config.ClockConfig;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.TimeZone;

@SpringBootApplication
public class TimerApplication {

	private static ClockConfig cc;

	public static void main(String[] args)throws InterruptedException {

	}
	//Experimenting with timer logic
	public static void runTimer() throws InterruptedException {
		Clock clock = new Clock(3600);
		int i = clock.getSec(), j = 61, k = 61;



		while (i != 0 && j != 0 && k != 0) {
			if(i >= 60){
				j = i % 60;
			}
			if(j >= 60){
				k = j % 60;
			}
			System.out.println("Time remaining: " + k + ":" + j + ":" + i);
            clock.setRemainingSec(i--);
			Thread.sleep(1000);
		}
	}

}