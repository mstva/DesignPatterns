package decorator.condiments;

import component.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) { this.beverage = beverage; }

    @Override
    public double cost() { return beverage.cost() + 0.10; }

    @Override
    public String getDescription() { return beverage.getDescription() + ", Whip"; }
}
