/**
 * @purpose  	: Percentage of Head vs Tails
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 17.05.19
 */

package com.bridgeit.FunctionalPrograms;
import java.io.*;
import java.util.Random;
public class FlipCoin{
	 static int flips;
	
	
	public static void main(String args[]) throws IOException
	{
		System.out.println("*** Program to find Percentage of head vs tail ***");
		int flips=Utility.getData();
		int percentage=Utility.calculatePercentage(flips);
		System.out.println("No.of times \t percentage");
		System.out.println("Tail- "+percentage);
		System.out.println("Head- "+(100-percentage));
	}
	
}
