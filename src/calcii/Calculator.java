package calcii;

import java.util.Scanner;

class Calc {

	public static void calci() {
		   
      
		 Scanner scanner = new Scanner(System.in);
		  System.out.println("Calculator Enter the numbers and Choose your Operation");
		
          System.out.print("Enter first number: ");
          double num1 = scanner.nextDouble();
          
          System.out.print("Enter second number: ");
          double num2 = scanner.nextDouble();

          System.out.println("Select operation:");
          System.out.println("1. Add");
          System.out.println("2. Subtract");
          System.out.println("3. Multiply");
          System.out.println("4. Divide");
       
          int operator = scanner.nextInt();
          double result=0;
          switch (operator) {
              case 1:
                  result = num1 + num2;
                  break;
              case 2:
                  result = num1 - num2;
                  break;
              case 3:
                  result = num1 * num2;
                  break;
              case 4:
            	  result = num1 / num2;
            	  break;
              default:
                  System.out.println("Please choose a valid option.");
                  calci();
            	  }
      
 
          System.out.println("Result: " + result);
        
              System.out.print("Do you want to use calculator again? (yes/no): ");
              String option = scanner.next();

              if (option.equals("yes")) {
                  calci();
              } else {
                  System.out.println("Thank you For Using Calculator");
                  scanner.close();
              }
           
          }
	}


public class Calculator{
	public static void main(String args[]) {
		Calc.calci();
	}
}
	
	


