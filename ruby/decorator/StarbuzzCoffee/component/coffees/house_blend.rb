require './component/beverage'

class HouseBlend < Beverage

  def initialize
    super
    @@description = "HouseBlend"
  end

  def get_description
    super
    @@description
  end

  def cost
    super
    2.55
  end

end