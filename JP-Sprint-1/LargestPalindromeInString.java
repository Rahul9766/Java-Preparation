package problem;

public class LargestPalindromeInString {

	public static void main(String[] args) {
		String a= "radar";
		
		String result ="";
		
		for(int i=0;i<=a.length();i++) {
			for(int j=i+1;j<=a.length();j++) {
				
				String temp=a.substring(i,j);
				StringBuffer sb=new StringBuffer();
				String rev= sb.append(temp).reverse().toString();
			
				if(temp.equals(rev) && result.length()< temp.length()) {
					result=temp;
				}
				
				
			}
		}
		
		System.out.println(result);

	}

}
