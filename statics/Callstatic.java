/* call static method in instance methods*/
public class Callstatic
{
static void smethod()
{
System.out.println("start");
}
void  inmethod()
{
smethod();
}
public static void main(String []args )
{
 Callstatic c=new  Callstatic();
c.inmethod();
}
}
/*output
start
*/