import java.util.*;

public class DFS
{
    public State DFS(State state)
    {
        if (state.goalTest() == true)
        {
            return state;
        }
        else
        {
            List<State> children = state.generateChildren();
        }
    }
}
