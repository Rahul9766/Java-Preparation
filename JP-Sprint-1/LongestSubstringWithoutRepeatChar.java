package newPAck;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatChar {

	public static void main(String[] args) {
		String string="abcabcbbabcddb";
		String longestSubstring=null;
		int longestSubstringLength=0;
		Map <Character,Integer> map= new LinkedHashMap<>();
	
		char arr[]=string.toCharArray();
		
		for(int i=0;i<arr.length;i++) 
		{
			char ch=arr[i];
			
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}
			else
			{
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>longestSubstringLength) 
			{
				longestSubstringLength=map.size();
				longestSubstring=map.keySet().toString();
			}
			
			
		}
	
		System.out.println(longestSubstringLength);
		System.out.println(longestSubstring);

	}

}
