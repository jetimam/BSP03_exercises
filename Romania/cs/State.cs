using System;

public class State
{
	private State parentState;
	
	private string name;
	private List<string> neighborNames;
	private List<int> neighborDistances;

	public State(string name, List<string> neighborNames, List<int> neighborDistances)
	{
		this.name = name;
		this.neighborNames = neighborNames;
		this.neighborDistances = neighborDistances;
	}

	public override string ToString()
	{
		string str = "";

		return str;
	}

	public string getName()
	{
		return this.name;
	}
}