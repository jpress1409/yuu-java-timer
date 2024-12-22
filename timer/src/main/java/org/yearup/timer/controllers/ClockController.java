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
    @GetMapping(path = "/{est}")
    public void clockDisplayEst(@PathVariable String est) throws InterruptedException {
        LocalTime now = LocalTime.now(ZoneId.of("America/New York"));

        while(true){
            System.out.println();
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }
    @GetMapping(path = "/{cst}")
    public void clockDisplayCst(@PathVariable String cst) throws InterruptedException {
        LocalTime now = LocalTime.now(ZoneId.of("America/Chicago"));

        while(true){
            System.out.println();
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }
    @GetMapping(path = "/{mst}")
    public void clockDisplayMst(@PathVariable String mst) throws InterruptedException {
        LocalTime now = LocalTime.now(ZoneId.of("America/Denver"));

        while(true){
            System.out.println();
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }
    @GetMapping(path = "/{pst}")
    public void clockDisplayPst(@PathVariable String pst) throws InterruptedException {
        LocalTime now = LocalTime.now(ZoneId.of("America/Los Angeles"));

        while(true){
            System.out.println();
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }

}
