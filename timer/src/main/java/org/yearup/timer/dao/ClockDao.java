package org.yearup.timer.dao;

import org.springframework.stereotype.Component;
import org.yearup.timer.models.Clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Component
public class ClockDao {

    private LocalTime time;

    public ClockDao(LocalTime time){
        this.time = time;
    }

    public String clockLogic(LocalTime time){
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        String now = time.format(format);
        return now;
    }


}
