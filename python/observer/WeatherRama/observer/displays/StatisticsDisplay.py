from observer.Observer import Observer
from observer.Display import Display
from subject.WeatherStation import WeatherStation


class StatisticsDisplay(Observer, Display):

    def __init__(self, weather_station):
        self.__temperature_sum = 0
        self.__num_readings = 0
        self.__max_temperature = 0
        self.__min_temperature = 200
        self.__weather_station = WeatherStation()
        self.__weather_station = weather_station
        self.__weather_station.register_observer(self)

    def update(self, temperature, humidity, pressure):
        self.__temperature_sum += temperature
        self.__num_readings += 1

        if temperature > self.__max_temperature: self.__max_temperature = temperature
        if temperature < self.__min_temperature: self.__min_temperature = temperature

        self.display()

    def display(self):
        avg = self.__temperature_sum/self.__num_readings
        print("StatisticsDisplay:\n"
              + "Avg temperature = " + str(avg) + "\n"
              + "Max temperature = " + str(self.__max_temperature) + "\n"
              + "Min temperature = " + str(self.__min_temperature) + "\n")
