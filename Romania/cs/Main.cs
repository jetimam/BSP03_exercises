using System;
using System.Collections.Generic;

namespace Romania
{
    class Romania
    {
        static void Main(string[] args)
        {
            Dictionary<String, State> graph = new Dictionary<String, State>();
            graph = Initializer.MapInitializer(graph);

            DFS dfs = new DFS(graph);
            
            List<String> path = dfs.Search("Arad", "Bucharest");

            foreach(string city in path)
                Console.Write(city + " -> ");
        }
    }
}