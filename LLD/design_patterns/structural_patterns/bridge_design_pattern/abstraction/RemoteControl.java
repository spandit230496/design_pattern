package LLD.design_patterns.structural_patterns.bridge_design_pattern.abstraction;

import LLD.design_patterns.structural_patterns.bridge_design_pattern.implementor.Device;

public class RemoteControl {

    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void powerOn() {
        device.turnOn();
    }

    public void powerOff() {
        device.turnOff();
    }
}