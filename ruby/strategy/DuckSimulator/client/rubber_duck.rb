require "./client/duck"
require './behavior/fly_behavior'
require './behavior/quack_behavior'

class RubberDuck < Duck

  def initialize(duck_name)
    super(duck_name)
    @fly_behavior = FlyNoWay.new(duck_name)
    @quack_behavior = MuteQuack.new(duck_name)
  end

end