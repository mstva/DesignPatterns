require './behavior/weapon_behavior'

class Character

  def initialize
    @weapon_behavior = WeaponBehavior.new
  end

  def fight
    @weapon_behavior.use_weapon
  end

  def set_weapon(wb)
    @weapon_behavior = wb
    fight
  end

end