/*Purpose: The program is designed to list first X prime numbers.*/
/*Author: Zhitao Yin*/
/*Email: zyin3@gsu.edu*/
/*Last update: September 12, 2016*/


import java.util.Scanner;//import class Scanner to read input from console

public class Demo3 {
	public static void main(String[] args){
		//final int NUMBER_OF_PRIMES = 100; // Number of primes to display
		//final int NUMBER_OF_PRIMES_PER_LINE = 10; //Display 10 per line
		int count = 0; // Count the number of prime numbers
		int number = 2; // A number to be tested for primeness
		System.out.println("Program starts");// A good programming practice
		
		//Input how many primes number you want to show and assign it to number_of_primes
		Scanner input = new Scanner (System.in);
		System.out.println("Please input a number X to display the first X prime numbers");
		int number_of_primes = input.nextInt();
		
		
		//Input how many prime numbers you want to display per line
		Scanner input2 = new Scanner (System.in);
		System.out.println("Please input a number Y to display Y prime numbers per line");
		int NUMBER_OF_PRIMES_PER_LINE = input2.nextInt();
		
		
		
		
		//Repeatedly find prime numbers
		while (count < number_of_primes){
			
			//Assume the number if prime
			boolean isPrime = true; //Is the current number prime?
			
			// Test whether number is prime
			for (int divisor = 2; divisor <= number/2; divisor++){
				
				if(number % divisor == 0){ //If true, number is not prime
					isPrime = false; //Set isPrime to false
					break;// Exit the for loop
				}
			}
		
			
		//Display the prime number 
		//You may want to use Bollean Operators (e.g., ! && || ), see textbook page 93
		
		
		
		/* Reference Code
		if (isPrime){
			count++;// Increase the count
			//System.out.println(count % NUMBER_OF_PRIMES_PER_LINE);
			if (count % NUMBER_OF_PRIMES_PER_LINE ==0){
				//Display the number and advance to the new line
				
				System.out.println(number);
			}
			else
				System.out.print(number + " ");
		}*/
		//Check if the next number is prime
			
			
		
		//Task1: For the first 100 prime numbers, display those whose last digit is either 9 or 1
			
		//Task2: For the first 100 prime numbers, display those whose last digit is not 3
		
		/*Task3: For the first 100 prime numbers, display all 3-digit numbers whose 
		 *  first digit is greater than 1
		 *  second digit is 7
		 *  last digit is greater than or equal to 3.
		 */
		
			
			
		number++;
		
		}
		
		System.out.println("\nProgram ends");// A good programming practice
	}

}
