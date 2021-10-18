import java.util.*;

public class State {
	private State parentState = this;
	private boolean rootCheck = true;

	private String name;
	private ArrayList<String> neighborNames;
	private ArrayList<Integer> neighborDistances;

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

	public void setRootCheck(boolean rootCheck) {
		this.rootCheck = rootCheck;
	}

	public boolean getRootCheck() {
		return rootCheck;
	}
}