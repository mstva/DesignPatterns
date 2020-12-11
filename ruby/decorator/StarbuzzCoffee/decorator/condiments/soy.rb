require './decorator/condiment_decorator'

class Soy < CondimentDecorator

  def initialize(beverage)
    @@beverage = beverage
  end

  def get_description
    super
    @@beverage.get_description + ", Soy"
  end

  def cost
    super
    @@beverage.cost + 0.22
  end

  private
  @@beverage = Beverage.new

end