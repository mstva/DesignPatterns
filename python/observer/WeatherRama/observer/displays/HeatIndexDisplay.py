from observer.Observer import Observer
from observer.Display import Display
from subject.WeatherStation import WeatherStation

def compute_heat_index(t, rh):
    index = (16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
             + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
             + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh))
             + (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t))
             + (0.0000291583 * (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh))
             + (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh))
             + 0.000000000843296 * (t * t * rh * rh * rh)) - (0.0000000000481975 * (t * t * t * rh * rh * rh))

    return index

class HeatIndexDisplay(Observer, Display):

    def __init__(self, weather_station):
        self.__heatIndex = 0
        self.__weather_station = WeatherStation()
        self.__weather_station = weather_station
        self.__weather_station.register_observer(self)

    def update(self, temperature, humidity, pressure):
        self.__heatIndex = compute_heat_index(temperature, humidity)
        self.display()

    def display(self):
        print("HeatIndex = " + str(self.__heatIndex))
