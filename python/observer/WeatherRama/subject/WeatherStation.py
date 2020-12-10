
from observer.Observer import Observer
from subject.Subject import Subject


class WeatherStation(Subject):

    def __init__(self):
        self.__observers = []
        self.__temperature = 0
        self.__humidity = 0
        self.__pressure = 0
        self.__observer = Observer()

    def register_observer(self, new_observer):
        self.__observers.append(new_observer)

    def remove_observer(self, remove_observer):
        index = self.__observers.index(remove_observer)
        self.__observers.pop(index)

    def notify_observers(self):
        for self.__observer in self.__observers:
            self.__observer.update(self.__temperature, self.__humidity, self.__pressure)

    def set_measurements(self, temperature, humidity, pressure):
        self.__temperature = temperature
        self.__humidity = humidity
        self.__pressure = pressure
        self.notify_observers()
