require './client/character'
require './behavior/weapon_behavior'

class King < Character

  def initialize
    super
    @weapon_behavior = Sword.new("King")
  end

end