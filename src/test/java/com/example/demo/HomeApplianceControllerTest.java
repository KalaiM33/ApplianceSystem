package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.controller.HomeApplianceController;

public class HomeApplianceControllerTest {
    private HomeApplianceController controller;

    @BeforeEach
    public void setup() {
        controller = new HomeApplianceController();
    }

    @Test
    public void testToggleLight() {
        assertTrue(controller.toggleLight().contains("ON") || controller.toggleLight().contains("OFF"));
    }

    @Test
    public void testFanSpeed() {
        assertEquals("redirect:/fan.html", controller.setFanSpeed(2));
        assertEquals("redirect:/fanOFF.html", controller.setFanSpeed(0));
    }

    @Test
    public void testACMode() {
        assertEquals("redirect:/AC.html", controller.setACMode("COOL"));
        assertEquals("redirect:/ACOFF.html", controller.setACMode("OFF"));
    }

    @Test
    public void testTurnOffAll() {
        controller.toggleLight();
        controller.setFanSpeed(2);
        controller.setACMode("HEAT");
       // assertEquals("All appliances turned OFF.", controller.turnOffAll());
        assertEquals("redirect:/ShutDown.html", controller.turnOffAll());
    }
}