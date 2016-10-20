import java.io.*;
class evenodd
{
public static void main(String[] args)
{
try
{
int i;
DataInputStream in=new DataInputStream(System.in);
i=Integer.parseInt(in.readLine());
if((i%2)==0)
{
System.out.println("The number"+i"is even");
}
else if((i%2)!=0)
{
System.out.println("The number"+i"is odd}{
}
}
catch(Exception e)
{
}
}
}
