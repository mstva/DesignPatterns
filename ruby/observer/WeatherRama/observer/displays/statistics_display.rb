require './observer/display'
require './observer/observer'
require './subject/weather_station'

class StatisticsDisplay
  include Observer
  include Display

  def initialize(weather_station)
    @temperature_sum = 0
    @num_readings = 0
    @max_temperature = 0
    @min_temperature = 200
    @weather_station = WeatherStation.new
    @weather_station = weather_station
    @weather_station.register_observer(self)
  end

  def update(temperature, humidity, pressure)
    super
    @temperature_sum += temperature
    @num_readings += 1

    if temperature > @max_temperature
      @max_temperature = temperature
    end

    if temperature < @min_temperature
      @min_temperature = temperature
    end

    display

  end

  def display
    super
    avg = @temperature_sum / @num_readings
    puts("\nStatisticsDisplay:")
    puts("Avg temperature = " + avg.to_s)
    puts("Max temperature = " + @max_temperature.to_s)
    puts("Min temperature = " + @min_temperature.to_s)
  end

end