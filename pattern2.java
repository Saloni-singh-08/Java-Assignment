import java.util.Scanner;
public class pattern2{
	public static void main(String[] args){
	
	int i,j;
	System.out.println("Enter n");
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	char ch ='A';
	for(i=n;i>=1;i--)
	{
	  for(j=1;j<=i;j++)
	{
	  System.out.print(ch);
	  ch++; 	 
	}
	System.out.println();
     }
}
}