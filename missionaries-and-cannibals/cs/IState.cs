using System;
using System.Collections.Generic;

namespace Missionaries
{
    public interface IState
    {
        bool GoalTest();

        List<State> GenerateChildren();

        List<State> TrackBack(State state);
    }
}