package resusableLibrary;

import java.time.Instant;
import java.util.Date;

import stucture.Daily;
import stucture.Weather;

public class Helpers {
    //helper class
	
	
	public static String convertUTCToLocalTime(long utc) {
		Instant instant = Instant.ofEpochSecond(utc);
		return Date.from(instant).toString();
	}
	
	public static int numberOfDaysTempGreaterThan(Daily[] daily, float target) {
		
		 int result = 0;
	     
		 for(int i=0; i < daily.length; i++) {
	        	System.out.println("Maximum Temperature on" + Helpers.convertUTCToLocalTime(daily[i].getDt()) + " is " + daily[i].getTemp().getMax());
	        	System.out.println();
	        	
	        	if(daily[i].getTemp().getMax() > target) {
	        		result++;
	        	}
	        }
		 
		return result;
	}
	
	
	public static int countAllDailyWeatherBasedOnConditionCode(Daily[] daily, int code) {
		int clearSkyCounter = 0;

		for(int i=0; i < daily.length; i++) {
			Weather[] weather = daily[i].getWeather();
			
			for(int j = 0; j < weather.length; j++) {
	       		if(weather[j].getId() == code) {
	       			clearSkyCounter++;
	       		}
			}
		}
		
		return clearSkyCounter;
	}
	
}

