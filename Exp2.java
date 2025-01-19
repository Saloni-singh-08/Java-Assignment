public class Exp2{
	public static void main(String[] args){
	
	int a = 4;
	int b = 6;
	int temp;

	System.out.println("\nSWAPPING TWO NUMBERS USING THIRD VARIABLE");
	temp = a;
	a = b;
	b = temp;
	System.out.println("Swapper numbers are a:" +a+ "and b:"+b);
        
	int x = 10;
	int y = 20;
  	System.out.println("\nSWAPPING TWO NUMBERS WITHOUT USING THIRD VARIABLE");
	x = x + y;
	y = x - y;
	x = x - y;
	System.out.println("Swapper numbers are x:" +x+ "and y:"+y);
 }
}