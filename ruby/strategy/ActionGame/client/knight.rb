require './client/character'
require './behavior/weapon_behavior'

class Knight < Character

  def initialize
    super
    @weapon_behavior = BowAndArrow.new("Knight")
  end

end