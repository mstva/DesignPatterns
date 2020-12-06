require './client/mallard_duck'
require './client/redhead_duck'
require './client/rubber_duck'

mallard = MallardDuck.new("MallardDuck")
mallard.display
mallard.swim
mallard.perform_fly
mallard.perform_quack

redhead = RedheadDuck.new("RedheadDuck")
redhead.display
redhead.swim
redhead.perform_fly
redhead.perform_quack

rubber = RubberDuck.new("RubberDuck")
rubber.display
rubber.swim
rubber.perform_fly
rubber.perform_quack

