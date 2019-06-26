package com.bridgeit.FunctionalPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static int year, row,column;;
	static int number;
	static int $stake,$goal,$no,cash,loss,win,choice;
	static long  start=0,stop=0,now,after;
	static int a,b,c,root1,root2;
/*****************************************************************************************************

 *  @method 		: replacingName
 *  @description 	: this will replace <<username>> with user provided name
 * 	@Param			: none
 * 	@return 		: none
 
 *****************************************************************************************************/
	public static void replacingName()
	{
		String name;
		int length;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter UserName : ");
		name=sc.nextLine();
		length=name.length();
		if(length<3 || name.contains(" "))
		{
			System.out.println("Note : must Contain at least three characters  and does not contain space");
			replacingName();
		}
		else
		{
			String str="Hello UserName,How are you?";
			System.out.println("Orignal String : "+"\""+str+"\"");
			System.out.println("Replace String : "+"\""+str.replaceAll("UserName", name)+"\"");
		}
	}
	/*****************************************************************************************************

	 *  @method 		: getData and calculatePercentage
	 *  @description 	: this will take no. of flips and calculate percentage 
	 * 	@Param			: flips
	 * 	@return 		: percentage
	 
	 *****************************************************************************************************/
	/* desc : it will take no. of flips */
	public static int getData() throws IOException
	{
		int flips;
		BufferedReader  bufferObj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of times you Flip Coin : ");
		flips=Integer.parseInt(bufferObj.readLine());
		if(flips<0)
		{
			System.out.println("Number should be a positive value : ");
			getData();
		}
		else
		{
			System.out.println("Flip Coin till ("+flips+") : ");
		}
		return flips;
	}
	/* desc : it will return percentage of head*/
	public static int calculatePercentage(int flips)
	{
		float hit;
		int count=0,count1=0,percentage;
		float tail=0.0f;
		for(int i=1;i<=flips;i++)
		{
			hit=(float) Math.random();
			if(hit<0.5)
			{
				count++;
				
				
			}
			else
			{
				count1++;
				
			}
		}
		percentage=(int) Math.ceil(count*100/flips);
		
		return percentage;
		
	}
	
	/*****************************************************************************************************

	 *  @method 		: getYear and checkleapYear
	 *  @description 	: this will check year is leap year or not 
	 * 	@Param			: none
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	
	
	public static void getYear()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year(yyyy) : ");
		year=sc.nextInt();
	}
	public static void checkleapYear()
	{
		int digit=year,count=0;
		while(digit!=0)
		{
			digit=digit/10;
			++count;
		}
		while(count<4 || count>4)
		{
			System.out.println("Year must contain 4-digits");
			getYear();
		}
		if((year%4)==0)
		{
			System.out.println(year+" is Leap year");
		}
		else
		{
			System.out.println(year+"is not a Leap year");
		}
	}
	/*****************************************************************************************************

	 *  @method 		: getNumber and primeFactors
	 *  @description 	: it will calculate prime factors of number 
	 * 	@Param			: none
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	/* desc : to take positive number */
	public static void getNumber()
	{
		Scanner scannerObj=new Scanner(System.in);
		System.out.println("Enter Number to Find Primes Factors : ");
		do
		{
			number=scannerObj.nextInt();
		}while(number>0);
	}
	/* desc : to calculate prime factors of number */
	public static void primeFactors() 
	{
		System.out.print("Prime Factors : ");
		for(int i=2;i<number;i++)
		{
			while(number%i==0)
			{
				System.out.print("\t"+i);
				number=number/i;
			}
		}
		if(number>2)
		{
			System.out.println(number);
		}
	}
	
	/*****************************************************************************************************

	 *  @method 		: getInput and plays
	 *  @description 	: it will take input of initial amount,goal amount,no. of possibilities 
	 * 	@Param			: none
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	/* desc : this will take input from user */
	public static void getInput() {
		// TODO Auto-generated method stub

		Scanner scannerObj=new Scanner(System.in);
		System.out.print("Enter Initial Money for bet : ");
		$stake=scannerObj.nextInt();
		System.out.print("Enter Goal Money you want to win : ");
		$goal=scannerObj.nextInt();
		System.out.print("Enter No.of times you want to play : ");
		$no=scannerObj.nextInt();
	}

	public static void play()
	{
		int i;
		cash=$stake;
		for(i=1;i<=$no;i++)
		{
			if((cash>0) || (cash<$goal))
			{
				float turn=(float)Math.random();
				System.out.println(turn);
				if(turn<0.5)
				{
					loss++;
					cash=cash-$stake;
					System.out.println("Play : "+i);
					System.out.println("game status : Loss");
					System.out.println("You loss cash : "+cash);
					System.out.println("Better Luck next time... ");
				}
				else
				{
					win++;
					cash=cash+$stake;
					System.out.println("Play : "+i);
					System.out.println("game status : Win");
					System.out.println("You win cash  : "+cash);
				}
			}
			if(cash==0 || (cash==$goal))
			{
				break;
			}
		}
		System.out.println("Total No. of Chance you have played : "+ i);
		System.out.println("Total No. of Chances you Loss : "+loss+" "+((float)(loss*100)/$no)+"% Chance to Loss game");
		System.out.println("Total No. of Chances you Win  : "+win+" "+((float)(win*100)/$no)+"% chance to win game");
		
	}
	
	
	
	
	/*****************************************************************************************************

	 *  @method 		: getNumber and primeFactors
	 *  @description 	: it will calculate prime factors of number 
	 * 	@Param			: none
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void RandomCoupons(int no) {
		/*
		 * Random ran=new Random(); int arr[]=new int[no]; int brr[]=new int[no]; int
		 * count=0; System.out.println("Coupons : "); for(int i=0;i<no;i++) {
		 * arr[i]=ran.nextInt(50); System.out.println(arr[i]); }
		 * System.out.println("Visited Coupons : "); for(int
		 * distinct=0;distinct<no;distinct++) { int num=ran.nextInt(arr.length);
		 * brr[distinct]=num; System.out.println(brr[distinct]); }
		 * System.out.println("Repeated Coupons : "); int repeat=brr.length;
		 * System.out.println("Repeated : "+repeat+"\n"); int n=brr.length; for(int
		 * i=0;i<n-1;i++) { for(int j=i+1;j<n;j++) { if(brr[i]==brr[j]) {
		 * brr[j]=brr[n-1]; n--; }
		 * 
		 * }
		 
	}*/
		int count=0;
		List<Integer> array=new ArrayList<>();
		Random r=new Random();
		while(array.size()< no)
		{
			int random=r.nextInt(1000);
			count++;
			if(!(array.contains(random)))
			{
				array.add(random);
			}
		}
		// System.out.println("\nTotal No. of Distinct Coupons :"+(repeat));
		System.out.println("\nTotal No. of Distinct Coupons :"+no);
		System.out.println("Distinct Elements : "+count);
	
		for(int i = 0;i<array.size();i++)
		{
			System.out.println(array.get(i));
		}

	}

	
	public static int getIntger()
	{
		Scanner scannerObj=new Scanner(System.in);
		do
		{
			number=scannerObj.nextInt();
		}while(number<0);
		return number;
	}
	
	/*****************************************************************************************************

	 *  @method 		: integerArray,doubleAray,booleanArray
	 *  @description 	: it will  print 2 Dimensional Array. 
	 * 	@Param			: rows,columns
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	
	public static int getRow()
	{
		System.out.print("\nEnter No. of Rows : ");
		row=Utility.getIntger();
		return row;
	}
	public static int getColumn()
	{
		System.out.println("Enter No. of Columns : ");
		column=getIntger();
		return column;
	}
	/* desc : it will print integer array*/
	public static void integerArray(int m, int n)
	{
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out,true);
		int arr[][]=new int[m][n];
		System.out.println("Enter Integer type of  elements in array : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Integer Array : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(arr[i][j]+"\t");
			}
			pw.println();
			
		}
	}
	/*desc : it will print double array */
	public static void doubleArray(int m, int n)
	{
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out,true);
		double drr[][]=new double[m][n];
		System.out.println("Enter Double type of  elements in array : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				drr[i][j]=sc.nextDouble();
			}
		}
		System.out.println("Double  Array : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(drr[i][j]+"\t");
			}
			pw.println();
			
		}
	}
	/* desc : it will print boolean array */
	public static void booleanArray(int m, int n)
	{
		Scanner sc=new Scanner(System.in);
		PrintWriter pw=new PrintWriter(System.out,true);
		boolean  brr[][]=new boolean[m][n];
		System.out.println("Enter Boolean type of elements in array : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				brr[i][j]=sc.nextBoolean();
			}
		}
		System.out.println("Boolean Array : ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(brr[i][j]+"\t");
			}
			pw.println();
			
		}
	}


	/*****************************************************************************************************

	 *  @method 		: 
	 *  @description 	: it will print number of distinct triplets as well as the second output is to print the distinct triplets. 
	 * 	@Param			: none
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static  void SumOfTriplet(int arr[],int n) {
		//remove duplicates from array
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=arr[n-1];
					n--;
				}
				
			}
		}
		System.out.println("removing duplicate elements : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		int count=0;
		System.out.println("Triplets : ");
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((arr[i]+arr[j]+arr[k])==0)
					{
						System.out.print(arr[i]+","+arr[j]+","+arr[k]+"\n");
						count++;
					}
				}
			}
		}
		System.out.println("Total No. of Triplets : "+count);
	}
	
	/*****************************************************************************************************

	 *  @method 		: start,stop and calcilateTime
	 *  @description 	: it will print elapsed time 
	 * 	@Param			: none
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static long start()
	{
		 return start=System.currentTimeMillis();
	}
	public static long stop()
	{
		 return stop=System.currentTimeMillis();
	}
	public static void calculateTime()
	{
		System.out.println("Menu :\n1. start\n2. stop \n3. exit");
		System.out.println("Enter your choise  : ");
		choice=Utility.getIntger();
		switch(choice)
		{
			case 1:	now=Utility.start();
					System.out.println("Start : "+now+"ms");
					break;
			case 2: if(now!=0)
					{
						after=Utility.stop();
						System.out.println("Stop : "+after+"ms");
						long difference=(after-now);
						long mili=difference%1000;
						long second=(difference-mili)/1000;
						System.out.println("difference : "+second+"s");
					}
					else
					{
						System.out.println("You first start watch");
						System.out.println("Stooped time : "+0+"ms");
					}
					break;
			case 3: break;
			default: System.out.println("Invalid Choise");
		}
				
	}

	/*****************************************************************************************************

	 *  @method 		: input and roots
	 *  @description 	: it will display roots of quadratic equation 
	 * 	@Param			: none
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void input()
	{
		
		System.out.print("Enter value of coefficient of X^2  : ");
		a=getIntger();
		System.out.print("\nEnter value of coefficient of X : ");
		b=getIntger();
		System.out.print("\nEnter value of Constant : ");
		c=getIntger();
	}
	public static void roots()
	{
		if(a==0)
		{
			System.out.println("Value of coefficient if X^2 must be grether than 0 ");
			System.out.print("Enter value : ");
			a=getIntger();
		}
		int z=(int)((Math.pow(b, 2)-(4*a*c)));
		root1=(int) (-b+Math.sqrt((z)/(2*a)));
		root2=(int) ((-b-Math.sqrt(z))/(2*a));
		
		System.out.println("Root 1 : "+root1);
		System.out.println("Root 2 : "+root2);
	}
}
