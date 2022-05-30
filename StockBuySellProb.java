package linkedListPra;

import java.util.ArrayList;
import java.util.Scanner;
class Days{
	int sell;
	int buy;
}
public class StockBuySellProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s;
       
        s=sc.nextLine();//Taking input of elements as string
        String srr[]=s.split(" ");
        int n=srr.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=Integer.valueOf(srr[i]);//taking inputs of element in array.
        }
       int profit=find_max(arr,n);
       System.out.println(profit);
        
	}
	static int find_max(int arr[],int n)
	{
		int buy = arr[0], max_profit = 0;
	    for (int i = 1; i < n; i++) {
	 
	        // Checking for lower buy value
	        if (buy > arr[i])
	            buy = arr[i];
	 
	        // Checking for higher profit
	        else if (arr[i] - buy > max_profit)
	            max_profit = arr[i] - buy;
	    }
	    return max_profit;
	}

}
