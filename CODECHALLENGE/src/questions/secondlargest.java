package questions;
import java.util.Arrays;
import java.util.Scanner;
public class secondlargest {

	public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		    System.out.println("Enter the size of the array:");
		    int size=s.nextInt();
		    int[] A=new int[size];
		    int i=0;
		    for(i=0;i<size;i++)
		    {
		    System.out.println("Enter the value:");
		    A[i]=s.nextInt();
		    }
		    Arrays.sort(A);
		    System.out.println("Second largest value is:"+A[size-2]);
		}


	}
