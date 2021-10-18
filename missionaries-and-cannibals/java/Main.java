import java.util.*;

public class Main
{
    public static void main (String args[])
    {
        State initialState = new State(3, 3, "left", 0, 0);

        ArrayList<State> solution = DFS.DFSearch(initialState);

        System.out.println(solution);
    }
}