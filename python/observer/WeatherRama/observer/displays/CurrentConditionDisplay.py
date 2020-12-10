from observer.Observer import Observer
from observer.Display import Display
from subject.WeatherStation import WeatherStation

class CurrentConditionDisplay(Observer, Display):

    def __init__(self, weather_station):
        self.__temperature = 0
        self.__humidity = 0
        self.__pressure = 0
        self.__weather_station = WeatherStation()
        self.__weather_station = weather_station
        self.__weather_station.register_observer(self)

    def update(self, temperature, humidity, pressure):
        self.__temperature = temperature
        self.__humidity = humidity
        self.__pressure = pressure
        self.display()

    def display(self):
        print("\nCurrent Conditions:\n"
              + str(self.__temperature) + "F degree\n"
              + str(self.__humidity) + "% humidity\n"
              + str(self.__pressure) + " pressure\n")
