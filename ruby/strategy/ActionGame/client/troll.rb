require './client/character'
require './behavior/weapon_behavior'

class Troll < Character

  def initialize
    super
    @weapon_behavior = Axe.new("Troll")
  end

end