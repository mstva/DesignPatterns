require './observer/display'
require './observer/observer'
require './subject/weather_station'

class ForecastDisplay
  include Observer
  include Display

  def initialize(weather_station)
    @current_pressure = 29.92
    @last_pressure = 0
    @weather_station = WeatherStation.new
    @weather_station = weather_station
    @weather_station.register_observer(self)
  end

  def update(temperature, humidity, pressure)
    super
    @last_pressure = @current_pressure
    @current_pressure = pressure
    display
  end

  def display
    super
    puts "\nForecastDisplay:"
    if @current_pressure > @last_pressure
      puts "Improving weather on the way!"
    elsif @current_pressure == @last_pressure
      puts "More of the same"
    elsif @current_pressure < @last_pressure
      puts "Watch out for cooler, rainy weather"
    end
  end

end