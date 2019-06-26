
/**
 * @purpose  	: Print harmonic number.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 17.05.19
 */
package com.bridgeit.FunctionalPrograms;
import java.io.IOException;
import java.util.*;
public class HarmonicNumber {
	int Nvalue;
	float HarmonicValue;
	HarmonicNumber()
	{
		Nvalue=0;
		HarmonicValue=0;
	}
	public void InputData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nth Number to print Harmonic Value : ");
		Nvalue=sc.nextInt();
	}
	public void DisplayHarmonicValue()
	{
		if(Nvalue!=0 || Nvalue>0)
		{
			for(int i=1;i<=Nvalue;i++)
			{
				
				HarmonicValue +=((float)1/i);
				System.out.print("1/"+i+"+");
			}
			System.out.println("\nHarmonic Value of "+Nvalue+"th :"+HarmonicValue);
		}
		else
		{
			System.out.println("Please Enter value grether than 0 ");
			InputData();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("*** Progrm to Print Nth Harmonic Value ***");
		HarmonicNumber obj=new HarmonicNumber();
		obj.InputData();
		obj.DisplayHarmonicValue();
	}
	
}
