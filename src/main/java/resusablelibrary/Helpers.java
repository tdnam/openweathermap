package resusablelibrary;

import java.time.Instant;
import java.util.Date;

import structure.Daily;
import structure.Weather;

public class Helpers {

	public static String convertUTCToLocalTime(long utc) {
		Instant instant = Instant.ofEpochSecond(utc);
		return Date.from(instant).toString();
	}

	public static int numberOfDaysTempGreaterThan(Daily[] daily, float target) {

		int result = 0;

		for (int i = 0; i < daily.length; i++) {
			System.out.println("Maximum Temperature on " + Helpers.convertUTCToLocalTime(daily[i].getDt()) + " is "
					+ daily[i].getTemp().getMax());

			if (daily[i].getTemp().getMax() > target) {
				result++;
			}
		}
		System.out.println();
		return result;
	}

	public static int countAllDailyWeatherBasedOnConditionCode(Daily[] daily, int code) {
		int counter = 0;

		for (int i = 0; i < daily.length; i++) {
			Weather[] weather = daily[i].getWeather();

			for (int j = 0; j < weather.length; j++) {

				System.out.println("The weather on " + Helpers.convertUTCToLocalTime(daily[i].getDt()) + " is "
						+ weather[j].getDescription());

				if (weather[j].getId() == code) {
					counter++;
				}
			}
		}
		System.out.println();
		return counter;
	}

}
