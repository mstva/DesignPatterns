class FlyBehavior
  def fly
  end
end

class FlyWithWings < FlyBehavior

  def initialize(duck_name)
    @duck_name = duck_name
  end

  def fly
    super
    puts(@duck_name + " is flying with wings")
  end

end

class FlyNoWay < FlyBehavior

  def initialize(duck_name)
    @duck_name = duck_name
  end

  def fly
    super
    puts(@duck_name + " is not flying")
  end

end