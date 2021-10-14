import java.util.*;

public class Initializer {

	public static Map<State> MapInitializer(Map<State> graph) {
		graph.put(new State("Arad", new ArrayList<String>(Arrays.asList("Zerind", "Sibiu", "Timisoara"), new ArrayList<Integer>(Arrays.asList(75, 140, 118)))));
		
		/*graph.put("Zerind", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Arad", 75), new Neighbor("Oradea", 71))));
		graph.put("Timisoara", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Arad", 118), new Neighbor("Lugoj", 111))));
		graph.put("Lugoj", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Timisoara", 111), new Neighbor("Mehadia", 70))));
		graph.put("Oradea", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Zerind", 71), new Neighbor("Sibiu", 151))));
		graph.put("Sibiu", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Arad", 140), new Neighbor("Oradea", 151), new Neighbor("Rimnicu Vilcea", 80), new Neighbor("Fagaras", 99))));
		graph.put("Mehadia", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Lugoj", 70), new Neighbor("Drobeta", 75))));
		graph.put("Drobeta", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Mehadia", 75), new Neighbor("Craiova", 120))));
		graph.put("Craiova", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Drobeta", 120), new Neighbor("Rimnicu Vilcea", 146), new Neighbor("Pitesti", 138))));
		graph.put("Rimnicu Vilcea", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Sibiu", 80), new Neighbor("Craiova", 146), new Neighbor("Pitesti", 97))));
		graph.put("Fagaras", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Sibiu", 99), new Neighbor("Bucharest", 211))));
		graph.put("Pitesti", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Rimnicu Vilcea", 97), new Neighbor("Craiova", 138), new Neighbor("Bucharest", 101))));
		graph.put("Bucharest", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Pitesti", 101), new Neighbor("Fagaras", 211), new Neighbor("Giurgiu", 90), new Neighbor("Urziceni", 85))));
		graph.put("Giurgiu", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Bucharest", 90))));
		graph.put("Urziceni", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Bucharest", 85), new Neighbor("Hirsova", 98), new Neighbor("Vaslui", 142))));
		graph.put("Hirsova", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Urziceni", 98), new Neighbor("Eforie", 86))));
		graph.put("Eforie", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Hirsova", 86))));
		graph.put("Vaslui", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Urziceni", 142), new Neighbor("Iasi", 92))));
		graph.put("Iasi", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Vaslui", 92), new Neighbor("Neamt", 87))));
		graph.put("Neamt", new ArrayList<Neighbor>(Arrays.asList(new Neighbor("Iasi", 87))));*/

		return graph;
	}

	public static Map<String, Boolean> VisitedInitializer(Map<String, Boolean> visited) {
		visited.put("Arad", false);
		visited.put("Zerind", false);
		visited.put("Timisoara", false);
		visited.put("Lugoj", false);
		visited.put("Oradea", false);
		visited.put("Sibiu", false);
		visited.put("Mehadia", false);
		visited.put("Drobeta", false);
		visited.put("Craiova", false);
		visited.put("Rimnicu Vilcea", false);
		visited.put("Fagaras", false);
		visited.put("Pitesti", false);
		visited.put("Bucharest", false);
		visited.put("Giurgiu", false);
		visited.put("Urziceni", false);
		visited.put("Hirsova", false);
		visited.put("Eforie", false);
		visited.put("Vaslui", false);
		visited.put("Iasi", false);
		visited.put("Neamt", false);

		return visited;
	}
}