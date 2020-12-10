package decorator;

import component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
