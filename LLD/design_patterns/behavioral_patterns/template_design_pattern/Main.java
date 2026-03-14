package behavioral_patterns.template_design_pattern;

import behavioral_patterns.template_design_pattern.abstract_class.Beverage;
import behavioral_patterns.template_design_pattern.classes.Coffee;
import behavioral_patterns.template_design_pattern.classes.Tea;

public class Main {

    public static void main(String[] args) {

        Beverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println();

        Beverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
