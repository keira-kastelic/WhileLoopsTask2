import java.util.Random;
import java.util.Scanner;
/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
public class WhileLoopTask2 {
    public static void main(String[] args) {

        System.out.println("Task 1:"); // printing the task
        System.out.println("Enter a secret phrase:"); // prompting the user to enter a phrase
        Scanner user = new Scanner(System.in); // creating a scanner
        String input = user.nextLine(); // reading in the users input
        String phrase = "I ate the last cookie"; // creating a correct phrase
        while (!phrase.equals(input)) { // creating a while loop for if the phrase is not correct
            System.out.println("Try again"); // printing try again
            input = user.nextLine(); // reading in the users new input and updating the variable
        }if (phrase.equals(input));{ // creating an if statement to see if the phrase is correct
            System.out.println("Correct!"); // printing correct
        }

        System.out.println("Task 2"); // printing the task
        String username = "KDSstudent"; // creating a username
        System.out.println("Enter a username:"); // prompting the user
        Scanner name = new Scanner(System.in); // creating a scanner
        String userUsername = name.nextLine(); // reading in the users input
        String password = "KentDenver"; // creating a password
        System.out.println("Enter a password:"); // prompting the user
        Scanner word = new Scanner (System.in); // creating a new scanner
        String userPassword = word.nextLine(); // reading in the users input
        int numTries = 1; // creating a variable to find the tries it takes for the user to enter the correct information
        while ((!userUsername.equals(username) || !userPassword.equals(password)) && numTries < 3) { // creating a while statement for the correct info and less that 3 tries
            System.out.println("Try again:"); // prompting the user
            System.out.println("Enter a username"); // prompting the user
            userUsername = name.nextLine(); // reading in the users input
            System.out.println("Enter a password:"); // prompting the user
            userPassword = word.nextLine(); // reading in the users input
            numTries++; // updating the number of tries it took
        } if (userUsername.equals(username) && userPassword.equals(password)) { // creating an if statement for if the info is correct
            System.out.println("Correct!"); // printing correct
        }

        System.out.println("Task 3 and 4"); // printing the task
        System.out.println("Enter a number. Enter -999 to stop."); // prompting the user
        Scanner num = new Scanner(System.in); // creating a scanner
        int enteredNum = num.nextInt(); // reading in the users input
        int stop = -999; // creating a stop variable
        int count = 0; // creating a count variable for the amount of inputs
        int sum = 0; // creating a sum variable for the numbers entered
        while (enteredNum != stop){ // creating a while statement for if they did not enter stop
            sum += enteredNum; // adding the entered number to the sum
            count ++; // updating the count variable
            System.out.println("Enter a number. Enter -999 to stop."); // prompting the user
            enteredNum = num.nextInt(); // reading in the users new input
        }
        if (count == 0) { // creating an if statement for if they only entered one
            System.out.println("The average is 0"); // printing out the answer
        }else { // creating an else statement for if they enter multiple numbers
            System.out.println("The average is " + (sum/count)); // finding the average and printing it out
        }

        System.out.println("Task 5"); // printing the task
        Random number = new Random(); // creating a random class
        int randomNum = number.nextInt(10)+1; // creating the random number bound from 1 to 10
        System.out.println("Guess a number between 1 and 10"); // prompting the user
        Scanner guess = new Scanner(System.in); // creating a scanner
        int userGuess = guess.nextInt(); // reading in the users input
        int tries = 1; // creating a tries variable
         while(userGuess != randomNum){ // creating a while loop for it the guess is the generated number
            System.out.println("Wrong! Guess again:"); // printing out if it is wrong
            userGuess = guess.nextInt(); // reading in the users new input
            tries++; // updating the amount of tries
        }
        if(userGuess == randomNum){ // creating an if statement for it is the correct number
            System.out.println("Correct! the number was "+ randomNum); // printing out the correct number
            System.out.println("It took you " + tries + " tries"); // printing out the amount of tries
        }
    }
}
