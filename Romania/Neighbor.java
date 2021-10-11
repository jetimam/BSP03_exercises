public class Neighbor {
	private String cityName;
	private int cityDistance;

	public Neighbor(String cityName, int cityDistance) {
		this.cityName = cityName;
		this.cityDistance = cityDistance;
	}

	public String toString() {
		return cityName + " - " + cityDistance;
	}

	public String getCityName() {
		return this.cityName;
	}
}