import java.util.*;

public class State
{
    State parentState;

    private enum Bank = {LEFT, RIGHT};

    private int misLeft;
    private int canLeft;
    private int misRight;
    private int canRight;
    private Bank boat;

    public State (int misLeft, int canLeft, Bank boat, int misRight, int canRight)
    {
        this.misLeft = misLeft;
        this.canLeft = canLeft;
        this.boat = boat;
        this.misRight = misLeft;
        this.canRight= canRight;
    }

    public boolean isValid()
    {
        return (misLeft >= canLeft &&
                misRight >= canRight &&
                misLeft >= 0 &&
                canLeft >= 0 &&
                misRight >= 0 &&
                canRight >= 0);
    }

    public boolean goalTest()
    {
        return (misRight == 3 && canRight == 3);
    }

    public List<State> generateChildren()
    {
        List<State> children = new ArrayList<State>();

        if (boat == Bank.LEFT)
        {
            childCheck(children, new State(this.misLeft-2, this.canLeft, RIGHT, this.misRight+2, this.canRight))
        }
        else
        {

        }
    }

    public void childCheck(List<State> children, State child)
    {
        if (child.isValid())
        {
            child.setParent(this);
            children.add(child);
        }
    }

    public void setParent(State parentState)
    {
        this.parentState = parentState;
    }
}