package LLD.design_patterns.structural_patterns.bridge_design_pattern.refined_abstraction;

import LLD.design_patterns.structural_patterns.bridge_design_pattern.abstraction.RemoteControl;
import LLD.design_patterns.structural_patterns.bridge_design_pattern.implementor.*;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Device muted");
    }
}