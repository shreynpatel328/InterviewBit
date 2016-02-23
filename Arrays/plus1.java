/*
 * Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.
Simple test cases to lookout for -  no starting 0's allowed
/*              a.add(1);
		a.add(2);
		a.add(4);
		*//*
		a.add(1);
		a.add(2);
		a.add(9);
		*//*
		a.add(2);
		a.add(9);
		a.add(9);*/
		/*
		a.add(9);
		a.add(9);
		a.add(9);
		//*/
		/*a.add(0);
		a.add(0);
		a.add(1);
 */
package Arrays;

import java.util.ArrayList;

public class plus1 
{
	
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) 
	{
	    int len = a.size()-1;
		for(int i=0;i<len;i++)
		{
			if(a.get(i)==0)
			{
				a.remove(i);
				i--;
			}
			else
				break;
		}
		len = a.size()-1;
		int carry=0;
		for(int i=len;i>=0;i--)
		{
			if(a.get(i)==9)
			{
				a.set(i,0);
				carry=1;
				continue;
			}
			else
			{
				a.set(i, a.get(i)+1);
				carry=0;
				break;
			}
				
		}
		if(carry==1)
		{
			ArrayList<Integer> b = new ArrayList();
			b.add(carry);
			for(int i=0;i<a.size();i++)
				b.add(a.get(i));
			return b;
		}
		
		return a;	
	    
	}

	/* Another possible solution*/
	
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    int c=0;
	   
	    int k=1;
	    while(c==0 && a.get(0)==0 && k<a.size())
	    {
	    	if(a.get(k)==9)
	    	{
	    		k++;
	    		continue;
	    	}
	    	else
	    	{
	    		a.remove(0);
	    		if(a.get(0)==0 || a.get(0)==9)
	    			continue;
	    		else
	    			break;
	    	}
	    	
	    }
	    for(int i=a.size()-1;i>=0;i--)
	    {
	        if(i==0)
	        {
	            if(a.get(i)==9)
	            {
	                a.set(i,0);
	                ArrayList<Integer> arr = new ArrayList<Integer>();
	                arr.add(1);
	                for(int j=1;j<=a.size();j++)
	                {
	                    arr.add(a.get(j-1));
	                }
	                return arr;
	            }
	            
	        }
	        
	        if(a.get(i)==9)
	        {
	            a.set(i,0);
	            c=1;
	            continue;
	        }
	        else if(a.get(i)<9)
	        {
	            int value = a.get(i);
	            a.set(i,++value);
	            i=1;
	            break;
	        }
	        
	        
	    }
	    return a;
	}
	
	
	
}
