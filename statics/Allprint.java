/*print all static instance variables in main method*/
public class Allprint
{

public static void main(String [] args)
{
 Allprint a=  new Allprint();
static void stmethod()
{
System.out.print("print static");
}
void insmethod()
{
System.out.print("print  instance");
a.insmethod();
}
}
}