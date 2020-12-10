require './observer/display'
require './observer/observer'
require './subject/weather_station'

class CurrentConditionDisplay
  include Observer
  include Display

  def initialize(weather_station)
    @weather_station = WeatherStation.new
    @weather_station = weather_station
    @weather_station.register_observer(self)
    @temperature = 0
    @humidity = 0
    @pressure = 0
  end

  def update(temperature, humidity, pressure)
    super
    @temperature = temperature
    @humidity = humidity
    @pressure = pressure
    display
  end

  def display
    super
    puts("Current Conditions:")
    puts(@temperature.to_s + "F degree")
    puts(@humidity.to_s + "% humidity")
    puts(@pressure.to_s + " pressure")
  end

end