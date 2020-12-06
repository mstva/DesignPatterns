require './behavior/fly_behavior'
require './behavior/quack_behavior'

class Duck

  def initialize(duck_name)
    @duck_name = duck_name
    @fly_behavior = FlyBehavior.new
    @quack_behavior = QuackBehavior.new
  end

  def display
    puts("I am a " + @duck_name)
  end
  
  def swim
    puts(@duck_name + " is swimming")
  end
  
  def perform_fly
    @fly_behavior.fly
  end

  def perform_quack
    @quack_behavior.quack
  end

end