package com.example.demo.model;

public class Fan {
    private int speed = 0;
    public void setSpeed(int speed) { if (speed >= 0 && speed <= 2) this.speed = speed; }
    public int getSpeed() { return speed; }
}
