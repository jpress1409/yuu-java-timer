package org.yearup.timer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yearup.timer.config.ClockConfig;

import java.time.LocalTime;
import java.time.ZoneId;


@RestController
@CrossOrigin
@RequestMapping("/clock")
public class ClockController {

    private ClockConfig clockConfig;

    @Autowired
    public ClockController(ClockConfig clockConfig){
        this.clockConfig = clockConfig;
    }

    @GetMapping
    public void clockDisplay() throws InterruptedException {
        clockConfig.clockLogic();
    }
    @GetMapping(path = "/est")
    public void clockDisplayEst() throws InterruptedException {
        while(true){
            System.out.println(clockConfig.formattedTime(-5));
            Thread.sleep(1000);
        }
    }
    @GetMapping(path = "/cst")
    public void clockDisplayCst() throws InterruptedException {
        LocalTime now = LocalTime.now(ZoneId.of("America/Chicago"));
        while(true){
            System.out.println(clockConfig.formattedTime(-6));
            Thread.sleep(1000);
        }
    }
    @GetMapping(path = "/mst")
    public void clockDisplayMst() throws InterruptedException {
        while(true){
            System.out.println(clockConfig.formattedTime(-7));
            Thread.sleep(1000);
        }
    }
    @GetMapping(path = "/pst")
    public void clockDisplayPst() throws InterruptedException {
        while(true){
            System.out.println(clockConfig.formattedTime(-8));
            Thread.sleep(1000);
        }
    }

}
