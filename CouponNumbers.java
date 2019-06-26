package com.bridgeit.FunctionalPrograms;
import java.util.*;

public class CouponNumbers {

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
	while(array.size()<no)
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("*** Program  to print total distinct numbers ***");
		System.out.print("Enter No. of Coupons : ");
		no = sc.nextInt();
		CouponNumbers.RandomCoupons(no);
	}

}
