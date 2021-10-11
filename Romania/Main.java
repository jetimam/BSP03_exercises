import java.util.*;

public class Main {
	public static void main (String args[]) {
		Map<String, ArrayList<Neighbor>> map = new HashMap<String, ArrayList<Neighbor>>();

		map = Initializer.MapInitializer(map); //building the graph

		boolean result = DFS(map, "Arad", "Bucharest"); //returns true

		System.out.println("Solution found: " + result);

		result = DFS(map, "Arad", "Buchaaaarest"); //returns false

		System.out.println("Solution found: " + result);
	}

	public static boolean DFS(Map<String, ArrayList<Neighbor>> map, String initialState, String goalState) {
		Map<String, Boolean> visited = new HashMap<String, Boolean>(); //list of visited nodes so that we don't get stuck in an infinite loop.
		visited = Initializer.VisitedInitializer(visited); // setting everything to false

		Stack<String> toVisit = new Stack<String>(); // this is the stack that has our frontier

		boolean found = false;

		String next; //the state that is currently being evaluated.

		toVisit.push(initialState);

		while (!(toVisit.isEmpty() || found)) {
			next = toVisit.pop();

			if (!visited.get(next)) { // checks if the current nod has been visited.
				visited.replace(next, true);

				if (next.equals(goalState)) {
					found = true;
				}
				else {
					for (Neighbor n : map.get(next)) { //pushes the children of the state onto the stack
						toVisit.push(n.getCityName());
					}
				}
			}
		}
		return found;
	}
}