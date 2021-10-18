import java.util.*;

public class DFS {
    public static ArrayList<State> DFSearch(State initialState) {
        Map<State, Boolean> visited = new HashMap<State, Boolean>();

        Stack<State> toVisit = new Stack<State>();
        toVisit.push(initialState);

        boolean found = false;

        State next = initialState;

        while(!(toVisit.isEmpty() || found)) {
            next = toVisit.pop();
            System.out.println("popping the stack");

            if (!visited.containsKey(next)) {
                visited.put(next, true);

                if (next.goalTest()) {
                    found = true;
                }
                else {
                    for (State child : next.generateChildren()) {
                        if (!visited.containsKey(child)) {
                            System.out.println("Generating children");
                            System.out.println(child);

                            toVisit.push(child);
                        }
                    }
                }
            }

        }

        return next.backtrack(initialState);

    }
}
