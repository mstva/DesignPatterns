require './decorator/condiment_decorator'

class Mocha < CondimentDecorator

  def initialize(beverage)
    @@beverage = beverage
  end

  def get_description
    super
    @@beverage.get_description + ", Mocha"
  end

  def cost
    super
    @@beverage.cost + 0.99
  end

  private
  @@beverage = Beverage.new

end