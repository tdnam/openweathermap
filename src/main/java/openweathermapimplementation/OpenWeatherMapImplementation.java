package openweathermapimplementation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import okhttp3.Response;
import resusableLibrary.Helpers;
import serializer.Serializer;
import structure.CurrentForecastWeather;
import structure.Daily;

public class OpenWeatherMapImplementation {

	private static String API_BASE;
	private static String LAT;
	private static String LON;
	private static String EXCLUDE;
	private static String API_KEY;
	private static String UNITS;

	// OpenWeatherMap Weather Condition
	private static int CLEAR_SKY;

	public static void main(String[] args) throws IOException {
		// READ PROPERTIES
		Properties prop = new Properties();
		String fileName = "config.properties";
		InputStream is = null;
		try {
			is = new FileInputStream(fileName);
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		}
		try {
			prop.load(is);
		} catch (IOException ex) {
			System.out.println(ex);
		}

		API_BASE = prop.getProperty("apibase");
		LAT = prop.getProperty("lat");
		LON = prop.getProperty("lon");
		EXCLUDE = prop.getProperty("exclude");
		API_KEY = prop.getProperty("apikey");
		UNITS = prop.getProperty("units");
		CLEAR_SKY = Integer.valueOf(prop.getProperty("clear.sky"));

		// API call to get Current and forecast weather data
		// https://openweathermap.org/api/one-call-api#data
		HttpClient client = new HttpClient();
		Response response = client.getRequest(API_BASE,
				"lat=" + LAT + "&lon=" + LON + "&exclude=" + EXCLUDE + "&appid=" + API_KEY + "&units=" + UNITS);

		String responseBody = response.body().string();
		System.out.println("Response Body: " + responseBody);

		CurrentForecastWeather result = Serializer.jsonToObject(responseBody, CurrentForecastWeather.class);
		Daily[] daily = result.getDaily();

		int greaterThan20DegreeCounter = Helpers.numberOfDaysTempGreaterThan(daily, 20);
		int clearSkyCounter = Helpers.countAllDailyWeatherBasedOnConditionCode(daily, CLEAR_SKY);

		// Print out results
		System.out.println("--- FINAL RESULTS ---");
		System.out.println("The Number of Days Predicted To Be Above 20 degree: " + greaterThan20DegreeCounter);
		System.out.println("The Number of Days Predicted to be Sunny/Clear Sky: " + clearSkyCounter);
	}

}
