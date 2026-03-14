package behavioral_patterns.template_design_pattern.classes;

import behavioral_patterns.template_design_pattern.abstract_class.Beverage;

public class Coffee extends Beverage {

    @Override
    protected void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
