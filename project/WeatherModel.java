package lesson7.project;

import lesson7.project.entity.Weather;

import java.io.IOException;
import java.util.List;

public interface WeatherModel {
    void getWeather(String selectedCity, lesson7.project.Period period) throws IOException;

    public List<Weather> getSavedToDBWeather();
}
