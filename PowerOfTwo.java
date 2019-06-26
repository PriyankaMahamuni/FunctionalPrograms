/**
 * @purpose  	: Print power of 2.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 17.05.19
 */
package com.bridgeit.FunctionalPrograms;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int No,power=1;
		No=Integer.parseInt(args[0]);
		if(No>0 || No<31)
		{
			for(int i=1;i<=No;i++)
			{
				power=2*power;
				System.out.println("2^"+i+" : "+power+"\n");
			}
		}
		else
		{
			System.out.println("Entered Number exceeds the range of Integer");
		}
	}

}
