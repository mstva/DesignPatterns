from subject.WeatherStation import WeatherStation
from observer.displays.CurrentConditionDisplay import CurrentConditionDisplay
from observer.displays.ForecastDisplay import ForecastDisplay
from observer.displays.StatisticsDisplay import StatisticsDisplay
from observer.displays.HeatIndexDisplay import HeatIndexDisplay

if __name__ == '__main__':

    weather_station = WeatherStation()
    current_condition_display = CurrentConditionDisplay(weather_station)
    forecast_display = ForecastDisplay(weather_station)
    statistics_display = StatisticsDisplay(weather_station)
    heat_index_display = HeatIndexDisplay(weather_station)

    weather_station.set_measurements(20, 34, 2)

    weather_station.remove_observer(current_condition_display)

    print("====================")

    weather_station.set_measurements(50, 47, 23.6)

    print("====================")

    weather_station.set_measurements(12, 8.7, 5.003)
