from observer.Observer import Observer
from observer.Display import Display
from subject.WeatherStation import WeatherStation


class ForecastDisplay(Observer, Display):

    def __init__(self, weather_station):
        self.__current_pressure = 29.92
        self.__last_pressure = 0
        self.__weather_station = WeatherStation()
        self.__weather_station = weather_station
        self.__weather_station.register_observer(self)

    def update(self, temperature, humidity, pressure):
        self.__last_pressure = self.__current_pressure
        self.__current_pressure = pressure
        self.display()

    def display(self):

        print("ForecastDisplay:")

        if self.__current_pressure > self.__last_pressure:
            print("Improving weather on the way!\n")

        elif self.__current_pressure == self.__last_pressure:
            print("More of the same\n")

        elif self.__current_pressure < self.__last_pressure:
            print("Watch out for cooler, rainy weather\n")
