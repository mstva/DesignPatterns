package decorator.condiments;

import component.Beverage;
import decorator.CondimentDecorator;

public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) { this.beverage = beverage; }

    @Override
    public double cost() { return beverage.cost() + 0.20; }

    @Override
    public String getDescription() { return beverage.getDescription() + ", Milk"; }
}
