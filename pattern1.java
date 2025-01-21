public class pattern1{
	public static void main(String[] args){
	
	int i,j;
	for(i=1;i<=8;i++)
	{
	 if(i%2==0)
	 {
	  for(j=1;j<=i-1;j++)
	    {
	     System.out.print("*");
	    }	
	 }
	else
	{
	 System.out.print("*");
	}
	
	 System.out.println();
        }	
	
    }
}

	