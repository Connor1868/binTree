/*
 * Name: Connor Widder
 * Class: Object Oriented Programming CS3354
 * Assignment: Homework 1 - Binary tree and Prime numbers
 */
package prime;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;  


public class primeNumber {
	
	public static void main(String[] args) throws IOException {
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter a output file filepath: ");
	       String filePath = scanner.nextLine();
	       System.out.print("Enter a number: ");
	       int n = scanner.nextInt();
	       primeNumber primes = new primeNumber();
	       primes.primes(n, filePath);
	       
	   }
	/**
	 * 
	 * @param n: find prime numbers up to this (n) integer.
	 * @param filePath: location of where the output file is to be written.
	 * @throws IOException
	 */
	public void primes(int n, String filePath) throws IOException{
		
		//Name file
		File file = new File(filePath + "/PrimeNumbers<Widder>.txt");  
	    // creates the file
	    file.createNewFile();
	    // creates a FileWriter Object
	    FileWriter writer = new FileWriter(file); 
	    writer.write("Prime Numbers:");
		
		boolean[] primes = new boolean[n+1];		//Array to hold prime numbers
		for (int i = 2; i <primes.length; i++) {	//Fill Array with prime true value
			primes[i] = true;
		}
		int num = 2;
		
		
		while (true) {
	           for (int i = 2;; i++) {
	               int multiple = num * i;
	               if (multiple > n) {
	                   break;
	               } else {
	                   primes[multiple] = false;
	               }
	           }
	           boolean nextNumFound = false;
	           for (int i = num + 1; i < n + 1; i++) {
	               if (primes[i]) {
	                   num = i;
	                   nextNumFound = true;
	                   break;
	               }
	           }
	           if (!nextNumFound) {
	               break;
	           }
	       }
		for (int i = 0; i < primes.length; i++) {
	           if (primes[i]) {
	               System.out.println(i);   
	               writer.write("\n" + i);
	           }
	       }
		writer.close();
	}  
}