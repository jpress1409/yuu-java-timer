package org.yearup.timer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.yearup.timer.controllers.ClockController;
import org.yearup.timer.dao.ClockDao;
import org.yearup.timer.models.Clock;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

@SpringBootApplication
public class TimerApplication {



	public static void main(String[] args)throws InterruptedException {

		run();

	}
	public static void run() throws InterruptedException {
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