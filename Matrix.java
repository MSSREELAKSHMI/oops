import java.util.*;
	class Matrix{
		public static void main(String[] args)
		{
		Scanner m=new Scanner(System.in);
		System.out.println("enter the limit:");
		int n=m.nextInt();
		int a[][]=new int [n][n];
		int b[][]=new int [n][n];
		int c[][]=new int [n][n];
		System.out.println("enter the matrix 1:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=m.nextInt();
			}
		}	
		System.out.println("enter the matrix 2:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				b[i][j]=m.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("sum of  matrix :");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(c[i][j]+"\t ");	
			}
		System.out.print("\n");	
		}
		}
}		
