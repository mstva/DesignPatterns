from client.MallardDuck import MallardDuck
from client.RedheadDuck import RedheadDuck
from client.RubberDuck import RubberDuck

if __name__ == '__main__':

    mallard = MallardDuck("MallardDuck")
    mallard.display()
    mallard.swim()
    mallard.perform_fly()

    redhead = RedheadDuck("RedheadDuck")
    redhead.display()
    redhead.swim()
    redhead.perform_fly()

    rubber = RubberDuck("RubberDuck")
    rubber.display()
    rubber.swim()
    rubber.perform_fly()
    rubber.perform_quack()
