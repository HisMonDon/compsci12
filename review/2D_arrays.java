import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);//initializes Scanner
        //Question 1
//___________________________________________________________________________________________________________________________________________________
      
        int [][] randomTenByTen = new int[10][10];
        for(int a = 0; a < 10; a++){//loops through each row
          for(int b = 0; b < 10; b++){//loops through each column
            randomTenByTen [a][b] = (int)(Math.random()*100) + 1; //sets the value of array at index [a][b] a random number between 1 and 100
            System.out.print(randomTenByTen[a][b] + " ");//prints element out
          }
          System.out.println();//starts a new row
        }
      
      //Question 2
        System.out.println("\nQuestion 2\n---------------------------------------------------------------------------------------------------------");
//___________________________________________________________________________________________________________________________________________________
        int[][] fiveByFive = {{16, 22, 99, 4, 18}, {-2, 4, 103, 5, 95}, {117, 6, 15, 2, 45}, {-33, 45, 87, 77, 12}, {32, -33, -6, 91, 56}};//mannually initializes array with the set value giveb
        for(int[] x : fiveByFive){
          int maximumNumber = Integer.MIN_VALUE; //set the maximum to the smallest possible int value, so when we check if a number is bigger, it is always going to be true
          int minimumNumber = Integer.MAX_VALUE; //same logic as the previous line
          int indexCounter = 0;//Since I didnt use a 
          int maxIndex = -1;
          int minIndex = -1;
          for(int y : x){
            if(y < minimumNumber){//checks for minimum number
              minimumNumber = y;//if a number is smaller than the current minimum number, the minimum number becomes that number
              minIndex = indexCounter;//if there is a new minimum number, the new index is tracked
            }
            else if(y > maximumNumber){//checks for maximum number
              maximumNumber = y;//if a number is bigger than the current maximum number, the maximum number becomes that number
              maxIndex = indexCounter;//if there is a new maximum number, the new index is tracked
            }
            System.out.print(y + " "); //prints out the element
            indexCounter ++;//keepys track of index
          }
          System.out.println("\nThe maximum number in this row is " + maximumNumber + " at index " + maxIndex + ".");//prints out max and min numbers
          System.out.println("The minimum number in this row is " + minimumNumber + " at index " + minIndex + ".");
        }
      //Question 3
      //_________________________________________________________________________________________________________________________________________
        System.out.println("\nQuestion 3\n-------------------------------------------------------------------------------------------------------");
        int[][]bowlingScores = new int [5][3];
        for(int x = 0; x < 5; x++){//loops three times for three rounds
          System.out.println("Round " + (x+1) + "\n------------------------------\n"); //prints out the round number e.g. Round 1
          for(int y = 0; y < 3; y++){//loops through each of the 5 players
            System.out.println("Please enter player number " + (y+1) + "'s score.");
            bowlingScores[x][y] = s.nextInt();
          }
        }//after this for loop, all the data has been collected
        //now we want to get the average. the player with the higherst amount of points is the average as well, so the player with the highest average is the winner
        int maxSum = Integer.MIN_VALUE;
        int player_number = 1; //player number starts at 1 (not index)
        int winner_number = -1;
        double [] averageScores = new double[3];
        for(int x = 0; x < 3; x++){
          int currentSum = 0;
          for(int y = 0; y < 5; y++){
            currentSum += bowlingScores[y][x]; //loops through column by column this time, because you are calculating the scores for each player
          }
          if(currentSum > maxSum){
            maxSum = currentSum;//checks for max number, and if it is, then set it as max
            winner_number = player_number;
          }
          player_number++;
          averageScores[x] = ((double)currentSum)/5;//calculates average score of each player, and returns it
        }
        System.out.print("Here are the average scores: \n----------------------------------------------------\n");
        for(int x = 0; x < 3; x++){
          System.out.println("Player number "+ (x+1) + ": "+ averageScores[x]);
        }
        System.out.println("\nThe winner is player number " + winner_number + " with a total score of " + maxSum + "!");

      //Question 4
      //___________________________________________________________________________________________________________________________________
      
        System.out.println("Question 4\n---------------------------------------------------------------------------------------------------------");
        int[][]grid = new int[6][4];
        int[] totalBooks = new int[6];
        for(int x = 0; x < 4; x++){//4 weeks
          for(int y = 0; y < 6; y++){//6 members
            System.out.println("Please enter the number of books borrowed by person number " + (y+1) + " on week number " + (x+1));
            grid[y][x] = s.nextInt(); //takes input
            totalBooks[y] += grid[y][x];//adds the user input to each user's total books borrowed
          }
        }
        int maxNumber = Integer.MIN_VALUE;
        int maxIndex = -1;
        for(int x = 0; x < 6; x++){
          if(totalBooks[x] > maxNumber){
            maxNumber = totalBooks[x];
            maxIndex = x; //checks if the current elemnt has a higher book count than the highest one so far, and if they do, sets the new highest book count to that
          }
        }
        int weekNum = 1;
        System.out.println("Here are the books borrowed by each member on each week: ");
        for(int x = 0; x < 6; x++){
          System.out.println("Member number " + (x+1));
          for(int y = 0; y < 4; y++){
            System.out.print(grid[x][y] + " ");//prints out a string of all the members' scores in their respective order.
          }
          System.out.println();
        }
        System.out.println("Here are the total number of books borrowed by each member: ");
        for(int x : totalBooks){ //iterates through each member's total number of books and prints it out
          System.out.print(x + " ");
        }
        System.out.println("\nThe member who borrowed the most books is member number " + (maxIndex + 1) + " with " + maxNumber + " total books borrowed."); //it is maxIndex + 1 because index starts at 0, not 1
      //_______________________________________________________________________________________________________________________________________
      
        s.close();
    }
}
