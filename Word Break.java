/*
The program must accept two string values $1 and S2 as the input. The string S1 contains a list of words separated by a space. The string S2 contains the words from the string S1 without any space. The program must break the string S2 into the words as in S1 and print all the possible word breaks as shown in the Example Input/Output section.

Boundary Condition(s): 
	1 <= Length of S1, S2 <= 1000

Input Format:
	The first line contains the string S1. The second line contains the string S2.

Output Format:
	The lines contain all the possible word breaks in S2 as shown in the Example Input/Output section.

Example Input/Output 1:
	Input
		hot box hotbox
		hotboxhotbox
	Output
		hot box hot box
		hot box hotbox
		hotbox hot box
		hotbox hotbox

Example Input/Output 2:
	Input:
		t h i s th hi is thi his this 
		this
	Output:
		t h i s
		t h is
		t hi s
		t his
		th i s
		th is
		thi s
		this
*/

import java.util.*;

public class Hello
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String words[]=sc.nextLine().split("\\s+"); 
		String str=sc.nextLine();
		List<String> wordlist=Arrays.asList(words); 
		breakword (wordlist, str, "", 0);
	} 
	private static void breakword (List<String> wordsli, String str, String output, int start)
	{ 
		if(start= str.length())
		{ 
			System.out.println(output.trim()); 
			return;
		}
	}
	for(int i=start;i<str.length();i++) 
	{
		String word str.substring(start,i+1); 							if(wordslist.contains(word))
		{ 
			breakword(wordslist, str, output word+" ",i+1);
		}
	}
}
