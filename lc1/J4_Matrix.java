import java.util.*;
class J4_Matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter no of rows and columns of Matrices");
int a=sc.nextInt();
int b=sc.nextInt();

int m1[][]  = new int[a][b];
int m2[][]  = new int[a][b];
int sum[][] =new int[a][b];

System.out.println("Enter elements of matrix1: ");

for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
m1[i]
[j]=sc.nextInt();
}}


System.out.println("Enter elements of matrix2: ");

for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
m2[i]
[j]=sc.nextInt();

}}


//System.out.println("Matrix Addition: ");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
sum[i][j]=m1[i][j]+m2[i][j];
}}


System.out.println("Matrix1 :");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.println(m1[i][j]+"\t");}
System.out.println();
}

System.out.println("Matrix2 :");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.println(m2[i][j]+"\t");}
System.out.println();
}

System.out.println("Sum of two matrixes :");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.println(sum[i][j]+"\t");}
System.out.println();
}
}
}



