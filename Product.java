import java.util.*;
class Lowest
{
int code,price;
String name;

Lowest(String name,int code,int price)
{
this.name=name;
this.code=code;
this.price=price;
}
void display()
{
System.out.println("name="+name);
System.out.println("code="+code);
System.out.println("price="+price);
System.out.println();
}
}
class Product
{
static void low(Lowest p1,Lowest p2,Lowest p3)
{
if(p1.price<p2.price && p1.price<p3.price)
{
System.out.println(p1.name+" is the Lowest with price: "+p1.price);
}
else if(p2.price<p1.price && p2.price<p3.price)
{
System.out.println(p2.name+" is the Lowest with price: "+p2.price);
}
else
{
System.out.println(p3.name+" is the Lowest with price: "+p3.price);
}
}
public static  void main(String args[])
{


Lowest p1=new Lowest("rice",1211122,250);
Lowest p2=new Lowest("brush",121112233,25);
Lowest p3=new Lowest("paste",121112255,50);
p1.display();
p2.display();
p3.display();

low(p1,p2,p3);

}



}
	

