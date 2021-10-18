import java.util.*;

public class State {
    State parentState;

    private int misLeft;
    private int canLeft;
    private int misRight;
    private int canRight;
    private String boat;

    public State (int misLeft, int canLeft, String boat, int misRight, int canRight) {
        this.misLeft = misLeft;
        this.canLeft = canLeft;
        this.boat = boat;
        this.misRight = misLeft;
        this.canRight= canRight;
    }

    @Override
    public String toString() {
        return (this.misLeft + "|" + this.canLeft + "|" + this.boat + "|" + this.misRight + "|" + this.canRight);
    }

    public boolean isValid() {
        return (this.misLeft == 0 || this.misLeft >= this.canLeft &&
                this.misRight == 0 || this.misRight >= this.canRight &&
                this.misLeft >= 0 &&
                this.canLeft >= 0 &&
                this.misRight >= 0 &&
                this.canRight >= 0);
    }

    public boolean goalTest() {
        return (this.misRight == 3 && this.canRight == 3);
    }

    public ArrayList<State> backtrack(State initialState) {
        ArrayList<State> solution = new ArrayList<State>();
        State next = this;

        while (next != initialState) {
            System.out.println("backtracking");
            solution.add(next);
            next = next.getParentState();
        }

        return solution;
    }

    public ArrayList<State> generateChildren() {
        ArrayList<State> children = new ArrayList<State>();

        if (this.boat == "left") {
            childCheck(children, new State(this.misLeft-2, this.canLeft, "right", this.misRight+2, this.canRight));
            childCheck(children, new State(this.misLeft, this.canLeft-2, "right", this.misRight, this.canRight+2));
            childCheck(children, new State(this.misLeft-1, this.canLeft-1, "right", this.misRight+1, this.canRight+1));
            childCheck(children, new State(this.misLeft-1, this.canLeft, "right", this.misRight+1, this.canRight));
            childCheck(children, new State(this.misLeft, this.canLeft-1, "right", this.misRight, this.canRight+1));
        }
        else {
            childCheck(children, new State(this.misLeft+2, this.canLeft, "left", this.misRight-2, this.canRight));
            childCheck(children, new State(this.misLeft, this.canLeft+2, "left", this.misRight, this.canRight-2));
            childCheck(children, new State(this.misLeft+1, this.canLeft+1, "left", this.misRight-1, this.canRight-1));
            childCheck(children, new State(this.misLeft+1, this.canLeft, "left", this.misRight-1, this.canRight));
            childCheck(children, new State(this.misLeft, this.canLeft+1, "left", this.misRight, this.canRight-1));
        }
        return children;
    }
    public void childCheck(ArrayList<State> children, State child) {
        if (child.isValid())
        {
            child.setParent(this);
            children.add(child);
        }
    }

    public void setParent(State parentState) {
        this.parentState = parentState;
    }

    public State getParentState() {
        return this.parentState;
    }
}