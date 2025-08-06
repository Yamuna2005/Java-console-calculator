package calculator.java;
import java.util.Scanner;

public class Java_Calculator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean continueCalculation=true;
		while(continueCalculation) {
			System.out.println("choose an operation:");
			System.out.println("1.Addition(+)");
			System.out.println("2.Subraction(-)");
			System.out.println("3.Multiplication(*)");
			System.out.println("4.Division(/)");
			System.out.println("5.Exit");
			System.out.print("Enter your choice(1/2/3/4/5:");
			int choice=scanner.nextInt();
			if(choice==5) {
				continueCalculation=false;
				
			}else if(choice >=1 && choice <=4) {
				System.out.print("Enter the first number: ");
				double num1=scanner.nextDouble();
				System.out.print("Enter the second number: ");
				double num2=scanner.nextDouble();
				
				switch(choice) {
				case 1:
					System.out.println("Result:" + (num1 + num2));
					break;
				case 2:
					System.out.println("Result:" + (num1 - num2));
					break;
				case 3:
					System.out.println("Result:" + (num1 * num2));
					break;
				case 4:
					if(num2!=0) {
							System.out.println("Result:" + (num1 / num2 ));
						}else {
							System.out.println("Error division by zero is not allowed");
						}
						break;
						
					}
				  }else {
					  System.out.println("invalid choice please choose a valid option");
				  }
					
				}
		        scanner.close();
	}
}
			
			
					
		
		



