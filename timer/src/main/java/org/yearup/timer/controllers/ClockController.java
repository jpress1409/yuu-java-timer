package org.yearup.timer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.yearup.timer.dao.ClockDao;
import org.springframework.web.bind.annotation.*;
import org.yearup.timer.models.Clock;

import java.time.LocalTime;
import java.time.ZoneId;


@RestController
@CrossOrigin
@RequestMapping("/clock")
public class ClockController {

    private ClockDao clockDao;
    private String est = "America/New York";

    @Autowired
    public ClockController(){
        this.clockDao = clockDao;
    }

    public void clockDisplay() throws InterruptedException {
        LocalTime now = LocalTime.now();

        while(true){
            System.out.println(clockDao.clockLogic(now));
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }
    @GetMapping(path = "/{est}")
    public void clockDisplayEst(@PathVariable String est) throws InterruptedException {
        LocalTime now = LocalTime.now(ZoneId.of(est));

        while(true){
            System.out.println(clockDao.clockLogic(now));
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }
    @GetMapping(path = "/{cst}")
    public void clockDisplayCst(@PathVariable String cst) throws InterruptedException {
        LocalTime now = LocalTime.now(ZoneId.of("America/Chicago"));

        while(true){
            System.out.println(clockDao.clockLogic(now));
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }
    @GetMapping(path = "/{mst}")
    public void clockDisplayMst(@PathVariable String mst) throws InterruptedException {
        LocalTime now = LocalTime.now(ZoneId.of("America/Denver"));

        while(true){
            System.out.println(clockDao.clockLogic(now));
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }
    @GetMapping(path = "/{pst}")
    public void clockDisplayPst(@PathVariable String pst) throws InterruptedException {
        LocalTime now = LocalTime.now(ZoneId.of("America/Los Angeles"));

        while(true){
            System.out.println(clockDao.clockLogic(now));
            Thread.sleep(1000);
            now = LocalTime.now();
        }
    }

}
