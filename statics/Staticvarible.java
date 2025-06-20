/* static varible in instance method*/
public class Staticvarible
{
 static int a=100;
 void acces()
{
System.out.print(a);
}
public static void main(String [] args)
{
Staticvarible s=new Staticvarible();
s.acces();
}
}
/* out put
100*/