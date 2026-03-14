package behavioral_patterns.template_design_pattern.classes;

import behavioral_patterns.template_design_pattern.abstract_class.Beverage;

public class Tea extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
