import observer.Subscriber
import subject.Newsletter

fun main() {

    val newsletter = Newsletter()

    val subscriber = Subscriber(newsletter)

    newsletter.setName("Mustafa")
    
}