package com.example.demo;

import com.example.demo.controller.HomeApplianceController;
import com.example.demo.scheduler.YearlyShutDownScheduler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

//import static org.mockito.Mockito.*;

class YearlyShutDownSchedulerTest {

    private HomeApplianceController controller;
    private YearlyShutDownScheduler scheduler;

    @BeforeEach
    void setUp() {
        controller = controller = new HomeApplianceController();
        scheduler = new YearlyShutDownScheduler(controller);
    }

    @Test
    void testTurnOffAllDevices() {
        assertEquals("Scheduled Shutdown: All appliances turned off for the New Year.",scheduler.turnOffAllDevices());
    }
}