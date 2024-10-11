package problem;

public class MedianOfArray {

	public static void main(String[] args) {
		int arr[]= {1,3,5,6,8,7,4,2,9,10,11};
		int mid=(int) Math.round((double) arr.length/2);
		for(int i=0;i<mid;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.print(arr[mid-1]);

	}

}
