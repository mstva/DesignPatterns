require './observer/observer'
require './subject/subject'

class WeatherStation < Subject

  def initialize
    super
    @observers = []
    @temperature = 0
    @humidity = 0
    @pressure = 0
    @observer = Observer
  end

  def register_observer(new_observer)
    super
    @observers.push(new_observer)
  end

  def remove_observer(remove_observer)
    super
    @observers.delete(remove_observer)
  end

  def notify_observers
    super
    for @observer in @observers
      @observer.update(@temperature, @humidity, @pressure)
    end
  end

  def set_measurements(temperature, humidity, pressure)
    @temperature = temperature
    @humidity = humidity
    @pressure = pressure
    notify_observers
  end

end