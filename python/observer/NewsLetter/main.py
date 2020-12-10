from observer.Subscriber import Subscriber
from subject.Newsletter import Newsletter

if __name__ == '__main__':

    newsletter = Newsletter()
    subscriber = Subscriber(newsletter)

    newsletter.set_name("Mustafa")
