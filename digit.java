import java.util.Scanner;
public class digit{
	public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);

	System.out.println("Enter a number");
	int n = s.nextInt();

	int count = 0, count1 = 0;

	while(n!=0)
	{
	 int digit=n%10;
	 if(digit%2 == 0)
	  {
	   count=count+digit;
	  }
	 else {
	count1 = count1+digit;
	}
	n=n/10;
}

	System.out.println("Sum of even digits is:" +count);
	System.out.println("Sum of odd digits is:" +count1);
}
}
	  
	