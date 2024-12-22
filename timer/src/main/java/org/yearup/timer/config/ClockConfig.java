package org.yearup.timer.config;

import org.springframework.stereotype.Component;


import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import static java.text.DateFormat.MEDIUM;

@Component
public class ClockConfig {

    //Formats time to HH:MM:SS
    //Passes a number to add/sub GMT
    public String formattedTime(int num){
        LocalTime time = LocalTime.now(ZoneId.of("GMT+" + num));
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        return time.format(format);
    }

    //Loop that allows clock to run
    public void clockLogic() throws InterruptedException {
        while(true){
            System.out.println(formattedTime(-5));
            Thread.sleep(1000);
            formattedTime(-5);
        }
    }


}
