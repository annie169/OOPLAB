import java.util.*;
class J5_MatrixSymmetric{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter no of rows and columns of Matrices");
int a=sc.nextInt();
int b=sc.nextInt();

int[][] matrix=new int[a][b];
System.out.println("Enter elements of Matrix: ");

for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
matrix[i]
[j]=sc.nextInt();
}}

System.out.println("Matrix formed:");
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
System.out.println(matrix[i][j]+"\t");}
System.out.println();
}

if(a!=b)
{
System.out.println("The given matrix is not a square matrix,hence not symmetric");
}
else
{
boolean symmetric=true;
for(int i=0;i<a;i++)
{
for(int j=0;j<b;j++)
{
if(matrix[i][j]!=matrix[j][i])
{
symmetric=false;
break;
}
}
}

if(symmetric)
{
System.out.println("The given Matrix is Symmetric.");
}
else
{
System.out.println("The given Matrix is not Symmetric.");
}}
}
}

