/* instsnce varible in static method*/
public class Instancevarible
{
int a=10;
static void acces()
{
 Instancevarible i=new  Instancevarible();
System.out.print(i.a);
}
public static void main(String [] args)
{
acces();
}

}
/* out put
10*/