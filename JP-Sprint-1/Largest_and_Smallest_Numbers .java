public class Largest_and_Smallest_Numbers {

  public static void main(String[] args) {
    
     int arr[] = {2,-4,5,66,9,1,0};
     int sNum=0;
     int lNum=0;
     
     for(int i=0;i<arr.length;i++) {
       
       if(arr[i]>lNum) {
         lNum=arr[i];
       }
       if(arr[i]<sNum) {
         sNum=arr[i];
       }
       
     }
     
     System.out.print("Largest Num: "+lNum+" Smallest Num: "+sNum);

  }

}
