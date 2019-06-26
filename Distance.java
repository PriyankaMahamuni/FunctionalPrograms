package com.bridgeit.FunctionalPrograms;


public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X1=0;
		int Y1=0;
		int X2=Integer.parseInt(args[0]);
		int Y2=Integer.parseInt(args[1]);
		if(args[0]=="")
		{
			System.out.println("You don't have enter any number : ");
		}
		else
		{
			int distance=(int) Math.sqrt((Math.pow(X2-X1, 2)+Math.pow(Y2-Y1, 2)));
			System.out.println("Euclidean Distance from point (0,0) to ("+X2+","+Y2+") : "+distance); 
		}
	}

}
