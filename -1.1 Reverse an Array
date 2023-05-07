/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void reverse(int [] ar){
        int low=0;
        int hi=ar.length-1;
        while(low<hi && low!=hi){
            int temp=ar[low];
            ar[low]=ar[hi];
            ar[hi]=temp;
            low++;
            hi--;
        }
        
    }
	public static void main(String[] args) {
		System.out.println("Hello World\n");
		int[] ar={1, 2, 3};
		reverse(ar);
		for(int i=0;i<ar.length;i++){
		    System.out.print(ar[i]+" ");
		}
	}
}
