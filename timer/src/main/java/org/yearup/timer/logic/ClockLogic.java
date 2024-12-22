package org.yearup.timer.logic;

import org.springframework.stereotype.Component;
import org.yearup.timer.config.DataSourceConfig;


import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Component
public class ClockLogic {

    private DataSourceConfig dataSource;

    public ClockLogic(DataSourceConfig dataSource){
        this.dataSource = dataSource;
    }

    //Formats time to HH:MM:SS
    //Passes a number to add/sub GMT
    public String formattedTimeMinus(int num){
        LocalTime time = LocalTime.now(ZoneId.of("GMT-" + num));
        DateTimeFormatter format = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        return time.format(format);
    }

    //Loop that allows clock to run
    public void clockLogicEst() throws InterruptedException {
        while(true){
            System.out.println(formattedTimeMinus(5));
            Thread.sleep(1000);
            formattedTimeMinus(5);
            System.out.flush();
        }
    }
    public void clockLogicCst() throws InterruptedException {
        while(true){
            System.out.println(formattedTimeMinus(6));
            Thread.sleep(1000);
        }
    }
    public void clockLogicMst() throws InterruptedException {
        while(true){
            System.out.println(formattedTimeMinus(7));
            Thread.sleep(1000);
        }
    }
    public void clockLogicPst() throws InterruptedException {
        while(true){
            System.out.println(formattedTimeMinus(8));
            Thread.sleep(1000);
        }
    }


}
