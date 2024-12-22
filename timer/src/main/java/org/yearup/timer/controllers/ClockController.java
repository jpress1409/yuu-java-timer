package org.yearup.timer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yearup.timer.logic.ClockLogic;

import java.time.LocalTime;
import java.time.ZoneId;


@RestController
@CrossOrigin
@RequestMapping("/clock")
public class ClockController {

    private ClockLogic logic;

    @Autowired
    public ClockController(ClockLogic logic){
        this.logic = logic;
    }

    @GetMapping(path = "/est")
    public void clockDisplayEst() throws InterruptedException {
        logic.clockLogicEst();
    }
    @GetMapping(path = "/cst")
    public void clockDisplayCst() throws InterruptedException {
        logic.clockLogicCst();
    }
    @GetMapping(path = "/mst")
    public void clockDisplayMst() throws InterruptedException {
        logic.clockLogicMst();
    }
    @GetMapping(path = "/pst")
    public void clockDisplayPst() throws InterruptedException {
        logic.clockLogicPst();
    }
}
