package lesson7.project;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lesson7.project.entity.Weather;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.List;

public class AccuweatherModel implements WeatherModel {
    //http://dataservice.accuweather.com/forecasts/v1/daily/1day/349727
    private static final String PROTOKOL = "https";
    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECASTS = "forecasts";
    private static final String VERSION = "v1";
    private static final String DAILY = "daily";
    private static final String ONE_DAY = "1day";
    private static final String FIVE_DAY = "5day";
    private static final String API_KEY = "1zdzCGP4d9Y0VPSRUjhZBbnvrpIzFT5R";
    private static final String API_KEY_QUERY_PARAM = "apikey";
    private static final String METRIC = "true";
    private static final String METRIC_QUERY_PARAM = "metric";
    private static final String LOCATIONS = "locations";
    private static final String CITIES = "cities";
    private static final String AUTOCOMPLETE = "autocomplete";

    private static final OkHttpClient okHttpClient = new OkHttpClient();
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private lesson7.project.DataBaseRepository dataBaseRepository = new lesson7.project.DataBaseRepository();

    public void getWeather(String selectedCity, Period period) throws IOException {
        switch (period) {
            case NOW:
                HttpUrl httpUrl = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(ONE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .addQueryParameter(METRIC_QUERY_PARAM, METRIC)
                        .build();

                Request request = new Request.Builder()
                        .url(httpUrl)
                        .build();

                Response oneDayForecastResponse = okHttpClient.newCall(request).execute();
                String weatherResponse = oneDayForecastResponse.body().string();
                System.out.println(weatherResponse);

                ObjectMapper objectMapper1 = new ObjectMapper();
                JsonNode date = objectMapper1.readTree(weatherResponse).at("/DailyForecasts/0/Date");
                JsonNode minTemperature = objectMapper1.readTree(weatherResponse).at("/DailyForecasts/0/Temperature/Minimum/Value");
                JsonNode maxTemperature = objectMapper1.readTree(weatherResponse).at("/DailyForecasts/0/Temperature/Maximum/Value");
                System.out.println("Температрура воздуха в городе " + selectedCity + ": от "
                        + minTemperature.asText() + " до " + maxTemperature + " градусов по Цельсию");
                System.out.println("Дата: " + date.asText());


                //TODO: сделать человекочитаемый вывод погоды. Выбрать параметры для вывода на свое усмотрение
                //Например: Погода в городе Москва - 5 градусов по цельсию Expect showers late Monday night
                //dataBaseRepository.saveWeatherToDataBase(new Weather()) - тут после парсинга добавляем данные в БД
                break;
            case FIVE_DAYS:
                HttpUrl httpUrl1 = new HttpUrl.Builder()
                        .scheme(PROTOKOL)
                        .host(BASE_HOST)
                        .addPathSegment(FORECASTS)
                        .addPathSegment(VERSION)
                        .addPathSegment(DAILY)
                        .addPathSegment(FIVE_DAY)
                        .addPathSegment(detectCityKey(selectedCity))
                        .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                        .addQueryParameter(METRIC_QUERY_PARAM, METRIC)
                        .build();

                Request request2 = new Request.Builder()
                        .url(httpUrl1)
                        .build();

                Response fiveDayForecastResponse = okHttpClient.newCall(request2).execute();
                String weatherResponse2 = fiveDayForecastResponse.body().string();
                System.out.println(weatherResponse2);

                ObjectMapper objectMapper2 = new ObjectMapper();

                String [] strDate = new String[5];
                String [] strMinTemperature = new String[5];
                String [] strMaxTemperature = new String[5];
                for (int i=0; i<5; i++) {
                    strDate[i] = objectMapper2.readTree(weatherResponse2).at("/DailyForecasts/"+i+"/Date").asText();
                    strMinTemperature[i] = objectMapper2.readTree(weatherResponse2).at("/DailyForecasts/"+i+"/Temperature/Minimum/Value").asText();
                    strMaxTemperature[i] = objectMapper2.readTree(weatherResponse2).at("/DailyForecasts/"+i+"/Temperature/Maximum/Value").asText();
                    System.out.println("Температрура воздуха в городе " + selectedCity + " на дату " + strDate[i] + ": от "
                            + strMinTemperature[i] + " до " + strMaxTemperature[i] + " градусов по Цельсию");
                }


                break;
        }
    }


    @Override
    public List<Weather> getSavedToDBWeather() {
        return dataBaseRepository.getSavedToDBWeather();
    }

    private String detectCityKey(String selectCity) throws IOException {
        //http://dataservice.accuweather.com/locations/v1/cities/autocomplete
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme(PROTOKOL)
                .host(BASE_HOST)
                .addPathSegment(LOCATIONS)
                .addPathSegment(VERSION)
                .addPathSegment(CITIES)
                .addPathSegment(AUTOCOMPLETE)
                .addQueryParameter(API_KEY_QUERY_PARAM, API_KEY)
                .addQueryParameter("q", selectCity)
                .build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .addHeader("accept", "application/json")
                .build();

        Response response = okHttpClient.newCall(request).execute();
        String responseString = response.body().string();

        String cityKey = objectMapper.readTree(responseString).get(0).at("/Key").asText();
        return cityKey;
    }

}
