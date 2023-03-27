
import java.util.Scanner;
class Matrix
{
public static void main(String args[])
{
Scanner input=new
Scanner(System.in);
System.out.println("enter the number of rows");
int row=input.nextInt();
System.out.println("enter the number of columns");
int col=input.nextInt();
int[][]x=new int[row][col];
int[][]y=new int[row][col];
System.out.println("enter the first matrix");
for(int m=0;m<row;m++)
{
for(int n=0;n<col;n++)
{
x[m][n]=input.nextInt();
}
}
System.out.println("enter the second matrix");
for(int m=0;m<row;m++)
{
for(int n=0;n<col;n++)
{
y[m][n]=input.nextInt();
}
}
int[][]z=new int[row][col];
for(int m=0;m<row;m++)
{
for(int n=0;n<col;n++)
{
z[m][n]=x[m][n]+y[m][n];
}
}
System.out.println("addition of 2 matrix");
for(int m=0;m<row;m++)
{
for(int n=0;n<col;n++)
{
System.out.println(z[m][n]+" ");
}
System.out.println();
}
}
}
~
