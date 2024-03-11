import java.util.*;
 class Average{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the limit");
		int a=in.nextInt();
		int b[]=new int[a];
		System.out.println("enter the elements");
		for(int i=0;i<a;i++)
		{
			b[i]=in.nextInt();
		}
		int s=0;
		for(int i=0;i<a;i++)
		{
			s=s+b[i];
		
		
		}
		int average=s/a;
		System.out.println("AVERAGE"+average);
	}
}
		
		
		
