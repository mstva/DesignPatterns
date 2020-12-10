from observer.Observer import Observer
from subject.Newsletter import Newsletter


class Subscriber(Observer):

    def __init__(self, newsletter):
        self.__name = ''
        self.__newsletter = Newsletter()
        self.__newsletter = newsletter
        self.__newsletter.register_observer(self)

    def update(self, name):
        self.__name = name
        print("New Subscriber: +" + self.__name + " added to the newsletter")
