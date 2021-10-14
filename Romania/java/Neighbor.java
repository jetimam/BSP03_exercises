public class State {
	private State parentState;

	private String name;
	private ArrayList<String>() neighborNames;
	private ArrayList<Integer> neighborDistances;

	public Neighbor(String name, ArrayList<String> neighborNames, ArrayList<Integer> neighborDistances) {
		this.name = name;
		this.neighborNames = neighborNames
		this.neighborDistances = neighborDistances;
	}

	public String toString() {
		return name + " - " + neighborNames + " - " + neighborDistances;
	}

	public String getName() {
		return this.name;
	}
}