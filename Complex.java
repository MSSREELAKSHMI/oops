import java.util.*;
class Complex
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the real and imaginary part of 1st complex number:");
	int a=s.nextInt();
	int b=s.nextInt();
System.out.println("enter the real and imaginary part of 2nd complex number:");
	int c=s.nextInt();
	int d=s.nextInt();
System.out.println("complex numbers are:\n"+a+"+i"+b+"and"+c+"+i"+d);
	int p=a+c;
	int f=b+d;
System.out.println("added complex no is:"+p+"+i"+f);
}
}		
