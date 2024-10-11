import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumbersInRange {

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    
    int range=sc.nextInt();
    List <Integer> arr=new ArrayList<>();
    
    for(int i=1;i<=range;i++) {
      int temp=i;
      int arm=0;
      while(temp>0) {
        int remainder=temp%10;
        arm+=remainder*remainder*remainder;
        temp=temp/10;
      }
      
      if(arm==i) {
        arr.add(i);
      }
    }
    
    System.out.println(arr);

  }

}
