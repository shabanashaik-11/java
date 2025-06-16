import java.io.*;
import java.util.Scanner;
public class EqualOrNot
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();
if(a==b)
{
System.out.println("equal");
}
else
{
System.out.println("not equal");
}
}
}