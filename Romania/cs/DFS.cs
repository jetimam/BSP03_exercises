using System;
using System.Collections.Generic;

namespace Romania
{
    class DFS
    {
        private Dictionary<string, State> graph;

        public DFS(Dictionary<string, State> graph)
        {
            this.graph = graph;
        }

        public List<string> Search(string initialState, string goalState)
        {
            Dictionary<string, bool> visited = new Dictionary<string, bool>();
            Stack<string> toVisit = new Stack<string>(); //frontier
            bool found = false;
            string currentCity = "";
            toVisit.Push(initialState);

            while(!(toVisit.Count == 0 || found))
            {
                currentCity = toVisit.Pop();
                visited.Add(currentCity, true);

                if(currentCity.Equals(goalState))
                    found = true;
                else
                    GenerateChildren(visited, toVisit, currentCity);
            }
            if(found)
                return TrackBack(currentCity, initialState);
            else
                return new List<string>();
        }
    }
}