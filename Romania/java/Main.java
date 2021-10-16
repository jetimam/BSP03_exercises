import java.util.*;

public class Main {
	public static void main (String args[]) {
		ArrayList<State> graph = new ArrayList<State>();

		graph = Initializer.MapInitializer(graph); //building the graph

		ArrayList<String> result = DFS.DFSearch(graph, "Arad", "Lugoj"); //returns true

		System.out.println("Solution found: " + result);
	}
}