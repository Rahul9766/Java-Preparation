public class Sum_Elements_Array {

  public static void main(String[] args) {
    int arr[] = {2,-4,5,66,9,1,0};
     int sum=0;
     
     for(int i=0;i<arr.length;i++) {
       sum+=arr[i];
       
     }
     System.out.println("Sum of array is: "+sum);
  }

}
