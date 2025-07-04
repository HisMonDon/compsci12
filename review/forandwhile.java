import java.util.Scanner;

//Excellent work!
public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      //1. (a) Ask the user their name and the user to specify the number of outputs. Print out their name that number of times
      System.out.println("Please enter your name."); 
      String name = s.nextLine();
      System.out.println("How many times?"); 
      int times = s.nextInt();
      for(int x = 0; x < times; x++){
        System.out.println(name);
      }
      //2.(a) Output the times-tables (from 1 to 12) for whichever number the user requests
      System.out.println("What number would you like to use?");
      int usedNumber = s.nextInt();
      for(int x = 1; x <= 12; x++){
        System.out.println(x + " x " + usedNumber + " = " + x*usedNumber);
      }
      //3.(a) Write a program which will ask the user how many symbols to output, and then output that many lines of symbols (one symbol on each line)
      System.out.print("How many symbols would you like to output? ");
      int number = s.nextInt();
      for(int x = 0; x < number; x++){
        System.out.println("*");
      }
      //1. (a) Write a program that asks the user to enter an integer value. Count how many numbers the user enters. End the program when the user enters zero. Do not count zero. Tell the user the result. In addition to counting how many numbers were entered, also keep track of how many above zero and below zero. Also, keep track of how many numbers are even and how many numbers are odd
      int value = 1;
      int belowZero = 0;
      int aboveZero = 0;
      int numberOfEvens = 0;
      int numberOfOdds = 0;
      while(true){
        System.out.println("Enter a value: ");
        value = s.nextInt();
        if (value == 0){
          break;
        }
        if(value > 0){
          belowZero ++;
        } else{
          aboveZero ++;
        }
        if(value % 2 == 0){
          numberOfEvens ++;
        } else {
          numberOfOdds ++;
        }
      }
      System.out.println("Number of numbers below zero: " + belowZero + "\nNumber of numbers above zero: " + aboveZero + "\nNumber of even numbbers: " + numberOfEvens + "\nNumber of odd numbers: " + numberOfOdds);
      //2. (a) Write a program that acts like a cash register. The user can keep entering values, and you will add those values together, reporting the new total each time. You will need some way to end your program. One good way to end your program would be to tell the user to enter a particular value when they are done (for example, -1 should not be a valid price). This is called the "sentinel" value. Once they enter the sentinel value, you should add 13% tax. Display the subtotal (price before tax), the amount of tax, and the total value
      double totalValue = 0.0;
      double tax = 0.13;
      double valueOfProduct;
      System.out.println("Welcome to Chenyu's shop! Please enter your values (Enter -1 to stop)");
      while (true){
        valueOfProduct = s.nextDouble();
        if(valueOfProduct == -1){
          break;
        } else if (valueOfProduct < 0){
          System.out.println("That is not a valid price! Please try again");
          continue;
        }
        totalValue += valueOfProduct;
        System.out.println("Thanks! Next product price please!");
      }
      System.out.println("Subtotal: " + totalValue + "\nAmount of tax: " + tax*100 + "\nFinal Price: " + totalValue*(1+tax));
      //3. Write a program to simulate people running the 100m dash. Prompt the user for the number of runners in each race. Using a loop, get the time for each of the runners. Once all runners have been entered, display the winning(fastest) time, and the average time
      double totalTime = 0.0;
      double winningTime = Double.MAX_VALUE;
      double currentTime = 0.0;
      System.out.println("Welcome to race simulator! Please enter the number of players.");
      int numberOfPlayers = s.nextInt();
      for(int x = 1; x <= numberOfPlayers; x++){
        System.out.println("Please enter the time for player number " + x + ".");
        currentTime = s.nextDouble();
        if(currentTime < winningTime){
          winningTime = currentTime;
        }
        totalTime += currentTime;
      }
      System.out.printf("Here are the results!\nWinning Time: %.2f \n Average Time: %.2f", winningTime, (totalTime / numberOfPlayers)); // round all values to 2 decimal places

      
      s.close();
    }
}
