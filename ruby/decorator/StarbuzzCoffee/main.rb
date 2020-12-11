require './decorator/condiments/mocha.rb'
require './decorator/condiments/milk.rb'
require './decorator/condiments/soy.rb'
require './decorator/condiments/whip.rb'
require './component/coffees/espresso.rb'
require './component/coffees/house_blend.rb'
require './component/coffees/dark_roast.rb'

espresso = Whip.new(Mocha.new(Soy.new(Milk.new(Espresso.new))))
puts("\nDescription: " + espresso.get_description)
puts("Cost: $" + espresso.cost.to_s)

house_blend = Milk.new(Soy.new(Whip.new(Mocha.new(HouseBlend.new))))
puts("\nDescription: " + house_blend.get_description)
puts("Cost: $" + house_blend.cost.to_s)

dark_roast = Mocha.new(Whip.new(Milk.new(Soy.new(DarkRoast.new))))
puts("\nDescription: " + dark_roast.get_description)
puts("Cost: $" + dark_roast.cost.to_s)