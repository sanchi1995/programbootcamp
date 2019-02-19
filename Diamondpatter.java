class Diamondpattern
{
public static void main(String args[])
{
int n=5;
for(int i=1;i<=n;i++)
{
for(int j=i;j<n;j++)
{
System.out.println(" ");
}
for(k=1;k<2*i;k++)
{
System.out.println("*");
}
}
