package org.yearup.timer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.yearup.timer.models.Timer;


@SpringBootApplication
public class TimerApplication {

	public static void main(String[] args)throws InterruptedException {
		SpringApplication.run(TimerApplication.class, args);
	}

}