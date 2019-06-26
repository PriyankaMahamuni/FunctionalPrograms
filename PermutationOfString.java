/**
 * @purpose  	: Permutation of string.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 19.05.19
 */
package com.bridgeit.FunctionalPrograms;
import java.util.*;
public class PermutationOfString {

	public void permuteString(String str,int start,int end)
	{
		if(start==end)
		{
			System.out.println(str);
		}
		else {
			for(int i=start;i<=end;i++)
			{
				//System.out.println("First String : "+str);
				str=swap(str,start,i);
				//System.out.println(" Second String : "+str);
				permuteString(str,start+1,end);
			}
			
		}
	}
	
	public String swap(String str,int start,int end)
	{
		char ch;
		char[]string=str.toCharArray();
		ch=string[start];
		string[start]=string[end];
		string[end]=ch;
		return String.valueOf(string);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter String for Permutation : ");
		str=sc.nextLine();
		PermutationOfString obj=new PermutationOfString();
		int n=str.length();
		obj.permuteString(str,0,n-1);
	}

}
