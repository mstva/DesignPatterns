require './observer/observer'
require './subject/newsletter'

class Subscriber < Observer

  def initialize(newsletter)
    @name = ''
    @newsletter = Newsletter.new
    @newsletter = newsletter
    @newsletter.register_observer(self)
  end

  def update(name)
    super
    @name = name
    puts("New Subscriber: +" + @name + " added to the newsletter")
  end

end