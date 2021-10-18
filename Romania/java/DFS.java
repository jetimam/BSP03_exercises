import java.util.*;

public class DFS {
    private ArrayList<State> graph;

    public DFS (ArrayList<State> graph) {
        this.graph = graph;
    }

    public ArrayList<String> search(String initialState, String goalState) {
        Map<String, Boolean> visited = new HashMap<String, Boolean>(); //list of visited nodes so that we don't get stuck in an infinite loop.
        visited = Initializer.VisitedInitializer(visited); // setting everything to false

        Stack<String> toVisit = new Stack<String>(); // this is the stack that has our frontier

        ArrayList<String> path = new ArrayList<String>();

        boolean found = false;

        String next = ""; //the state that is currently being evaluated. 
        toVisit.push(initialState);

        while (!(toVisit.isEmpty() || found)) {
            next = toVisit.pop();

            if (!visited.get(next)) { // checks if the current nod has been visited.
                visited.replace(next, true);

                if (next.equals(goalState)) {
                    found = true;
                }
                else {
                    int indexParent = getIndexOfState(next);
                    State parentState = graph.get(indexParent);

                    for (String childName : parentState.getNeighborNames()) { //pushes the children of the state onto the stack
                        int indexChild = getIndexOfState(childName);
                        if (!visited.get(childName)) { //avoids creating inf loops with the parentState attribute
                            graph.get(indexChild).setParentState(parentState);
                            graph.get(indexChild).setRootCheck(false);
                            toVisit.push(childName);
                        }
                    }
                }
            }
        }

        if (found) {
            path = backtrack(next, initialState);

            return path;
        }
        else {
            return path;
        }
    }

    public ArrayList<String> backtrack(String next, String initialState) {
        
        ArrayList<String> path = new ArrayList<String>();

        int index;
        while(next != initialState) {
            index = getIndexOfState(next);

            path.add(next);
            next = graph.get(index).getParentState().getName(); 
        }

        path.add(initialState);

        return path;
    }

    public int getIndexOfState(String next) {
        for (int i = 0; i < graph.size(); i++) {
            if (graph.get(i).getName().equals(next)) {
                return i;
            }
        }
        throw new RuntimeException("Unreachable");
    }
}