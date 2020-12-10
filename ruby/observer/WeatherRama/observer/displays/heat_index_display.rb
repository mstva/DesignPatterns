require './observer/display'
require './observer/observer'
require './subject/weather_station'

class HeatIndexDisplay
  include Observer
  include Display

  def initialize(weather_station)
    @heat_index = 0
    @weather_station = WeatherStation.new
    @weather_station = weather_station
    @weather_station.register_observer(self )
  end

  def compute_heat_index(t, rh)
    (16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
    + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
    + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh))
    + (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t))
    + (0.0000291583 * (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh))
    + (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh))
    + 0.000000000843296 * (t * t * rh * rh * rh)) - (0.0000000000481975 * (t * t * t * rh * rh * rh))
  end

  def update(temperature, humidity, pressure)
    super
    @heat_index = compute_heat_index(temperature, humidity)
    display
  end

  def display
    super
    puts("\nHeatIndex = " + @heat_index.to_s)
  end

end