import java.util.Arrays;

public class Week4Assignment {

	public static void main(String[] args) {
		
// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		System.out.println("\n Question 1:");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		
// a. Programmatically subtract the value of the first element in the array from the value in the
// last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		int result = ages[ages.length - 1] - ages[0];
		System.out.println("First item subtracted by the last item is: " + result);
		
// b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
		int[] ages2 = {5, 11, 25, 66, 4, 10, 30, 95, 4};
		
//i. Make sure that there are 9 elements of type int in this new array.
		int results = ages2[ages2.length - 1] - ages2[0];
		
// ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2). 		
		System.out.println("First item subtracted by the last item is: " + results);
		 
// iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).		
		for (int i=0; i < ages.length; i++) {
			System.out.println("New smaller array " + ages[i]);
		}
		for (int i=0; i < ages2.length; i++) {
			System.out.println("New larger array " + ages2[i]);
		}
		
// Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double ageSum = 0;
		for (int age : ages) {
			ageSum += age; 
		}
		double averageAge = ageSum / ages.length;
		System.out.println("The average age is: "+ averageAge);
		
// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		System.out.println("\n Question 2:");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
// a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.	
		double totalLetters = 0;
		for (String name : names) {
			totalLetters += name.length();
		}
		double averageLetters = totalLetters / names.length;
		System.out.println("Average Letters per Name: " + averageLetters);
		
// b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.		
		StringBuilder comboNames = new StringBuilder();
		for (String name : names) {
			comboNames.append(name).append(" ");
		}
		System.out.println(comboNames);
		
		System.out.println("\n Question 3:");
		System.out.println("You can use the length of the array minus 1." + " " + " EX ages[ages.lentgh - 1].");
		
		System.out.println("\n Question 4:");
		System.out.println("You can use the array index of 0." + " " + "EX ages[0].");
		
// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		System.out.println("\n Question 5:");
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println("\n Question 6:");
		int sumOfNameLengths = 0;
		for (int length : nameLengths) {
			sumOfNameLengths += length;
		}
		System.out.println("Sum of the elements is: " + sumOfNameLengths);

// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println("\n Question 7:");
		String threeWords = multiWord("Hello", 3);
		System.out.println("The following word is duplicated: " + threeWords);
		
// 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.println("\n Question 8:");
		String fullName = createFullName("Roscoe", "Camp");
		System.out.println("Full Name: " + fullName);
		
// 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("\n Question 9:");
		int[] sum = {28, 13, 20, 99, 4, 25, 7};
		boolean sumResult = isSumGreaterThan100(sum);
		System.out.println("Is Sum Greater Than 100? " + sumResult);
		
// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		System.out.println("\n Question 10:");
		double[] doubleArray = {10.5, 20.5, 30.5, 9.8};
		double averageDouble = calculateAverage(doubleArray);
		System.out.println("Average of Double Array: " + averageDouble);
		
// 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		System.out.println("\n Question 12:");
		double[] firstArray = {15.5, 25.5, 35.5};
		double[] secondArray = {10.5, 20.5, 30.5};
		boolean resultComparison = compareAverages(firstArray, secondArray);
		System.out.println("Is Average of First Array Greater? " + resultComparison);
		
// 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("\n Question 12:");
		boolean isHotOutside = true;
		double moneyInPocket = 16.20;
		boolean willBuy = willBuyDrink(true, 15.75);
		System.out.println("Will I buy a drink? " + willBuy);
				
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
// Creating this method to help sort the multitude of comics that I have in order to keep track of everything.		
		System.out.println("\n Question 13:");
		String[] comics = {"Amazing Spider-Man", "Cyberpunk", "Venom", "Sonic the Hedgehog", "Starboy"};
		sortNames(comics);
		System.out.println(Arrays.toString(comics));
		

		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}
private static void sortNames(String[] comics) {
	Arrays.sort(comics);
		// TODO Auto-generated method stub
		
	}
private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		// TODO Auto-generated method stub
	return isHotOutside && moneyInPocket > 10.50;
	}
private static boolean compareAverages(double[] firstArray, double[] secondArray) {
	return calculateAverage(firstArray) > calculateAverage(secondArray);
		// TODO Auto-generated method stub
		
	}
private static double calculateAverage(double[] array) {
	double sum = 0;
	for (double num : array) {
		sum += num;
	}
	// TODO Auto-generated method stub
	return sum / array.length;
	
	}
private static boolean isSumGreaterThan100(int[] num) {
	int sum = 0;
	for (int number : num) {
		sum += number;
	}
		// TODO Auto-generated method stub
		return sum > 100;
	}
private static String createFullName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return firstName + " " + lastName;
	}
// Created for Question 7
	private static String multiWord(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
			
		}
		return result;
		
	}

}
