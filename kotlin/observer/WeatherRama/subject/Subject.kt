package subject

import observer.Observer

interface Subject {

    fun registerObserver(newObserver: Observer)
    fun removeObserver(removeObserver: Observer)
    fun notifyObservers()

}