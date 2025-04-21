package com.example.demo.model;

public class AirConditioner {
    private String mode = "OFF";
    public void setMode(String mode) {
        if (mode.equals("OFF") || mode.equals("COOL") || mode.equals("HEAT")) {
            this.mode = mode;
        }
    }
    public String getMode() { return mode; }
}
