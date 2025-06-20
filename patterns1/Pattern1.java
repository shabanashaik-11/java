/*public class Pattern1
{
public static void main(String [] args)
{
for( int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print("*");
}
System.out.println("*");
}
}
}*/
/*public class Pattern2
{
public static void main(String [] args)
{
for( int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(i);
}
System.out.println( );
}
}
}*/

/*public class Pattern3
{
public static void main(String [] args)
{
for( int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}*/


/*public class Pattern4
{
public static void main(String [] args)
{
int a=1;
for( int i=1;i<6;i++)
{
for(int j=0;j<6;j++)
{
System.out.print( a +" ");
a++;
}
System.out.println( );
}
}
}*/


/*public class Pattern5
{
public static void main(String [] args)
{
int a=1;
for( int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print( a +" ");
a++;
if(a==10)
{
a=1;
}
}
System.out.println( );
}
}
}*/


/*public class Pattern6
{
public static void main(String [] args)
{
int a=1;
for( int i=1;i<5;i++)
{
for(int j=1;j<5;j++)
{

System.out.print( a+" ");
a++;
a++;
}
}
System.out.println( );
}
}*/


/*public class Pattern7
{
public static void main(String [] args)
{
int a=1;
for( int i=1;i<6;i++)
{
for(int j=1;j<6;j++)
{
if(j%2==0)
{
System.out.print(0 +" " );
}
else
{
System.out.print(1 +" " );
}
}
System.out.println( );
}
}
}*/


/*public class Pattern8
{
   public static void main(String [] args)
    {
       for( int i=1;i<=5;i++)
    {
      for(int j=1;j<=5;j++)
    {
if(j<=5 -i)
{
       System.out.print(" ");
}
else
 {
   System.out.print("* " );
  }
}
System.out.println( );
}
}
}*/



public class Pattern10
{
   public static void main(String [] args)
    {
       for( int i=1;i<=5;i++)
    {
      for(int j=1;j<=5-i;j++)
     {
    System.out.print(" ");
}

for(int k=1;k<=i;k++){
       System.out.print((2*k)+ " ");
}
 
   System.out.println();
  }
}
}




