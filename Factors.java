package com.bridgeit.FunctionalPrograms;
import java.util.*;
public class Factors {
	int num;
	Factors()
	{
		num=0;
	}
	public void getData()
	{
		Scanner scannerObj=new Scanner(System.in);
		System.out.println("Enter Number to Find Primes Factors : ");
		num=scannerObj.nextInt();
	}
	public void primeFactors() 
	{
		System.out.print("Prime Factors : ");
		for(int i=2;i<num;i++)
		{
			while(num%i==0)
			{
				System.out.print("\t"+i);
				num=num/i;
			}
		}
		if(num>2)
		{
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factors factorObj=new Factors();
		factorObj.getData();
		factorObj.primeFactors();
	}

}
