package newPAck;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int arr[]= {3,5,7,87,53,12,54,82};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		
		System.out.print(arr[1]);

	}

}
