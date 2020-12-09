package subject

import observer.Observer

class Newsletter : Subject {

    private var name: String? = null
    private var observers: ArrayList<Observer>? = null

    init {
        observers = ArrayList()
    }

    override fun registerObserver(newObserver: Observer) {
        observers!!.add(newObserver)
    }

    override fun removeObserver(removeObserver: Observer) {
        observers!!.remove(removeObserver)
    }

    override fun notifyObservers() {
        for (observer in observers!!) {
            observer.update(name!!)
        }
    }

    fun setName(name: String) {
        this.name = name
        notifyObservers()
    }
}