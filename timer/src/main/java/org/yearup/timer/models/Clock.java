package org.yearup.timer.models;

import static java.lang.Integer.parseInt;

public class Clock {
    private int hours;
    private int min;
    private int sec;
    private int miliSec;
    private int remainingSec;

    public Clock(int sec) {
        this.sec = sec;
    }

    public int getHours() {
        hours = getSec() / 3600;
        if(hours < 1){
            return 0;
        }
        return hours;
    }

    public int getMin() {

        return (getSec() % 3600) / 60;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    public int getRemainingSec(){
        return getSec() % 60;
    }

    public void setRemainingSec(int remainingSec) {
        this.remainingSec = remainingSec;
    }

    public int getMiliSec() {
        return miliSec;
    }
    public String formatTimer() {
        return String.format("%02d:%02d:%02d", getHours(), getMin(), getRemainingSec());
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hours=" + hours +
                ", min=" + min +
                ", sec=" + sec +
                ", miliSec=" + miliSec +
                '}';
    }
}
