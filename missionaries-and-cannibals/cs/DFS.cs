using System;
using System.Collections.Generic;

namespace Missionaries
{
    class DFS
    {
        private State initialState;

        public DFS(State initialState)
        {
            this.initialState = initialState;
        }
        
        public bool Search()
        {
            Dictionary<State, bool> visited = new Dictionary<State, bool>();

            Stack<State> toVisit = new Stack<State>();
            toVisit.Push(initialState);

            bool found = false;

            State currentState;

            while(toVisit.TryPop(out currentState) && !found)
            {
                visited.Add(currentState, true);
                if(currentState.GoalTest())
                    found = true;
                else
                {
                    foreach(State child in currentState.GenerateChildren())
                    {
                        if (!visited.ContainsKey(child))
                        {
                            Console.WriteLine(child);
                            toVisit.Push(child);
                        }
                    }
                }
            }

            return found;
        }
    }
}