require './client/king'
require './client/queen'
require './client/knight'
require './client/troll'
require './behavior/weapon_behavior'

king = King.new
king.fight
king.set_weapon(BowAndArrow.new("New King"))

queen = Queen.new
queen.fight
queen.set_weapon(BowAndArrow.new("New Queen"))

knight = Knight.new
knight.fight
knight.set_weapon(BowAndArrow.new("New Knight"))

troll = Troll.new
troll.fight
troll.set_weapon(BowAndArrow.new("New Troll"))


