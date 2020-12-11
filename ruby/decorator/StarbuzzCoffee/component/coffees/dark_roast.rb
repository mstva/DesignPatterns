require './component/beverage'

class DarkRoast < Beverage

  def initialize
    super
    @@description = "DarkRoast"
  end

  def get_description
    super
    @@description
  end

  def cost
    super
    3.22
  end

end