from Duck import Duck
from MollardDuck import MollardDuck
from RedheadDuck import RedheadDuck

if __name__ == '__main__':
    duck = Duck("duck")
    mollard = MollardDuck("Mollard Duck")
    redhead = RedheadDuck("Redhead Duck")
    print(f'{duck.display()}, {duck.swim()}, {duck.quack()}')
    print(f'{mollard.display()}, {mollard.swim()}, {mollard.quack()}')
    print(f'{redhead.display()}, {redhead.swim()}, {redhead.quack()}')
