package newPAck;

import java.util.HashMap;
import java.util.Map;

public class ModeofNumbersArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,4,3,4,7,3,4,7};
		int result=0;
		int count=0;
		Map <Integer,Integer> modeMap= new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(modeMap.get(arr[i])== null) {
				modeMap.put(arr[i], 1);
			}
			else {
				modeMap.put(arr[i],modeMap.get(arr[i])+1);
			}
		}
		
		for(int i:modeMap.keySet()) {
			if(count<modeMap.get(i)) {
				count=modeMap.get(i);
				result=i;
				
			}
		}
		
		System.out.println(result);
		

	}

}
