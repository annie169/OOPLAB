import java.io.*;
import java.util.Scanner;

class J7_Complex
{
int real;
int img;
public void getNum()
{
Scanner br=new Scanner(System.in);
System.out.println("Real part: ");
real=Integer.parseInt(br.nextLine());

System.out.println("Imaginary part: ");
img=Integer.parseInt(br.nextLine());
}

public static J7_Complex sum(J7_Complex c1,J7_Complex c2)
{
J7_Complex temp=new J7_Complex();
temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}

public static void main(String[] args) throws IOException
{
J7_Complex c1=new J7_Complex();

System.out.println("Enter First Complex Number ");
c1.getNum();

J7_Complex c2=new J7_Complex();
System.out.println("Enter Second Complex Number ");
c2.getNum();

J7_Complex temp=sum(c1,c2);
System.out.println("( "+c1.real+" + "+c1.img+"i ) + ( "+c2.real+" + "+c2.img+"i ) = "+temp.real+" + " +temp.img+"i");
}
}

