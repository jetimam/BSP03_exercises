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

                if (next.equals(goalState)) {
                    found = true;
                }
                else {
                    int indexParent = 0;
                    State parentState = new State("Temp", new ArrayList<String>(), new ArrayList<Integer>());
                    for (int i = 0; i < graph.size(); i++) {
                        if (graph.get(i).getName() == next) {
                            parentState = graph.get(i);
                            indexParent = graph.indexOf(graph.get(i));
                        }
                    }

                    for (String n : graph.get(indexParent).getNeighborNames()) { //pushes the children of the state onto the stack
                        int indexChild = 0;
                        for (int i = 0; i < graph.size(); i++) {
                            if (graph.get(i).getName() == n) {
                                indexChild = graph.indexOf(graph.get(i));
                            }
                        }

                        graph.get(indexChild).setParentState(parentState);
                        graph.get(indexChild).setRootCheck(false);
                        System.out.println(graph.get(indexChild).getParentState().getName());
                        toVisit.push(graph.get(indexChild).getName());                        
                    }
                }
            }
        }

        int index;
        if (found) {
            //System.out.println(graph.get(index).getRootCheck());
            while(true) {
                index = getIndexOfState(graph, next);

                if (!graph.get(index).getRootCheck()) {
                    path.add(next);
                    next = graph.get(index).getParentState().getName();
                }
                else {
                    break;
                }

                //System.out.println(path);
            }

            path.add(initialState);

            return path;
        }
        else {
            return path;
        }
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
}