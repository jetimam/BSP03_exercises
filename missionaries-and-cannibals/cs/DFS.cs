using System;
using System.Collections.Generic;

namespace Missionaries
{
    class DFS
    {
        private IState initialState;

        public DFS(IState initialState)
        {
            this.initialState = initialState;
        }
        
        public List<IState> Search()
        {
            Dictionary<IState, bool> visited = new Dictionary<IState, bool>();

            Stack<IState> toVisit = new Stack<IState>();
            toVisit.Push(initialState);

            bool found = false;

            IState currentState;

            while(toVisit.TryPop(out currentState) && !found)
            {
                visited.Add(currentState, true);
                if(currentState.GoalTest())
                    found = true;
                else
                {
                    foreach(IState child in currentState.GenerateChildren())
                    {
                        if (!visited.ContainsKey(child))
                        {
                            toVisit.Push(child);
                        }
                    }
                }
            }
            if (found)
                return currentState.TrackBack(initialState);
            else
                return new List<IState>();
        }
    }
}