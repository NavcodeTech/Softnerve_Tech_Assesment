package linkedListPra;

import java.util.Scanner;

public class XorSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s;
       
        s=sc.nextLine();//Taking input for size of array
        String srr[]=s.split(" ");
        int n=srr.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=Integer.valueOf(srr[i]);//taking inputs of element in array.
        }
        
        long sum=find_sum(arr,n);
        System.out.println(sum);
	}
	static long find_sum(int arr[],int n)
	{
		long sum=0;
	       for(int i=0;i<n;i++){
	           for(int j=i+1;j<n;j++){
	               sum+=(arr[i]^arr[j]);
	           }
	       }
	       int u=0;
	       for(int g:arr)
	       {
	    	   u=u+g;
	       }
	       return sum+u;
	}

}
