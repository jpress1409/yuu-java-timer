package org.yearup.timer.logic;

import org.springframework.stereotype.Component;
import org.yearup.timer.config.DataSourceConfig;
import org.yearup.timer.models.Timer;

@Component
public class TimerLogic {

    private DataSourceConfig dataSource;

    public TimerLogic(DataSourceConfig dataSource){
        this.dataSource = dataSource;
    }
    public Timer timeInst(int sec){
        return new Timer(sec);
    }
    public String countDown(Timer timer) throws InterruptedException {
        int remainingTime = timer.getSec();
        while(remainingTime > 0){
            timer.setSec(remainingTime--);
            Thread.sleep(1000);
            return timer.getHours() + ":" + timer.getMin() + ":" + timer.getRemainingSec();

        }
        return "Time's Up!";
    }
}
