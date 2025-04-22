package com.example.demo.model;

public class Light {
    private boolean on = false;
    public void toggle() { on = !on;}
    public void turnOff() { on = false; }
    public boolean isOn() { return on; }
    public String message ="Light is OFF";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
