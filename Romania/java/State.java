import java.util.*;

public class State {
	private State parentState = this;

	private String name;
	private ArrayList<String> neighborNames;
	private ArrayList<Integer> neighborDistances; //Distance cost not implemented.

	public State(String name, ArrayList<String> neighborNames, ArrayList<Integer> neighborDistances) {
		this.name = name;
		this.neighborNames = neighborNames;
		this.neighborDistances = neighborDistances;
	}

	public String toString() {
		return this.name;
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<String> getNeighborNames() {
		return this.neighborNames;
	}

	public void setParentState(State parentState) {
		this.parentState = parentState;
	}

	public State getParentState() {
		return this.parentState;
	}
}