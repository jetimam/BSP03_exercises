import java.util.*;

public class Main {
	public static void main (String args[]) {
		ArrayList<State> graph = new ArrayList<State>();

		graph = Initializer.MapInitializer(graph); //building the graph

		DFS dfs = new DFS(graph);

		ArrayList<String> result = dfs.search("Arad", "Zerind"); //returns true

		System.out.println("Solution found: " + reverseList(result));
	}

	public static ArrayList<String> reverseList(ArrayList<String> list) {
		ArrayList<String> output = new ArrayList<String>();

		for (int i = list.size()-1; i >= 0; i--) {
			output.add(list.get(i));
		}

		return output;
	}
}