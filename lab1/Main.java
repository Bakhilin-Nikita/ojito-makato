package itmo.prog;

import java.lang.Math.*;
import java.util.Arrays;

public class Main {
	
	public static strictfp void main (String[] args) {
		int[] a = new int[8];
		int c = 0;
		for(int i = 15; i > 0; i--){
			if((i % 2) > 0)
				a[c++] = i;
		}
		
		double[] x = new double[17];
		for(int i = 0; i < 17; i++)
			x[i] = -3 + (Math.random()*((10-(-3))+1));
		System.out.println(Arrays.toString(x));

		float[][] l = new float[8][17];
		
		for(int i = 0; i < l.length; i++){
			for(int j = 0; j < l[i].length; j++) {
				if(i == 5) 
					l[i][j] = (float) Math.pow((2 * (Math.pow(Math.E,Math.cbrt(j)) - (3/4))), Math.pow((Math.pow(j, j - 1) / 3), 2 ));
				 else if(i == 1 || i == 3 || i == 13 || i == 15 ) 
					l[i][j] = (float) Math.pow(0.5 / (Math.pow((0.25 * Math.log10(Math.abs(j))), 2) - 1), 3);
			}
		}		
		
		for(int i = 0; i < l.length; i++) {
			for(int j = 0; j < l[i].length; j++) {
				System.out.print(l[i][j]);
			}
			System.out.println();
		}
	}
}
