package problem;
import java.util.Map;
import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		String string1 = "listen";
		String string2 = "silent";
		boolean flag=true;
		
		Map <Character,Integer> countMap = new HashMap<>();
		Map <Character,Integer> countMap1 = new HashMap<>();
		
		
		if(string1.length()==string2.length()) 
		{
			for(char c: string1.toCharArray()) {
				if(countMap.get(c)==null)
					countMap.put(c,1 );
				else
					countMap.put(c, countMap.get(c)+1);
				
			}
			
			for(char c: string2.toCharArray()) {
				if(countMap1.get(c)==null)
					countMap1.put(c,1 );
				else
					countMap1.put(c, countMap1.get(c)+1);
				
			}
			
			for(char c: string2.toCharArray()) 
			{
				if(countMap1.get(c)!=countMap.get(c)) 
				{
					System.out.print("Not Anagram");
					flag=false;
					break;
					
				}
				
			}
			
			if(flag)System.out.print(" Anagram");
			
		}
		
		else {
			System.out.print("Not Anagram");
		}
		
		
		
		
	
			
			
	
		
		
		
		
		
		
		
 
	}

}
