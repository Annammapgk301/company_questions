package questions;
import java.util.Scanner;
public class maxelementarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		if(a[i]>max)
		{
			max=a[i];
		}
System.out.println(max);
	}

	}

