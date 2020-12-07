require './client/character'
require './behavior/weapon_behavior'

class Queen < Character

  def initialize
    super
    @weapon_behavior = Knife.new("Queen")
  end

end