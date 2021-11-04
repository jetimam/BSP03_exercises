using System;
using System.Collections.Generic;

namespace Missionaries
{
	class Missionaries
	{
		static void Main(string[] args)
		{
			State initialState = new State(3, 3, "left", 0, 0);
			
			DFS dfs = new DFS(initialState);
			List<State> solution = dfs.Search();

			Console.WriteLine("Solution found: \n" + solution);
		}
	}
}