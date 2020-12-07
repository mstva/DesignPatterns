class WeaponBehavior
  def use_weapon
  end
end

class Axe < WeaponBehavior

  def initialize(character_name)
    @character_name = character_name
  end

  def use_weapon
    super
    puts("the " + @character_name + " is fighting with Axe")
  end

  private
  @character_name = nil

end

class Sword < WeaponBehavior

  def initialize(character_name)
    @character_name = character_name
  end

  def use_weapon
    super
    puts("the " + @character_name + " is fighting with Sword")
  end

  private
  @character_name = nil

end

class BowAndArrow < WeaponBehavior

  def initialize(character_name)
    @character_name = character_name
  end

  def use_weapon
    super
    puts("the " + @character_name + " is fighting with BowAndArrow")
  end

  private
  @character_name = nil

end

class Knife < WeaponBehavior

  def initialize(character_name)
    @character_name = character_name
  end

  def use_weapon
    super
    puts("the " + @character_name + " is fighting with Knife")
  end

  private
  @character_name = nil

end