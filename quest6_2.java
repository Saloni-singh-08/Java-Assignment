import java.util.ArrayList;
import java.util.Scanner;

class quest6_2 {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static int multiply(int[] numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num; 
        }
        return result;
    }public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number (Press * to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("*")) {
                break;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or * to stop.");
                }
            }
        }

       
        if (numbers.size() == 2) {
            
            int result = multiply(numbers.get(0), numbers.get(1));
            System.out.println("Method for 2 numbers called- (Result)- " + result);
        } else if (numbers.size() == 3) {
           
            int result = multiply(numbers.get(0), numbers.get(1), numbers.get(2));
            System.out.println("Method for 3 numbers called- (Result)- " + result);
        } else if (numbers.size() > 3) {
           
            int[] numbersArray = numbers.stream().mapToInt(i -> i).toArray();
            int result = multiply(numbersArray);
            System.out.println("Method for multiple numbers called- (Result)- " + result);
        } else {
            System.out.println("Not enough numbers to perform multiplication.");
        }

        scanner.close();
    }
}