using System;
using System.Collections.Generic;

namespace Romania
{
    class State
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