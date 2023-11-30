/*
In a browsing center, the owner accepts the next day's browsing slot booking from N customers via internet. Each browsing slot contains the start time and the end time in 26- the format. The browsing center owner must have at least M computers so that no one is waiting. The browsing solt of N customers are passed as the input. The program must print the minimum number of computers M so that no one is waiting in the center.

Boundary Condition(s): 
	1 <= N <= 10^5

Input Format:
	The first line contains N. The next N lines, each containing the start time and the end time of a browsing slot.

Output Format: 
	The first line contains M.

Example Input/Output 1:
	Input
		6
		9:00 11:00
		9:30 10:30
		9:30 12:00
		9:45 13:00
		11:00 15:00
		10:00 14:00
	Output:
		5
	Explanation:
		The browsing center owner must have at least 5 computers so that no one is waiting. At 10:00, there must be at least 5 computers.

Example Input/Output 2:
	Input:
		6
		9:00 15:00
		10:00 10:30
		11:00 13:00
		13:00 14:00
		14:30 15:00
		14:30 16:00
	Output:
		3
*/

import java.util.*;

public class Hello
{
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in); 
		int n=sc.nextInt(); sc.nextLine(); 
		List<Integer> start=new ArrayList<>(); 
		List<Integer> end=new ArrayList<>(); 
		for(int ctr=1; ctr<=n; ctr++)
		{ 
			String slot[]=sc.nextline().split("\\s+"); 			start.add(toMins(slot[0]));
			end.add(toMins(slot[1])); 
		}
		int computer=0,stindex=0, endindex=0; 				Collections.sort(start); 
		Collections.sort(end); 
		while(stindex<start.size() && endindex<end.size())
		{
			int cur=Math.abs(stindex-endindex)+1; 
			if(cur>computer)
			{ 
				computer=cur;
			} 
			if(start.get(stindex) <end.get(endindex))
			{
				stindex++;
			}
			else
			{
				endindex++;
			}
			while(stindex<start.size() && endindex<end.size() && start.get(stindex)>=end.get(endindex))
			{
				endindex++;
			} 
		}
		System.out.println(computer);
	}
	pivate static int toMins(String time)
	{
		String hm[]=time.split(":");
		int h=Integer.parseInt(hm[0]);
		int m=Integer.parseInt(hm[1]);
		return h*60+m;
	}
}