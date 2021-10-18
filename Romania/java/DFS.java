import java.util.*;

public class DFS {
    public static ArrayList<String> DFSearch(ArrayList<State> graph, String initialState, String goalState) {
        Map<String, Boolean> visited = new HashMap<String, Boolean>(); //list of visited nodes so that we don't get stuck in an infinite loop.
        visited = Initializer.VisitedInitializer(visited); // setting everything to false

        Stack<String> toVisit = new Stack<String>(); // this is the stack that has our frontier

        ArrayList<String> path = new ArrayList<String>();

        boolean found = false;

        String next = ""; //the state that is currently being evaluated. THE BACKTRACKING ISSUE IS HAPPENING BECAUSE NEXT ISNT GLOBAL FOR SOME REASON

        toVisit.push(initialState);

        while (!(toVisit.isEmpty() || found)) {
            next = toVisit.pop();

            if (!visited.get(next)) { // checks if the current nod has been visited.
                visited.replace(next, true);
                //System.out.println(next);

                if (next.equals(goalState)) {
                    System.out.println("found");
                    found = true;
                }
                else {
                    int indexParent = getIndexOfState(graph, next);
                    State parentState = getState(graph, next);

                    for (String childName : graph.get(indexParent).getNeighborNames()) { //pushes the children of the state onto the stack
                        int indexChild = getIndexOfState(graph, childName);

                        if (!visited.get(childName)) { //avoids creating inf loops with the parentState attribute

                            graph.get(indexChild).setParentState(parentState);
                            graph.get(indexChild).setRootCheck(false);

                            System.out.println(parentState.getName() + ": " + childName);

                            toVisit.push(graph.get(indexChild).getName());
                        }
                    }
                }
            }
        }

        if (found) {
            path = backtrack(graph, next, initialState);

            return path;
        }
        else {
            return path;
        }
    }

    public static ArrayList<String> backtrack(ArrayList<State> graph, String next, String initialState) {
        
        ArrayList<String> path = new ArrayList<String>();

        int index;
            //System.out.println(graph.get(index).getRootCheck());
            while(next != initialState) {
                index = getIndexOfState(graph, next);

                path.add(next);
                next = graph.get(index).getParentState().getName();
                //System.out.println(next);
            }

            path.add(initialState);

            return path;
    }

    public static int getIndexOfState(ArrayList<State> graph, String next) {
        int index = 0;

        for (int i = 0; i < graph.size(); i++) {
            if (graph.get(i).getName() == next) {
                index = graph.indexOf(graph.get(i));
            }
        }
        
        return index;
    }

    public static State getState(ArrayList<State> graph, String next) {
        State parentState = new State("Temp", new ArrayList<String>(), new ArrayList<Integer>());

        for (int i = 0; i < graph.size(); i++) {
            if (graph.get(i).getName() == next) {
                parentState = graph.get(i);
            }
        }
        
        return parentState;
    }
}