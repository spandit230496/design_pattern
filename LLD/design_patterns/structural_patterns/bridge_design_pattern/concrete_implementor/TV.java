package LLD.design_patterns.structural_patterns.bridge_design_pattern.concrete_implementor;

import LLD.design_patterns.structural_patterns.bridge_design_pattern.implementor.Device;

public class TV implements Device {

    @Override
    public void turnOn() {
        System.out.println("TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is OFF");
    }
}