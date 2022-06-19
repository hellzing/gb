package lesson7.project;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    private lesson7.project.WeatherModel weatherModel = new lesson7.project.AccuweatherModel();
    private Map<Integer, lesson7.project.Period> variants = new HashMap<>();

    public Controller() {
        variants.put(1, lesson7.project.Period.NOW);
        variants.put(5, lesson7.project.Period.FIVE_DAYS);
        variants.put(2, lesson7.project.Period.DB);
    }

    public void getWeather(String userInput, String selectedCity) throws IOException, SQLException {
        Integer userIntegerInput = Integer.parseInt(userInput);

        switch (variants.get(userIntegerInput)) {
            case NOW:
                weatherModel.getWeather(selectedCity, lesson7.project.Period.NOW);
                break;
            case FIVE_DAYS:

                weatherModel.getWeather(selectedCity, Period.FIVE_DAYS);
                break;
            case DB:
                weatherModel.getSavedToDBWeather();
        }
    }
}
