import java.util.Scanner;
public class interest{
	public static void main(String[] args){
	
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter principalamount");
	double principalamount = s.nextDouble();

	System.out.print("Enter rate");
	double rate = s.nextDouble();
	
	System.out.print("Enter time");
	int time = s.nextInt();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = s.nextInt();

        double amount = principalamount * Math.pow((1 + (rate / (n * 100))), n * time);
        double accruedInterest = amount - principalamount;

        System.out.println("Savings Scheme Details");
        System.out.printf("Principal Amount: %.2f\n", principalamount);
        System.out.printf("Accrued Interest: %.2f\n", accruedInterest);
        System.out.printf("Final Amount: %.2f\n", amount);
    }
}