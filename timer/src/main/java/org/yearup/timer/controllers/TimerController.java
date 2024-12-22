package org.yearup.timer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yearup.timer.logic.TimerLogic;
import org.yearup.timer.models.Timer;

@RestController
@CrossOrigin
@RequestMapping("/timer")
public class TimerController {

    private TimerLogic logic;

    @Autowired
    public TimerController(TimerLogic logic){
        this.logic = logic;
    }

    @GetMapping(path = "{sec}")
    public String timerDisplay(@PathVariable int sec) throws InterruptedException {
         return logic.countDown(logic.timeInst(sec));
    }

}
