package LLD.design_patterns.structural_patterns.bridge_design_pattern;

import LLD.design_patterns.structural_patterns.bridge_design_pattern.abstraction.RemoteControl;
import LLD.design_patterns.structural_patterns.bridge_design_pattern.refined_abstraction.AdvancedRemote;
import LLD.design_patterns.structural_patterns.bridge_design_pattern.concrete_implementor.TV;
import LLD.design_patterns.structural_patterns.bridge_design_pattern.concrete_implementor.Radio;
import LLD.design_patterns.structural_patterns.bridge_design_pattern.implementor.*;

public class Main {

    public static void main(String[] args) {

        Device tv = new TV();
        RemoteControl remote = new RemoteControl(tv);

        remote.powerOn();
        remote.powerOff();

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);

        advancedRemote.mute();
    }
}