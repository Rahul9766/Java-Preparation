package problem;

public class MissingNumbers {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,10};
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]!=arr[i]+1) {
				System.out.println(arr[i]+1);
			}
			
			
		}
	}

}
