require './decorator/condiment_decorator'

class Milk < CondimentDecorator

  def initialize(beverage)
    @@beverage = beverage
  end

  def get_description
    super
    @@beverage.get_description + ", Milk"
  end

  def cost
    super
    @@beverage.cost + 0.89
  end

  private
  @@beverage = Beverage.new

end