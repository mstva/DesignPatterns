from observer.Observer import Observer
from subject.Subject import Subject

class Newsletter(Subject):

    def __init__(self):
        self.__observers = []
        self.__name = ''
        self.__observer = Observer()

    def register_observer(self, new_observer):
        self.__observers.append(new_observer)

    def remove_observer(self, remove_observer):
        index = self.__observers.index(remove_observer)
        self.__observers.pop(index)

    def notify_observers(self):
        for self.__observer in self.__observers:
            self.__observer.update(self.__name)

    def set_name(self, name):
        self.__name = name
        self.notify_observers()
