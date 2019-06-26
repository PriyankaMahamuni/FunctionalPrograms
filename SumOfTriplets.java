/**
 * @purpose  	: Print number of distinct triplets as well as the second output is to print the distinct triplets.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 19.05.19
 */

package com.bridgeit.FunctionalPrograms;
import java.util.*;
public class SumOfTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner sc=new Scanner(System.in);	
		System.out.println("*** Program to find no. of distinct triplets whose sum is zero ***");
		System.out.print("Enter No. of elements in array : ");
		size=Utility.getIntger();
		int arr[]=new int[size];
		System.out.println("Enter elements of array :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		Utility.SumOfTriplet(arr, size);
	}

}
