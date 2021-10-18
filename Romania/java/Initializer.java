import java.util.*;

public class Initializer {

	public static ArrayList<State> MapInitializer(ArrayList<State> graph) {  //hashmap<String, State>
		graph.add(new State("Arad", new ArrayList<String>(Arrays.asList("Zerind", "Sibiu", "Timisoara")), new ArrayList<Integer>(Arrays.asList(75, 140, 118))));
		graph.add(new State("Zerind", new ArrayList<String>(Arrays.asList("Arad", "Oradea")), new ArrayList<Integer>(Arrays.asList(75, 71))));
		graph.add(new State("Timisoara", new ArrayList<String>(Arrays.asList("Arad", "Lugoj")), new ArrayList<Integer>(Arrays.asList(118, 111))));
		graph.add(new State("Lugoj", new ArrayList<String>(Arrays.asList("Timisoara", "Mehadia")), new ArrayList<Integer>(Arrays.asList(111, 70))));
		graph.add(new State("Oradea", new ArrayList<String>(Arrays.asList("Zerind", "Sibiu")), new ArrayList<Integer>(Arrays.asList(71, 151))));
		graph.add(new State("Sibiu", new ArrayList<String>(Arrays.asList("Arad", "Oradea", "Rimnicu Vilcea", "Fagaras")), new ArrayList<Integer>(Arrays.asList(140, 151, 80, 99))));
		graph.add(new State("Mehadia", new ArrayList<String>(Arrays.asList("Lugoj", "Drobeta")), new ArrayList<Integer>(Arrays.asList(70, 75))));
		graph.add(new State("Drobeta", new ArrayList<String>(Arrays.asList("Mehadia", "Craiova")), new ArrayList<Integer>(Arrays.asList(75, 120))));
		graph.add(new State("Craiova", new ArrayList<String>(Arrays.asList("Drobeta", "Rimnicu Vilcea", "Pitesti")), new ArrayList<Integer>(Arrays.asList(120, 146, 138))));
		graph.add(new State("Rimnicu Vilcea", new ArrayList<String>(Arrays.asList("Sibiu", "Craiova", "Pitesti")), new ArrayList<Integer>(Arrays.asList(80, 146, 97))));
		graph.add(new State("Fagaras", new ArrayList<String>(Arrays.asList("Sibiu", "Bucharest")), new ArrayList<Integer>(Arrays.asList(99, 211))));
		graph.add(new State("Pitesti", new ArrayList<String>(Arrays.asList("Rimnicu Vilcea", "Craiova", "Bucharest")), new ArrayList<Integer>(Arrays.asList(75, 71))));
		graph.add(new State("Bucharest", new ArrayList<String>(Arrays.asList("Pitesti", "Fagaras", "Giurgiu", "Urziceni")), new ArrayList<Integer>(Arrays.asList(101, 211, 90, 85))));
		graph.add(new State("Giurgiu", new ArrayList<String>(Arrays.asList("Bucharest")), new ArrayList<Integer>(Arrays.asList(90))));
		graph.add(new State("Urziceni", new ArrayList<String>(Arrays.asList("Bucharest", "Hirsova", "Vaslui")), new ArrayList<Integer>(Arrays.asList(85, 98, 142))));
		graph.add(new State("Hirsova", new ArrayList<String>(Arrays.asList("Urziceni", "Eforie")), new ArrayList<Integer>(Arrays.asList(98, 86))));
		graph.add(new State("Eforie", new ArrayList<String>(Arrays.asList("Hirsova")), new ArrayList<Integer>(Arrays.asList(86))));
		graph.add(new State("Vaslui", new ArrayList<String>(Arrays.asList("Urziceni")), new ArrayList<Integer>(Arrays.asList(142))));
		graph.add(new State("Iasi", new ArrayList<String>(Arrays.asList("Vaslui", "Neamt")), new ArrayList<Integer>(Arrays.asList(92, 87))));
		graph.add(new State("Neamt", new ArrayList<String>(Arrays.asList("Iasi")), new ArrayList<Integer>(Arrays.asList(87))));

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