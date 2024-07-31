package test;
import java.util.Scanner;

public class Driver {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	  
	        System.out.print("Enter the present value: ");
	        double initialAmount = sc.nextDouble();

	        System.out.print("Enter the annual growth rate: ");
	        double annualRate = sc.nextDouble();

	        System.out.print("Enter the number of year(s)"
	        		+ ": ");
	        int years = sc.nextInt();

	        double futureValue = Predictiveprog.computeFutureValue(initialAmount, annualRate, years);

	        System.out.printf("The future value after %d years is: %.2f%n", years, futureValue);

	        sc.close();
	    }


}
