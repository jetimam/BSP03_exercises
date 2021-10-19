using System;
using System.Collections.Generic;

namespace Romania
{
    class DFS {
        private Dictionary<string, State> graph;

        public DFS(Dictionary<string, State> graph) {
            this.graph = graph;
        }

        public List<string> Search(string initialState, string goalState) {
            Dictionary<string, bool> visited = new Dictionary<string, bool>();
            Stack<string> toVisit = new Stack<string>(); //frontier
            bool found = false;
            string currentCity = "";
            toVisit.Push(initialState);

            while(!(toVisit.Count == 0 || found)) {
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

        public void GenerateChildren(Dictionary<string, bool> visited, Stack<string> toVisit, string currentCity) {
            State currentState = graph[currentCity];

            foreach (string childCity in currentState.GetNeighborNames()) { //FIX
                if(!visited.ContainsKey(childCity)) {
                    graph[childCity].SetParentState(currentState);
                    toVisit.Push(childCity);
                }
            }
        }

        public List<string> TrackBack(string currentCity, string initialState) {
            List<string> path = new List<string>();

            while(currentCity != initialState) {
                path.Add(currentCity);
                currentCity = graph[currentCity].GetParentState().GetName(); 
            }
            path.Add(initialState);

            return ReverseList(path);
        }

        public List<string> ReverseList(List<string> path) {
            List<string> output = new List<string>();

            for (int i = path.Count-1; i >= 0; i--) {
                output.Add(path[i]);
            }

            return output;
        }
    }
}