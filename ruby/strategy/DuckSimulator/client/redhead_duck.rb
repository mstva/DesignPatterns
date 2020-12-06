require "./client/duck"
require './behavior/fly_behavior'
require './behavior/quack_behavior'

class RedheadDuck < Duck

  def initialize(duck_name)
    super(duck_name)
    @fly_behavior = FlyWithWings.new(duck_name)
    @quack_behavior = Squeak.new(duck_name)
  end

end