  import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in); //initializes scanner

//______________________________________________________________________________
//Question 1
//Part a)

        int numberOfStudents = 10; //easier and safer to store fixed numbers in variables
        int grade; //will store current grade when asking for grade
        int [] grades = new int [numberOfStudents]; //initializes an array with size 10
        for(int x = 0; x < numberOfStudents; x++){//loops 10 times to ask user 10 times
            System.out.println("Please enter student number " + (x + 1) + "'s grade.");
            grade = s.nextInt();
            grades[x] = grade; //sets grade's xth index to the current grade the user inputted
        }
        System.out.println("Here are the grades printed forward: "); //print out and call methods
        outputForward(grades);
        System.out.println("Here are the grades printed backwards");
        outputBackwards(grades);
        //Part b
        System.out.println("The average grade is "+determineAverage(grades) + "."); //call method

//____________________________________________________________________________________
        //Question 2
        //use math.random() to generate a double between 0 and 1
        int numberOfElements = 100; //easier and safer to store fixed numbers in variables
        int [] randomIntegers = new int[numberOfElements];
        int randomInteger;
        for(int x = 0; x < randomIntegers.length; x++){
            randomInteger = obtainRandomInteger(100); //set this variable to a random integer so you dont have to call the method twice when adding it to list and printing it out
            randomIntegers[x] = randomInteger;
            System.out.println("Index " + x + " had the number " + randomInteger);
        }
//________________________________________________________________________________________
        //Question 3
        long numberToFactorial;//factorials can result in huge numbers which need to be processed using long or BigNumber
        System.out.println("Please enter a number to get it's factorial.");
        while(true){
          
            numberToFactorial = s.nextLong();
            if(numberToFactorial >= 0){//if its not negative we can continue
                break;
            }
            System.out.println("Negative numbers are disallowed! Please enter a new number."); //if number is negative, tell user that negatives arent allowed, and loop back and ask for a new number
        }
        System.out.println("The factorial of " + numberToFactorial + " is " + factorial(numberToFactorial));//prints out result
//_______________________________________________________________________________________
      //Question 4
        System.out.println("How many times would you like to generate?");
        int numberOfTimes = s.nextInt();//asks number of times to generate
        int range = 200;
        for(int x = 0; x < numberOfTimes; x++){
          //I will call the method I made in question 2, becuase I already implemented a set range limit for it.
          int newNumber = obtainRandomInteger(range); //generates number from 1 to the range
          System.out.print("The number generated is " + newNumber + ". ");
          if(isEven(newNumber)){ //if its even, then console says its even
            System.out.print("This number is even.\n");
          } else{
            System.out.print("This number is odd.\n"); //else if its not, console says its odd
          }
        }
        s.close();
    }


  
//________________________________________________________________________________________


  
    //METHODS

    //Question 1
    //Part a
    public static void outputForward(int[] myList){
        for(int i : myList){
            System.out.println(i); // iterates through each element i in myList forward, and prints it out
        }
    }
    public static void outputBackwards(int[] myList){
        for(int x = myList.length - 1; x >= 0; x--){ //starts at the list's end and goes backwards
            System.out.println(myList[x]);
        }
    }

    //Part b
    public static double determineAverage(int[] myList){
        int sum = 0;
        for(int x : myList){
            sum += x; //loops through each element, and adds it to the total score
        }
        return (double)sum /(myList.length); //average = total / number of elements, also remember to cast sum as a double first, or it will be rounded, and then turned into a double, which will always end in .0 (not correct)
    }
    //______________________________________________________________________________________
    //Question 2
    public static int obtainRandomInteger(int range){//in this case our range would be from 1 to 100
        return(int)((Math.random()) * range + 1); //generates random number from 1 - 100: math.random generates number from 0 (inclusive) to 1 (exclusive), multiplying by range (100) generates from 0 to 100.0(exclusive), and adding one generates from 1 to 101.0 (exclusive), so when you put (int), it removes the 101, because the largest number possible would be 100.999..., and casting this to an integer rounds down, making the max number 100.
    }
    //______________________________________________________________________________________
    //Question 3
    public static long factorial(long numberToFactorial){
        long result = 1;
        for(long x = numberToFactorial; x >= 2; x--){//goes backwards, but you can also start from 2 and go upwards
            result *= x;
        }
        return result;
    }
//________________________________________________________________________________________
  //Question 4
  public static boolean isEven(int number){
    return number % 2 == 0; //all even numbers are divisible by 0
  }
}
