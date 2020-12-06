require "./client/duck"
require './behavior/fly_behavior'
require './behavior/quack_behavior'

class MallardDuck < Duck

  def initialize(duck_name)
    super(duck_name)
    @fly_behavior = FlyWithWings.new(duck_name)
    @quack_behavior = Quack.new(duck_name)
  end

end