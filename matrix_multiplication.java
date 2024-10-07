import java.util.*;
class mat_mul
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the matrix");
n=sc.nextInt();
int mat1[][]=new int[n][n];
int mat2[][]=new int[n][n];
int res[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("enter value of matrix1 for"+i+","+(j+1)+":");
mat1[i][j]=sc.nextInt();
}
System.out.println(" ");
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("enter value of matrix2 for"+i+","+(j+1)+":");
mat2[i][j]=sc.nextInt();
}
System.out.println(" ");
}


//printing here
System.out.println("MATRIX 1\n\t");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("\t"+mat1[i][j]);
}
}
System.out.println("MATRIX 2\n\t");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("\t"+mat2[i][j]);
}
}


//performing the multiplication here
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
res[i][j] = 0;
for (int k = 0; k < n; k++) {
res[i][j] += mat1[i][k] * mat2[k][j];
}
}
}


//displaying here
System.out.println("result matrix\n\t");
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("\t"+res[i][j]);
}
}




}
}
