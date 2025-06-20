/* call instance method in static methods*/
public class Callinstance
{
void instancemethod()
{
System.out.println("instance");
}
static void  staticmethod()
{
Callinstance c=new Callinstance();
System.out.println("static");
c. instancemethod();
}
public static void main(String []args )
{
staticmethod();
}
}
/*output
static
instance*/