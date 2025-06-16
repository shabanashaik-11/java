import java.io.*;
import java.util.Scanner;
public class SmallOrLarge
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();
if(a<b)
{
System.out.println("a is small b is large");
}
else
{
System.out.println("b is small a is large");
}
}
}