package decorator.condiments;

import component.Beverage;
import decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) { this.beverage = beverage; }

    @Override
    public double cost() { return beverage.cost() + 0.15; }

    @Override
    public String getDescription() { return beverage.getDescription() + ", Soy"; }
}
