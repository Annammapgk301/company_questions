package questions;
import java.util.Scanner;
public class decimaltobinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] binary=new int[n];
		int i=0;
		while(n>0)
		{
			binary[i]=n%2;
			n=n/2;
			i++;
		}
for(int j=i-1;j>=0;j--)
{
	System.out.print(binary[j]);
}
	}

}
