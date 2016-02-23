/*
 * You are in an infinite 2D grid where you can move in any of the 8 directions :

 	(x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
	You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

	Example :

	Input : [(0, 0), (1, 1), (1, 2)]
	Output : 2
	It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
 */
package Arrays;

import java.util.ArrayList;

public class Reach 
{
	public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) 
	{
		if(X.size()!=Y.size())
			return 0;
		int res=0;
		for(int i=1;i<X.size();i++)
		{
			int absX = Math.abs(X.get(i) - X.get(i-1));
			int absY = Math.abs(Y.get(i) - Y.get(i-1));
			if(absX>absY)
				res +=absX;
			else
				res +=absY;
		}
		return res;
	}
}
