package observer

import subject.Newsletter

class Subscriber(newsletter: Newsletter) : Observer {

    private var name: String? = null

    private var newsletter = Newsletter()

    init {
        this.newsletter = newsletter
        newsletter.registerObserver(this)
    }

    override fun update(name: String) {
        this.name = name
        println("New Subscriber: +$name added to the newsletter\n")
    }

}