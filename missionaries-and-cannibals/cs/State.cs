using System;
using System.Collections.Generic;

namespace Missionaries
{
	public class State : IState
	{
		private State parentState;

		private int misLeft;
		private int canLeft;
		private int misRight;
		private int canRight;
		private string boat;

		public State(int misLeft, int canLeft, string boat, int misRight, int canRight)
		{
			this.misLeft = misLeft;
			this.canLeft = canLeft;
			this.boat = boat;
			this.misRight = misRight;
			this.canRight= canRight;
		}

		public override string ToString()
		{
        	return (this.misLeft + "|" + this.canLeft + "|" + this.boat + "|" + this.misRight + "|" + this.canRight);
		}

		public override bool Equals(Object obj)
		{
			if ((obj == null) || ! this.GetType().Equals(obj.GetType()))
				return false;
			else
			{
				State state = (State) obj;

				return (state.canLeft == canLeft && state.misLeft == misLeft
						&& state.boat == boat && state.canRight == canRight
						&& state.misRight == misRight);
			}
		}

		public override int GetHashCode()
		{
			return this.misLeft + (10*this.canLeft) + (100*this.boat.GetHashCode());
		}

		public bool IsValid()
		{
			if (misLeft >= 0 && misRight >= 0 && canLeft >= 0 && canRight >= 0 && (misLeft == 0 || misLeft >= canLeft) && (misRight == 0 || misRight >= canRight))
				return true;
			return false;
		}

		public bool GoalTest()
		{
        	return (this.misRight == 3 && this.canRight == 3);
    	}

		public List<State> GenerateChildren()
		{
			List<State> children = new List<State>();

			if (this.boat == "left")
			{
				ChildCheck(children, new State(this.misLeft-2, this.canLeft, "right", this.misRight+2, this.canRight));
				ChildCheck(children, new State(this.misLeft, this.canLeft-2, "right", this.misRight, this.canRight+2));
				ChildCheck(children, new State(this.misLeft-1, this.canLeft-1, "right", this.misRight+1, this.canRight+1));
				ChildCheck(children, new State(this.misLeft-1, this.canLeft, "right", this.misRight+1, this.canRight));
				ChildCheck(children, new State(this.misLeft, this.canLeft-1, "right", this.misRight, this.canRight+1));
			}
			else
			{
				ChildCheck(children, new State(this.misLeft+2, this.canLeft, "left", this.misRight-2, this.canRight));
				ChildCheck(children, new State(this.misLeft, this.canLeft+2, "left", this.misRight, this.canRight-2));
				ChildCheck(children, new State(this.misLeft+1, this.canLeft+1, "left", this.misRight-1, this.canRight-1));
				ChildCheck(children, new State(this.misLeft+1, this.canLeft, "left", this.misRight-1, this.canRight));
				ChildCheck(children, new State(this.misLeft, this.canLeft+1, "left", this.misRight, this.canRight-1));
			}
			return children;
		}

		public void ChildCheck(List<State> children, State child)
		{
			if (child.IsValid())
			{
				child.SetParentState(this);
				children.Add(child);
			}
		}

		public List<State> TrackBack(State initialState)
		{
			List<State> solution = new List<State>();
			State currentState = this;

			while(currentState != initialState)
			{
				solution.Add(currentState);
				currentState = currentState.GetParentState();
			}

			return solution;
		}

		public void SetParentState(State parentState)
		{
			this.parentState = parentState;
		}

		public State GetParentState()
		{
			return this.parentState;
		}
	}
}