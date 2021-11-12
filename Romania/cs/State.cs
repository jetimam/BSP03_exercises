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

        public override bool Equals(Object obj)
        {
            if ((obj == null) || ! this.GetType().Equals(obj.GetType()))
				return false;
			else
			{
				State state = (State) obj;

				return (this.name.Equals(state.name));
			}
        }

        public override int GetHashCode()
        {
            return this.name.GetHashCode();
        }

        public List<State> GenerateChildren(Dictionary<IState, bool> visited)
        {
            List<State> children = new List<State>();            
            foreach (string childCity in this.GetNeighborNames())
            {
                if(!visited.ContainsKey(childCity)) {
                    graph[childCity].SetParentState(this);
                    children.Add(childCity);
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