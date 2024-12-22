package org.yearup.timer.config;

import org.springframework.stereotype.Component;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.text.DateFormat.MEDIUM;

@Component
public class ClockConfig {

    public String formattedTime(){
        LocalTime time = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        return time.format(format);
    }

    //Formats time to HH:MM:SS
    public void clockLogic() throws InterruptedException {
        while(true){
            System.out.println(formattedTime());
            Thread.sleep(1000);
            formattedTime();
        }
    }


}
