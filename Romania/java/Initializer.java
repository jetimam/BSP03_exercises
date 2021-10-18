import java.util.*;

public class Initializer {
	public static Map<String, State> MapInitializer(Map<String, State> graph) {
		graph.put("Arad", new State("Arad", new ArrayList<String>(Arrays.asList("Zerind", "Sibiu", "Timisoara")), new ArrayList<Integer>(Arrays.asList(75, 140, 118))));
		graph.put("Zerind", new State("Zerind", new ArrayList<String>(Arrays.asList("Arad", "Oradea")), new ArrayList<Integer>(Arrays.asList(75, 71))));
		graph.put("Timisoara", new State("Timisoara", new ArrayList<String>(Arrays.asList("Arad", "Lugoj")), new ArrayList<Integer>(Arrays.asList(118, 111))));
		graph.put("Lugoj", new State("Lugoj", new ArrayList<String>(Arrays.asList("Timisoara", "Mehadia")), new ArrayList<Integer>(Arrays.asList(111, 70))));
		graph.put("Oradea", new State("Oradea", new ArrayList<String>(Arrays.asList("Zerind", "Sibiu")), new ArrayList<Integer>(Arrays.asList(71, 151))));
		graph.put("Sibiu", new State("Sibiu", new ArrayList<String>(Arrays.asList("Arad", "Oradea", "Rimnicu Vilcea", "Fagaras")), new ArrayList<Integer>(Arrays.asList(140, 151, 80, 99))));
		graph.put("Mehadia", new State("Mehadia", new ArrayList<String>(Arrays.asList("Lugoj", "Drobeta")), new ArrayList<Integer>(Arrays.asList(70, 75))));
		graph.put("Drobeta", new State("Drobeta", new ArrayList<String>(Arrays.asList("Mehadia", "Craiova")), new ArrayList<Integer>(Arrays.asList(75, 120))));
		graph.put("Craiova", new State("Craiova", new ArrayList<String>(Arrays.asList("Drobeta", "Rimnicu Vilcea", "Pitesti")), new ArrayList<Integer>(Arrays.asList(120, 146, 138))));
		graph.put("Rimnicu Vilcea", new State("Rimnicu Vilcea", new ArrayList<String>(Arrays.asList("Sibiu", "Craiova", "Pitesti")), new ArrayList<Integer>(Arrays.asList(80, 146, 97))));
		graph.put("Fagaras", new State("Fagaras", new ArrayList<String>(Arrays.asList("Sibiu", "Bucharest")), new ArrayList<Integer>(Arrays.asList(99, 211))));
		graph.put("Pitesti", new State("Pitesti", new ArrayList<String>(Arrays.asList("Rimnicu Vilcea", "Craiova", "Bucharest")), new ArrayList<Integer>(Arrays.asList(75, 71))));
		graph.put("Bucharest", new State("Bucharest", new ArrayList<String>(Arrays.asList("Pitesti", "Fagaras", "Giurgiu", "Urziceni")), new ArrayList<Integer>(Arrays.asList(101, 211, 90, 85))));
		graph.put("Giurgiu", new State("Giurgiu", new ArrayList<String>(Arrays.asList("Bucharest")), new ArrayList<Integer>(Arrays.asList(90))));
		graph.put("Urziceni", new State("Urziceni", new ArrayList<String>(Arrays.asList("Bucharest", "Hirsova", "Vaslui")), new ArrayList<Integer>(Arrays.asList(85, 98, 142))));
		graph.put("Hirsova", new State("Hirsova", new ArrayList<String>(Arrays.asList("Urziceni", "Eforie")), new ArrayList<Integer>(Arrays.asList(98, 86))));
		graph.put("Eforie", new State("Eforie", new ArrayList<String>(Arrays.asList("Hirsova")), new ArrayList<Integer>(Arrays.asList(86))));
		graph.put("Vaslui", new State("Vaslui", new ArrayList<String>(Arrays.asList("Urziceni")), new ArrayList<Integer>(Arrays.asList(142))));
		graph.put("Iasi", new State("Iasi", new ArrayList<String>(Arrays.asList("Vaslui", "Neamt")), new ArrayList<Integer>(Arrays.asList(92, 87))));
		graph.put("Neamt", new State("Neamt", new ArrayList<String>(Arrays.asList("Iasi")), new ArrayList<Integer>(Arrays.asList(87))));

		return graph;
	}
}