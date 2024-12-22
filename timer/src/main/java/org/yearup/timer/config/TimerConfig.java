package org.yearup.timer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class TimerConfig {

    private LocalTime time;

    @Bean
    public LocalTime time() {
        return LocalTime.now();
    }

}
