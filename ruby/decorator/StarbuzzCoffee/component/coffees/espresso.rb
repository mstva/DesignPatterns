require './component/beverage'

class Espresso < Beverage

  def initialize
    super
    @@description = "Espresso"
  end

  def get_description
    super
    @@description
  end

  def cost
    super
    1.99
  end

end