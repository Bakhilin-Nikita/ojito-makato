package ru.itmo.prog.Lab1;

import static java.lang.Math.*;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args)
	{
		ex();
	}

	static void ex()
	{
		//1
		int[] a = new int[]{16,15,14,13,12,11,10,9,8,7,6,5};
		
		//2
		double[] x = new double[19];
		double min = -8.0;
		double max = 4.0;
		double range = max - min + 1;

		for(int i = 0; i < x.length; i++)
			x[i] = (Math.random() * range) + min;

		for(int i = 0; i < x.length; i++)
			System.out.println(x[i]);

		//3
		int len1 = 12;
		int len2 = 19;
		double[][] a2 = new double[len1][len2];	
		for(int i = 0; i < a2.length; i++)
			for (int j = 0; j < a2[i].length; j++)
				if(a[i] == 15)
					a2[i][j] = tan(pow(4 * atan(x[j] - 2 / 12) ,asin(x[j] - 2 / 12)));
				else if(a[i] == 6 || a[i] == 8 || a[i] == 10 || a[i] == 13 || a[i] == 14 || a[i] == 16)
					a2[i][j] = pow(E, pow(0.25 * cos(x[j]) , pow(E, x[j])));	
				else 
					a2[i][j] = 2 * cos(pow(2 / (sin(x[j]) - 4) , pow(E, x[j])));

		for(int i = 0; i < a2.length; i++)
			for(int j = 0; j < a2[i].length; j++)
				System.out.printf("%.2f",a2[i][j]);
	}
}
