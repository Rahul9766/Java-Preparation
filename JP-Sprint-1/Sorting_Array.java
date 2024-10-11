import java.util.Arrays;

public class Sorting_Array {

  public static void main(String[] args) {
     int arr[] = {2,-4,5,66,9,1,0};
     
     for(int i=0;i<arr.length;i++) {
       for(int j=i+1;j<arr.length;j++) {
         if(arr[i]>arr[j]) {
           arr[i]=arr[i]+arr[j];
           arr[j]=arr[i]-arr[j];
           arr[i]=arr[i]-arr[j];
         }
       }
     }
     
     System.out.println(Arrays.toString(arr));

  }

}
