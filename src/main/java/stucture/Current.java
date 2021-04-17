package stucture;

import com.google.gson.annotations.SerializedName;

public class Current {
	private long dt;
	private long sunrise;
	private long sunset;
	private float temp;
	
	@SerializedName(value = "feels_like")
	private float feelsLike;
	
	private int pressure;
	private int humidity;
	
	@SerializedName(value = "dew_point")
	private float dewPoint;
	private float uvi;
	private int clouds;
	private int visibility;
	
	@SerializedName(value = "wind_speed")
	private float windSpeed;
	
	@SerializedName(value = "wind_deg")
	private float winDeg;
	
	private Weather[] weather;

	public long getDt() {
		return dt;
	}

	public void setDt(long dt) {
		this.dt = dt;
	}

	public long getSunrise() {
		return sunrise;
	}

	public void setSunrise(long sunrise) {
		this.sunrise = sunrise;
	}

	public long getSunset() {
		return sunset;
	}

	public void setSunset(long sunset) {
		this.sunset = sunset;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public float getUvi() {
		return uvi;
	}

	public void setUvi(float uvi) {
		this.uvi = uvi;
	}

	public int getClouds() {
		return clouds;
	}

	public void setClouds(int clouds) {
		this.clouds = clouds;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

}
