import java.util.*;

public class Main {
	public static void main (String args[]) {
		Map<String, State> graph = new HashMap<String, State>();
		graph = Initializer.MapInitializer(graph);

		DFS dfs = new DFS(graph);
		
		ArrayList<String> result = dfs.search("Arad", "Bucharest");

		System.out.println("Solution found: " + result);
	}
}