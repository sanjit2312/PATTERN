package pattern;

import java.util.Scanner;

public class No_1
{

	public static void main(String[] args) 
	{

		int n;
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		
		obj.close();
	}

}
