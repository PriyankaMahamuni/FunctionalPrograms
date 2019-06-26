package com.bridgeit.FunctionalPrograms;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temp,vspeed;
		double wind;
		temp=Double.parseDouble(args[0]);
		vspeed=Double.parseDouble(args[1]);
		if(temp<50 || vspeed<120 || vspeed>3)
		{
			wind=35.74+(0.6215*temp)+(((0.4275*temp)-35.75)*Math.pow(vspeed,0.16));
			System.out.println("Wind Chill : "+wind);
		}
		else
		{
			System.out.println("Wind can not be determined ");
		}
	}

}
