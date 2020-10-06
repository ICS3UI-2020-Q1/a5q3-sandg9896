import java.util.Scanner;
/**
 * take a positive integer and compute the factorial of that integer
 * @ Gavin 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creaate a Scannner for user input
    Scanner input = new Scanner(System.in);
    
    // ask user for number
    System.out.println("Please enter a number");
     int number = input.nextInt();
     
     // variable for total
     int total = 1;
     
     // for loop
     for(int count = 1; count<=number; count++){
      // print the number we are at
      System.out.println(count);
      // to calculate factorial
      total = total * count;
     }
       System.out.println(number + "!" + " = " + total);
     }
   
    
  }

