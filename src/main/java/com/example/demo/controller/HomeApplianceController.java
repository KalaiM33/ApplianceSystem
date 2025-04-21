package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import com.example.demo.model.AirConditioner;
import com.example.demo.model.Fan;
import com.example.demo.model.Light;

import java.util.Objects;

@Controller("/appliance")
public class HomeApplianceController {
    private Light light = new Light();
    private Fan fan = new Fan();
    private AirConditioner ac = new AirConditioner();

    @RequestMapping(path = "/light", method = RequestMethod.POST)
    public String toggleLight() {
        light.toggle();
       // return "Light is " + (light.isOn() ? "ON" : "OFF");
       // return "redirect:/light.html";
      //  if (light.isOn()){model.addAttribute("message","Light is ON");}
//        if (light.isOn()){
//            return "redirect:/light.html";
//        }
        return  (light.isOn() ? "redirect:/light.html" : "redirect:/lightOFF.html");
    }

    @RequestMapping(path = "/fan", method = RequestMethod.POST)
    public String setFanSpeed(@RequestParam int speed) {
        fan.setSpeed(speed);
      if (fan.getSpeed()==0)
      {
          return "redirect:/fanOFF.html";
      }
        return "redirect:/fan.html";
    }

    @PostMapping("/ac")
    public String setACMode(@RequestParam String mode) {
        ac.setMode(mode);
        if (Objects.equals(ac.getMode(), "OFF"))
        {
            return "redirect:/ACOFF.html";
        }
        return "redirect:/AC.html";
    }

    @PostMapping("/shutdown")
    public String turnOffAll() {
        light.turnOff();
        fan.setSpeed(0);
        ac.setMode("OFF");
        return "redirect:/ShutDown.html";
    }

    @GetMapping("/statuss")
    public String getStatus() {
        return "Light: " + (light.isOn() ? "ON" : "OFF") +
               ", Fan Speed: " + fan.getSpeed() +
               ", AC Mode: " + ac.getMode();
    }

    @GetMapping("/status")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "redirect:/greeting.html";
    }


}