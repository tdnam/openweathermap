package structure;

public class CurrentForecastWeather {
	private String lat;
	private String lon;
	private String timezone;
	private int timezoneOffset;
	private Current current;
	private Daily[] daily;

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public int getTimezoneOffset() {
		return timezoneOffset;
	}

	public void setTimezoneOffset(int timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	public Current getCurrent() {
		return current;
	}

	public void setCurrent(Current current) {
		this.current = current;
	}

	public Daily[] getDaily() {
		return daily;
	}

	public void setDaily(Daily[] daily) {
		this.daily = daily;
	}
}
