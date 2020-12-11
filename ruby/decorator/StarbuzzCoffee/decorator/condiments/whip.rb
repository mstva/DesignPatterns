require './decorator/condiment_decorator'

class Whip < CondimentDecorator

  def initialize(beverage)
    @@beverage = beverage
  end

  def get_description
    super
    @@beverage.get_description + ", Whip"
  end

  def cost
    super
    @@beverage.cost + 0.10
  end

  private
  @@beverage = Beverage.new

end