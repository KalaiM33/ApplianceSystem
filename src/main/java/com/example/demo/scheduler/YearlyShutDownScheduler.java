package com.example.demo.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.controller.HomeApplianceController;

@Component
public class YearlyShutDownScheduler {

    private final HomeApplianceController controller;

    public YearlyShutDownScheduler(HomeApplianceController controller) {
        this.controller = controller;
    }

    @Scheduled(cron = "0 0 1 1 1 *")
    public String turnOffAllDevices() {
        controller.turnOffAll();
       return "Scheduled Shutdown: All appliances turned off for the New Year.";
    }
}