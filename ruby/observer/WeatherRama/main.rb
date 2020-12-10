require './observer/displays/current_condition_display'
require './observer/displays/forecast_display.rb'
require './observer/displays/statistics_display.rb'
require './observer/displays/heat_index_display.rb'
require './subject/weather_station'

weather_station = WeatherStation.new

current_condition_display = CurrentConditionDisplay.new(weather_station)
forecast_display = ForecastDisplay.new(weather_station)
statistics_display = StatisticsDisplay.new(weather_station)
heat_index_display = HeatIndexDisplay.new(weather_station)

weather_station.set_measurements(20, 12, 3.5)

weather_station.remove_observer(current_condition_display)

puts "====================="

weather_station.set_measurements(15, 1.2, 78)