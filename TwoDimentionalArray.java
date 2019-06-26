/**
 * @purpose  	: Print function to print 2 Dimensional Array.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 19.05.19
 */
package com.bridgeit.FunctionalPrograms;
import java.io.PrintWriter;
import java.util.*;
import java.io.*;
public class TwoDimentionalArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("*** Printing 2D Integer, Double or Boolean Arrays ***");
		System.out.print("*** Printing 2D Integer, Double or Boolean Arrays ***");
		int row=Utility.getRow();
		int column=Utility.getColumn();
		Utility.integerArray(row, column);
		Utility.doubleArray(row, column);
		Utility.booleanArray(row, column);
	}

}
