/*2static  varibles,2 instance,method,main method*/
public class Main
{
static int a=10;
static int b=20;
int c=30;
int d=40;
static void method1()
{
System.out.println("smethod");
}
static void method2()
{
System.out.println("smethod");
} 
 void method3()
{
System.out.println("imethod");
}
void method4()
{
System.out.println("imethod");
}  
public static void main(String [] args)
{
Main m=new Main();
method1();
method2();
m.method3();
m.method4();
System.out.println(a);
System.out.println(b);
System.out.println(m.c);
System.out.println(m.d);
}
}
