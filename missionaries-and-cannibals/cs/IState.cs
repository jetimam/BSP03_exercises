using System;
using System.Collections.Generic;

namespace Missionaries
{
    interface IState
    {
        int GetHashCode();

        bool Equals(Object obj);
        
        bool GoalTest();

        List<IState> GenerateChildren();

        List<IState> TrackBack(IState initialState);
    }
}