require './subject/newsletter'
require './observer/subscriber'

newsletter = Newsletter.new
subscriber = Subscriber.new(newsletter)

newsletter.set_name("Mustafa")