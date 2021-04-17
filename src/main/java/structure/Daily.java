package structure;

public class Daily {
	private long dt;
	private long sunrise;
	private long sunset;
	private long moonrise;
	private long moonset;
	private Temperature temp;
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

	public long getMoonrise() {
		return moonrise;
	}

	public void setMoonrise(long moonrise) {
		this.moonrise = moonrise;
	}

	public Temperature getTemp() {
		return temp;
	}

	public void setTemp(Temperature temp) {
		this.temp = temp;
	}

	public long getMoonset() {
		return moonset;
	}

	public void setMoonset(long moonset) {
		this.moonset = moonset;
	}

	public long getSunset() {
		return sunset;
	}

	public void setSunset(long sunset) {
		this.sunset = sunset;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

}
