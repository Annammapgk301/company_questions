package questions;
import java.util.Scanner;
public class Nthfibanocci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		a[0]=0;
		if(n>0)
		{
		a[1]=1;
		}
		for(int i=2;i<=n;i++)
		{
			a[i]=a[i-2]+a[i-1];
		}
		
			System.out.println(a[n]+" ");
		

	}

}
