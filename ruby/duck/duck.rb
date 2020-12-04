class Duck

  def initialize(name)
    @name = name
  end

  def quack
    puts(@name + " is quacking")
  end

  def swim
    puts(@name + " is swimming")
  end

  def display
    puts("I am a " + @name)
  end

end