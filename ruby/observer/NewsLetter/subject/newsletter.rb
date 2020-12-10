require './subject/subject'
require './observer/observer'

class Newsletter < Subject

  def initialize
    super
    @observers = []
    @name = ''
    @observer = Observer.new
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
      @observer.update(@name)
    end
  end

  def set_name(name)
    @name = name
    notify_observers
  end

end