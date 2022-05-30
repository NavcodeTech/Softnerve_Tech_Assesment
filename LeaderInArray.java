package AlgoPra;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class LeaderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();//Taking input for elements as string
        
        String srr[]=s.split(" ");
        int n=srr.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=Integer.valueOf(srr[i]);//taking inputs of element in array.
        }
        ArrayList<Integer> li=new ArrayList<Integer>();
        li=findLeader(arr,n);	
        //System.out.println();
        for(int i=0;i<li.size();i++)
        {
        	System.out.print(li.get(i)+" ");
        }
	}
	public static ArrayList<Integer> findLeader(int arr[],int n)
	{
		ArrayList<Integer> res=new ArrayList<Integer>();
		res.add(arr[n-1]);
		int max=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(max<arr[i])
			{
			res.add(arr[i]);
			max=arr[i];
			}
		}
		Collections.reverse(res);
		return res;
		
	}
	

}
