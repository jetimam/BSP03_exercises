using System;

public class Main
{
	public static void Main()
	{
		List<State> graph = Initializer.GraphInitializer(graph);

		Console.WriteLine(graph);
	}
}