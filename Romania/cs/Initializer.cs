public class Initializer
{
	public static List<State> GraphInitializer(List<State> graph)
	{
		graph.Add("Arad", new List<string>("Zerind", "Sibiu", "Timiosoara"), new List<string>(75, 140, 118));

		return graph;
	}

	public static List<State> VisitedInitializer()
	{
		
	}
}