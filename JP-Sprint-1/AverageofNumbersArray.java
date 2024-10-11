package newPAck;

public class AverageofNumbersArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int result=0;
		int l=arr.length;
		for(int i=0;i<l;i++) {
			result+=arr[i];
		}
		
		System.out.println("Average : "+ result/l);

	}

}
