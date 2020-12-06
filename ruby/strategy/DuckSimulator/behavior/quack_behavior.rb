class QuackBehavior
  def quack
  end
end

class Quack < QuackBehavior

  def initialize(duck_name)
    @duck_name = duck_name
  end

  def quack
    puts(@duck_name + " is quacking")
  end

end

class Squeak < QuackBehavior

  def initialize(duck_name)
    @duck_name = duck_name
  end

  def quack
    puts(@duck_name + " is squeaking")
  end

end

class MuteQuack < QuackBehavior

  def initialize(duck_name)
    @duck_name = duck_name
  end

  def quack
    puts(@duck_name + " is not quacking")
  end

end