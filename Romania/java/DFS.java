import java.util.*;

public class DFS {
    private Map<String, State> graph;

    public DFS(Map<String, State> graph) {
        this.graph = graph;
    }

    public ArrayList<String> search(String initialState, String goalState) {
        Map<String, Boolean> visited = new HashMap<String, Boolean>();
        Stack<String> toVisit = new Stack<String>(); //frontier
        boolean found = false;
        String currentCity = "";
        toVisit.push(initialState);

        while(!(toVisit.isEmpty() || found)) {
            currentCity = toVisit.pop();
            visited.put(currentCity, true);

            if(currentCity.equals(goalState))
                found = true;
            else
                generateChildren(visited, toVisit, currentCity);
        }
        if(found)
            return trackBack(currentCity, initialState);
        else
            return new ArrayList<String>();
    }

    public void generateChildren(Map<String, Boolean> visited, Stack<String> toVisit, String currentCity) {
        State currentState = graph.get(currentCity);

        for(String childCity : currentState.getNeighborNames()) {
            if(!visited.containsKey(childCity)) {
                graph.get(childCity).setParentState(currentState);
                toVisit.push(childCity);
            }
        }
    }

    public ArrayList<String> trackBack(String currentCity, String initialState) {
        ArrayList<String> path = new ArrayList<String>();

        while(currentCity != initialState) {
            path.add(currentCity);
            currentCity = graph.get(currentCity).getParentState().getName(); 
        }
        path.add(initialState);

        return reverseList(path);
    }

    public ArrayList<String> reverseList(ArrayList<String> path) {
		ArrayList<String> output = new ArrayList<String>();

		for (int i = path.size()-1; i >= 0; i--) {
			output.add(path.get(i));
		}

		return output;
	}
}