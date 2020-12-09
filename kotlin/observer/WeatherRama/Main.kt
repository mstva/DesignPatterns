import observer.displays.CurrentConditionDisplay
import observer.displays.ForecastDisplay
import observer.displays.HeatIndexDisplay
import observer.displays.StatisticsDisplay
import subject.WeatherStation

fun main() {

    val weatherStation = WeatherStation()

    val currentConditionDisplay = CurrentConditionDisplay(weatherStation)
    val statisticsDisplay = StatisticsDisplay(weatherStation)
    val forecastDisplay = ForecastDisplay(weatherStation)
    val heatIndexDisplay = HeatIndexDisplay(weatherStation)

    weatherStation.setMeasurements(10f, 4.5f, 22.4f)

    weatherStation.removeObserver(currentConditionDisplay)

    weatherStation.setMeasurements(50f, 78f, 16.8f)

    weatherStation.setMeasurements(5f, 91f, 45.7f)

}