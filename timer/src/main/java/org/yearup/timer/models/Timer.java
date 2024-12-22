package org.yearup.timer.models;

public class Timer {
    private int hours;
    private int min;
    private int sec;
    private int miliSec;
    private int remainingSec;

    public Timer(int sec) {
        this.sec = sec;
    }

    public int getHours() {
        return getSec() / 3600;
    }

    public int getMin() {
        return  (getSec() % 3600) / 60;
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
        return getSec() * 1000;
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
