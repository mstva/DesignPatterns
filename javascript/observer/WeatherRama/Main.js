import {CurrentConditionDisplay} from "./observer/displays/CurrentConditionDisplay.js";
import {WeatherStation} from "./subject/WeatherStation.js";
import {ForecastDisplay} from "./observer/displays/ForecastDisplay.js";
import {StatisticsDisplay} from "./observer/displays/StatisticsDisplay.js";
import {HeatIndexDisplay} from "./observer/displays/HeatIndexDisplay.js";

const weatherStation = new WeatherStation()

const currentConditionDisplay = new CurrentConditionDisplay(weatherStation)
const forecastDisplay = new ForecastDisplay(weatherStation)
const statisticsDisplay = new StatisticsDisplay(weatherStation)
const heatIndexDisplay = new HeatIndexDisplay(weatherStation)

weatherStation.setMeasurements(80, 50, 59.2)

weatherStation.removeObserver(currentConditionDisplay)

weatherStation.setMeasurements(87, 23, 80)

weatherStation.setMeasurements(451, 74, 159.7)