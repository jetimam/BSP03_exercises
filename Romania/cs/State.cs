using System;
using System.Collections.Generic;

namespace Romania
{
    class State : IState
    {
        private State parentState;

        private string name;
        private List<string> neighborNames;
        private List<int> neighborDistances; //Distance cost not implemented.

        public State(string name, List<string> neighborNames, List<int> neighborDistances)
        {
            this.name = name;
            this.neighborNames = neighborNames;
            this.neighborDistances = neighborDistances;
        }

        public override string ToString()
        {
            return this.name;
        }

        public void GenerateChildren(Dictionary<string, bool> visited, Stack<string> toVisit, string currentCity)
        {
            State currentState = graph[currentCity];

            foreach (string childCity in currentState.GetNeighborNames())
            {
                if(!visited.ContainsKey(childCity)) {
                    graph[childCity].SetParentState(currentState);
                    toVisit.Push(childCity);
                }
            }
        }

        public List<string> TrackBack(string currentCity, string initialState)
        {
            List<string> path = new List<string>();

            while(currentCity != initialState)
            {
                path.Add(currentCity);
                currentCity = graph[currentCity].GetParentState().GetName(); 
            }
            path.Add(initialState);

            return ReverseList(path);
        }

        public List<string> ReverseList(List<string> path)
        {
            List<string> output = new List<string>();

            for (int i = path.Count-1; i >= 0; i--)
                output.Add(path[i]);

            return output;
        }

        public string GetName()
        {
            return this.name;
        }

        public List<string> GetNeighborNames()
        {
            return this.neighborNames;
        }

        public void SetParentState(State parentState)
        {
            this.parentState = parentState;
        }

        public State GetParentState()
        {
            return this.parentState;
        }
    }
}