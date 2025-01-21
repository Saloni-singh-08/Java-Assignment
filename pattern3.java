import java.util.Scanner;
public class pattern3{
	public static void main(String[] args){
	
	int i,j;
	System.out.println("Enter n");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int num=1;
	for(i=1;i<=n;i++)
	{
	  for(j=n;j>=n-i+1;j--)
	{
	  System.out.print(num);	 
	}
	num++;
	System.out.println();
     }
}
}