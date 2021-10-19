using System;
using System.Collections.Generic;

namespace Romania
{
    class Initializer
    {
        public static Dictionary<String, State> MapInitializer(Dictionary<String, State> graph)
        {
            graph.Add("Arad", new State("Arad", new List<string>(new []{"Zerind", "Sibiu", "Timisoara"}), new List<int>(new []{75, 140, 118})));
            graph.Add("Zerind", new State("Zerind", new List<string>(new []{"Arad", "Oradea"}), new List<int>(new []{75, 71})));
            graph.Add("Timisoara", new State("Timisoara", new List<string>(new []{"Arad", "Lugoj"}), new List<int>(new []{118, 111})));
            graph.Add("Lugoj", new State("Lugoj", new List<string>(new []{"Timisoara", "Mehadia"}), new List<int>(new []{111, 70})));
            graph.Add("Oradea", new State("Oradea", new List<string>(new []{"Zerind", "Sibiu"}), new List<int>(new []{71, 151})));
            graph.Add("Sibiu", new State("Sibiu", new List<string>(new []{"Arad", "Oradea", "Rimnicu Vilcea", "Fagaras"}), new List<int>(new []{140, 151, 80, 99})));
            graph.Add("Mehadia", new State("Mehadia", new List<string>(new []{"Lugoj", "Drobeta"}), new List<int>(new []{70, 75})));
            graph.Add("Drobeta", new State("Drobeta", new List<string>(new []{"Mehadia", "Craiova"}), new List<int>(new []{75, 120})));
            graph.Add("Craiova", new State("Craiova", new List<string>(new []{"Drobeta", "Rimnicu Vilcea", "Pitesti"}), new List<int>(new []{120, 146, 138})));
            graph.Add("Rimnicu Vilcea", new State("Rimnicu Vilcea", new List<string>(new []{"Sibiu", "Craiova", "Pitesti"}), new List<int>(new []{80, 146, 97})));
            graph.Add("Fagaras", new State("Fagaras", new List<string>(new []{"Sibiu", "Bucharest"}), new List<int>(new []{99, 211})));
            graph.Add("Pitesti", new State("Pitesti", new List<string>(new []{"Rimnicu Vilcea", "Craiova", "Bucharest"}), new List<int>(new []{75, 71})));
            graph.Add("Bucharest", new State("Bucharest", new List<string>(new []{"Pitesti", "Fagaras", "Giurgiu", "Urziceni"}), new List<int>(new []{101, 211, 90, 85})));
            graph.Add("Giurgiu", new State("Giurgiu", new List<string>(new []{"Bucharest"}), new List<int>(new []{90})));
            graph.Add("Urziceni", new State("Urziceni", new List<string>(new []{"Bucharest", "Hirsova", "Vaslui"}), new List<int>(new []{85, 98, 142})));
            graph.Add("Hirsova", new State("Hirsova", new List<string>(new []{"Urziceni", "Eforie"}), new List<int>(new []{98, 86})));
            graph.Add("Eforie", new State("Eforie", new List<string>(new []{"Hirsova"}), new List<int>(new []{86})));
            graph.Add("Vaslui", new State("Vaslui", new List<string>(new []{"Urziceni"}), new List<int>(new []{142})));
            graph.Add("Iasi", new State("Iasi", new List<string>(new []{"Vaslui", "Neamt"}), new List<int>(new []{92, 87})));
            graph.Add("Neamt", new State("Neamt", new List<string>(new []{"Iasi"}), new List<int>(new []{87})));

            return graph;
        }
    }
}
